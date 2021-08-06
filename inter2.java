/*12. interface program*/

import java.io.*;
interface areaperi
	{
	void area();
	void perimeter();
	}
class rectangle implements areaperi
	{
	int l=10,b=20;
	public void area()
		{
		System.out.println("area of rectangle:"+ (l*b));
		}
	public void perimeter()
		{
		System.out.println("perimeter of rectangle:"+(2*(l+b)));
		}
	}

class circle implements areaperi
	{
	int r=10;
	public void area()
		{
		System.out.println("area of circle:"+ (3.14*r*r));
		}
	public void perimeter()
		{
		System.out.println("perimeter of circle:"+ (2*3.14*r));
		}
	}
class inter2
	{
	public static void main(String[] args) 
		{
		rectangle r = new rectangle();
		circle c = new circle();
		int ch=0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try
			{
			System.out.println("enter 1 for circle, 2 for rectangle:");
			ch=Integer.parseInt(br.readLine());
			switch(ch)
				{
				case 1: c.area();
					c.perimeter();
					break;
				case 2: r.area();
					r.perimeter();
					break;
				}
			}
		catch(IOException e1)
			{System.out.println(e1);}
		}
	}