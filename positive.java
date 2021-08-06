/* exception pgm*/

import java.io.*;
class myexcep extends Exception
	{
	myexcep(String msg)
		{
		super(msg);
		}
	}

class positive
	{
	public static void main(String []args) throws IOException
		{
		int a[]= new int [5];
		int l=0,i,s=0,av=0;
		BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
		try
			{
			System.out.println("enter 5 values:");
			for(i=0;i<5;i++)
				{				
				l=Integer.parseInt(br.readLine());
				if(l<0)
					throw new myexcep("enter only positive value");
				else
					a[i]=l;
				av=i+1;
				}
			}
		catch(myexcep e)
			{
			System.out.println("caught my exception");
			System.out.println(e.getMessage());
			}			
		/*System.out.println("Array elements:")*/
		for(int j=0;j<5;j++)
			{
			s+=a[j];			
			}
		System.out.println("average:"+(float)((float)s/av));
		}
	}