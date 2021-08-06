/* runnable interface*/

import java.io.*;

class fibo implements Runnable
	{
	int a=0,b=1,c;
	public void run()
		{
		System.out.println("Thread fibo:"+a);
		System.out.println("Thread fibo:"+b);
		for(int i=3;i<=10;i++)
			{
			c=a+b;
			a=b;
			b=c;
			System.out.println("Thread fibo:"+c);
			}		
		System.out.println("end of fibo");
		}
	}
class even implements Runnable
	{
	public void run()
		{
		for(int i=2;i<=10;i++)
			System.out.println("Thread even:"+i);		
		System.out.println("end of even");
		}
	}
class thread2
	{
	public static void main(String []args)
		{
		fibo f= new fibo();
		even e =new even();
		Thread t1= new Thread(f);
		Thread t2= new Thread(e);
		t1.start();
		t2.start();
		}
	}