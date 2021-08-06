/* search an element in an array*/
import java.io.*;

class array
	{
	public static void main(String []args)
		{
		int []arr= new int[5];
		int item=0,flag=0,i=0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try
			{
			System.out.println("enter 5 numbers:");
			for(i=0;i<5;i++)
				{
				arr[i]=Integer.parseInt(br.readLine());
				}
			System.out.println("enter the item to search:");
			item=Integer.parseInt(br.readLine());
			}
		catch(IOException e)
			{
			System.out.println(e);
			}
		for(i=0;i<5;i++)
			{
			if(item==arr[i])
				{
				flag=1;
				break;
				}
			}
		if(flag==1)
			System.out.println("Item found at "+ (i+1));
		else
			System.out.println("Item not found ");
		}
	}