/*9.array of objects*/
import java.io.*;
class emp
	{
	int empno,salary;
	String ename;
	
	void getdata(int empno, String ename, int salary)
		{
		this.empno=empno;
		this.ename=ename;
		this.salary=salary;
		}
	void display()
		{
		System.out.println("employee details:");
		System.out.println("emp no:"+ empno);
		System.out.println("emp name:"+ ename);
		System.out.println("salary:"+ salary);
		}
	}
class Employee
	{
	public static void main(String[] args)
		{
		emp []e= new emp[5];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int eno1=0,eno2=0,sal=0,i,n=0;
		String name;
		try
			{
			System.out.println("enter no of employees:");
			n=Integer.parseInt(br.readLine());

			for(i=0;i<n;i++)
				{
				System.out.println("enter the empno,ename,salary:");
				eno1=Integer.parseInt(br.readLine());
				name=br.readLine();
				sal=Integer.parseInt(br.readLine());
				e[i]=new emp();
				e[i].getdata(eno1,name,sal);
				}
			System.out.println("enter the emp no to search:");
			eno2=Integer.parseInt(br.readLine());
			for(i=0;i<n;i++)
				{
				if(e[i].empno==eno2)	
					{
					e[i].display();
					break;
					}
				}
			}
		catch(IOException e1)
			{System.out.println(e1);}
		}
	}