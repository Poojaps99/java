/*8. String manipulation*/
import java.io.*;
class strmanip
	{
	public static void main(String []args)
		{
		String s1,s2,s3;
		int choice;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try
			{
			System.out.println("enter 2 strings:");
			s1=br.readLine();
			s2=br.readLine();
			do
				{
				System.out.println("enter ur(1-copy,2-append, 3-compare,4-reverse,5-exit) choice:");
				choice=Integer.parseInt(br.readLine());
				switch(choice)
					{
					case 1: s3=s1;
						System.out.println("copied string:"+s3);
						break;
					case 2: s3=s1+ "  "+s2;
						System.out.println("appended strings:"+s3);
						break;
					case 3: int x=s1.compareTo(s2);
						if(x==0)
							System.out.println("strings are equal");
						else if(x<0)
							System.out.println("II string is larger");
						else
							System.out.println("I string is larger");
						break;
					case 4: s3=new StringBuffer(s1).reverse().toString();
						System.out.println("reversed string:"+s3);
						break;
					
					}
				}while(choice<5);
		}
		catch(IOException e)
			{
			System.out.println(e);
			}
		}
	}
						