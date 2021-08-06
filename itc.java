/* consumer producer*/

import java.io.*;

class Buffer
	{
	int a;
	boolean produced=false;
	public synchronized void produce(int x)
		{
		if(produced)
			{
			System.out.println("Producer is waiting");
			try
				{wait();}

			catch(Exception e)
				{System.out.println(e);}
			}
		a=x;
		System.out.println("Product"+a+ "is produced");
		produced=true;
		notify();
		}
	public synchronized void consume()
		{
		if(!produced)
			{
			System.out.println("consumer is waiting");
			try
				{wait();}

			catch(Exception e)
				{System.out.println(e);}
			}
		System.out.println("Product"+a+ "is consumed");
		produced=false;
		notify();
		}
	}
class producer extends Thread
	{
	Buffer b;
	public producer(Buffer b)
		{ this.b=b;}
	public void run()
		{
		System.out.println("Producer start producing");
		for(int i =1;i<=10;i++)
			b.produce(i);
		}
	}
class consumer extends Thread
	{
	Buffer b;
	public consumer(Buffer b)
		{ this.b=b;}
	public void run()
		{
		System.out.println("Consumer start consuming");
		for(int i =1;i<=10;i++)
			b.consume();
		}
	}


public class itc
	{
	public static void main(String []args) 
		{
 		Buffer b = new Buffer();
		producer p = new producer(b);
		consumer c= new consumer(b);
		p.start();
		c.start();
		}
	}

			
