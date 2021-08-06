/* Program to find sum of 2 complex numbers*/

import java.io.*;
public class complex
	{
	int real;
	int img;
	BufferedReader br= new BufferedReader( new InputStreamReader(System.in));
	public void getdata()
		{
		try
			{
			System.out.println("enter real part and imaginary part");
			real=Integer.parseInt(br.readLine());
			img=Integer.parseInt(br.readLine());
			}
		catch(IOException e)
			{
			System.out.println(e);
			}
		}

	public void show()
		{
		System.out.println("complex no:"+ real +" +i"+ img);
		}
	
	public static void main(String[] args)
		{
		complex c1,c2;
		c1 = new complex();
		c2 = new complex();
		c1.getdata();
		c2.getdata();
		c1.show(); 
		c2.show();
		int x= c1.real + c2.real;
		int y = c1.img + c2.img;
		System.out.println("sum of 2 complex no:"+ x +" +i"+ y);
		}
	}