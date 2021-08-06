/*Program for matrix addition*/

import java.io.*;

public class matrix1
	{
	public static void main(String[] args)
		{
		int a[][]=new int[2][2];
		int b[][]=new int[2][2];
		int c[][]=new int[2][2];
		BufferedReader br= new BufferedReader( new InputStreamReader(System.in));
		try
			{
			System.out.println("enter details for 1 matrix:");
			for(int i=0;i<2;i++)
				{
					for(int j=0;j<2;j++)
						{
						a[i][j]=Integer.parseInt(br.readLine());
						}
					System.out.println();
				}
			System.out.println("enter details for 2 matrix:");
			for(int i=0;i<2;i++)
				{
					for(int j=0;j<2;j++)
						{
						b[i][j]=Integer.parseInt(br.readLine());
						}
					System.out.println();
				}
			}
		catch(IOException e)
			{
			System.out.println(e);
			}
		
		for(int i=0;i<2;i++)
			{
			for(int j=0;j<2;j++)
				{
				c[i][j]=a[i][j]+b[i][j];
				}
			}
		for(int i=0;i<2;i++)
			{
			for(int j=0;j<2;j++)
				{
				System.out.println(c[i][j]);
				}
			}
		}
	}
	