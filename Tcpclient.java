import java.io.*;
import java.net.*;
class Tcpclient
	{
	public static void main(String []args) throws IOException
		{
		String s,ms;
		BufferedReader infromuser = new BufferedReader(new InputStreamReader(System.in));
System.out.println("hai");		
		Socket clientsocket = new Socket("127.0.0.1",5000);
		DataOutputStream outtoserver= new DataOutputStream(clientsocket.getOutputStream());
		System.out.println("\n enter a string:");
		s=infromuser.readLine();
		outtoserver.writeBytes(s+'\n');
		BufferedReader infromserver = new BufferedReader(new InputStreamReader(clientsocket.getInputStream()));
		ms=infromserver.readLine();
		System.out.println("From server:"+ms);
		clientsocket.close();
		}
	}