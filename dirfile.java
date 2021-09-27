/*Q1.Listing files in directory and search for a file*/

import java.io.*;

import java.io.File;

class dirfile 
	{
	public static void main(String[] args) throws IOException
		{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// creates a file object
		File file = new File("F:\\java");
		
		// returns an array of all files
		String[] fileList = file.list();
		
		for(String str : fileList) 
			{
			System.out.println(str);
			}
		System.out.println("\n enter a file to search:");
		String f = br.readLine();
		for(String str : fileList) 
			{
			if(f.equals(str))
		     		System.out.println("File found:"+str);
			}
		}
	}
