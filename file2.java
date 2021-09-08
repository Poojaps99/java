//copying a file to another

import java.io.*;
class file2
	{
	public static void main(String []a)
		{
		FileInputStream infile=null;
		FileOutputStream outfile=null;   
		byte b;
		try
			{
			infile = new FileInputStream("city.txt");
			outfile= new FileOutputStream("citynew.txt");
			do
				{
				b=(byte) infile.read();
				outfile.write(b);
				System.out.println((char)b);
				}while(b != -1);	
			}
		catch(IOException e)
			{
			System.out.println(e);
			//System.exit(-1);
			}
		
		finally
			{
			try
				{
				outfile.close();
				infile.close();
				}
			catch(IOException e1)
				{
				System.out.println(e1);
				}
			}
		}
	}