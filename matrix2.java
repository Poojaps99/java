/* matrix is symmetric or not*/

import java.io.*;

public class matrix2
	{
	public static void main(String[] args)
		{
		int a[][]= new int[3][3];
		int b[][]= new int[3][3];
		int r=0,c=0,flag=0;
		BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter no of rows and columns:");
		try
			{
			r=Integer.parseInt(br.readLine());
			c=Integer.parseInt(br.readLine());
		
			System.out.println("Enter details of matrix:");
		
			for(int i=0;i<r;i++)
				{
				for(int j=0;j<c;j++)
					{
					a[i][j]=Integer.parseInt(br.readLine());
					}
				}
			}
		catch(IOException e)
			{System.out.println(e);}
		for(int i=0;i<r;i++)
			{
			for(int j=0;j<c;j++)
				{
				b[j][i]=a[i][j];
				}
			}
		if(r==c)
			{
			for(int i=0;i<r;i++)
				{
				for(int j=0;j<c;j++)
					{
					if(b[i][j] != a[i][j])
						{
						flag=1;
						break;
						}
					}
				}
			if(flag==1)
				System.out.println("Matrix is not symmetric");
			else
				System.out.println("Matrix is symmetric");
			}
		else
			System.out.println("Since matrix is not square matrix, it is not symmetric");
		}
	}