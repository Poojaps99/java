/* removing an object from stack*/

import java.io.*;
import java.util.*;

public class stack
	{
	public static void main(String []args)
		{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		Stack <String> s= new Stack<String>();
		try
			{
			
			System.out.println("enter 5 string values");
			for(int i=0;i<5;i++)	
				s.add(br.readLine());
			System.out.println("Stack elements are:"+s);
			
			int pos=0;
			System.out.println("enter the position of element to remove object:");
			pos=Integer.parseInt(br.readLine());
			String st= s.remove(pos);
			System.out.println("Stack element removed:"+st);
			System.out.println("Remaining Stack elements are:"+s);
			
			}
		catch(IOException e)
			{System.out.println(e);}
		}
	}
