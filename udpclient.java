import java.io.*;
import java.net.*;	
class udpclient											
	{
	public static void main(String a[]) throws IOException
		{
		BufferedReader infromuser = new BufferedReader (new InputStreamReader(System.in));
		DatagramSocket clientsocket = new DatagramSocket();
		InetAddress ipaddress = InetAddress.getByName("127.0.0.1");
		byte[] receivedata =new byte[1024];
		byte[] senddata =new byte[1024];
		System.out.println("\n enter a string:");
		String str= infromuser.readLine();
		senddata= str.getBytes();
		DatagramPacket sendpacket = new DatagramPacket (senddata,senddata.length,ipaddress,5000);
		clientsocket.send(sendpacket);
		DatagramPacket receivepacket = new DatagramPacket (receivedata,receivedata.length);
		clientsocket.receive(receivepacket);
		String modified = new String(receivepacket.getData());
		System.out.println("from Server"+modified);
		clientsocket.close();
	}
}	
