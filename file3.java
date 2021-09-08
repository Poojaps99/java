/* separating odd and even numbers*/

import java.io.*;
class file3
	{
	public static void main(String []a) throws IOException
		{
		int i;
		File num= new File("integers.txt");    //creating main file
		FileOutputStream fos=new FileOutputStream(num);
		DataOutputStream dos= new DataOutputStream(fos); //for handling primitive data types
		try
			{
			for(i=1;i<=10;i++)
				dos.writeInt(i);
			}
		catch(IOException e)
			{System.out.println("from 1"+e);}
		dos.close();
		fos.close();

		FileInputStream fis=new FileInputStream(num);
		DataInputStream dis= new DataInputStream(fis);

		File num1= new File("odd.txt");		//creating odd number file
		FileOutputStream fos1=new FileOutputStream(num1);
		DataOutputStream dos1= new DataOutputStream(fos1);
		File num2= new File("even.txt");	//creating even number file
		FileOutputStream fos2=new FileOutputStream(num2);
		DataOutputStream dos2= new DataOutputStream(fos2);
		try
			{
			System.out.println("file content:");
			for(int j=1;j<=10;j++)
				{
				i=dis.readInt();				
				System.out.println("inside fn:"+i);
				if(i%2==0)
					dos2.writeInt(i);
				else
					dos1.writeInt(i);
				}
			}
		catch(IOException e1)
			{System.out.println("from 2"+e1);}
		dos1.close();
		fos1.close();
		dos2.close();
		fos2.close();	
		dis.close();
		fis.close();
		FileInputStream fis1=new FileInputStream(num1);
		DataInputStream dis1= new DataInputStream(fis1);
		System.out.println("\nOdd file: ");
		try
			{
			for(int j=1;j<=5;j++)
				{
				i=dis1.readInt();
				System.out.println(i + " ");
				}
			}
		catch(IOException e2)
			{System.out.println("from 3"+e2);}
		fis1.close();
		dis1.close();
		
		FileInputStream fis3=new FileInputStream(num2);
		DataInputStream dis3= new DataInputStream(fis3);
		System.out.println("\nEven file: ");
		try
			{
			for(int k=1;k<=5;k++)
				{
				i=dis3.readInt();
				System.out.println(i + " ");
				}
			}
		catch(IOException e2)
			{System.out.println("from 4"+e2);}
		fis1.close();
		dis1.close();
		}
	}
	