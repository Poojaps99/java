import java.io.*;
import java.net.*;	
class udpserver												
	{
	public static void main(String a[]) throws IOException
		{
		DatagramSocket  serversocket=new DatagramSocket(5000);				
		byte[] receivedata =new byte[1024];
		byte[] senddata =new byte[1024];
		while(true)
			{
			DatagramPacket receivepacket=new DatagramPacket(receivedata,receivedata.length);
			serversocket.receive(receivepacket);
			String sentence=new String(receivepacket.getData());
			InetAddress ipaddress =receivepacket.getAddress();
			int port=receivepacket.getPort();
			String capital=sentence.toUpperCase();
			System.out.println(capital);
			senddata=capital.getBytes();
			DatagramPacket sendpacket=new DatagramPacket(senddata,senddata.length,ipaddress,port);
			serversocket.send(sendpacket);
			}
		}
	}	