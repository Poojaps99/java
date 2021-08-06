/*10. Area of figures using overloaded function*/
import java.io.*;

class over
	{
	void area(int l)
		{
		System.out.println("Area of square:"+l * l);
		}
	void area(int l, int b)
		{
		System.out.println("Area of rectangle:"+l * b);
		}
	void area(float l)
		{
		System.out.println("Area of circle:"+3.14 * l *l);
		}
	public static void main(String []args)
		{
		int l=0,b=0;
		over o= new over();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try
			{
			System.out.println("Enter length & breadth:");
			l= Integer.parseInt(br.readLine());
			b= Integer.parseInt(br.readLine());
			}
		catch(IOException e)
			{
			System.out.println(e);
			}
		o.area(l);
		o.area(l,b);
		float x= (float)l;
		o.area(x);
		}
	}