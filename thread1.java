/* thread class*/

import java.io.*;

class table extends Thread
	{
	public void run()
		{
		for(int i=1;i<=10;i++)
			System.out.println("5 x "+i+" = "+(5*i));
		}
	}
class prime extends Thread
	{
	public void run()
		{
		int flag=0;
		for(int i=2;i<=10;i++)
			{
			flag=0;
			for(int j=2;j<=i/2;j++)
				{
				if(i%j==0)
					{
					flag=1;
					break;
					}
				}
				if(flag==0)
					System.out.println(i +" is prime");
			}	
		}
	}
class thread1
	{
	public static void main(String []args)
		{
		table t = new table();
		prime p = new prime();
		t.start();
		p.start();
		}
	}