import java.util.Scanner;

public class Sample 
{
	int a1,b1;
	Scanner sc=new Scanner(System.in);
	void get1()
	{
		System.out.println("Enter the value is::");
		a1=sc.nextInt();
		if(a1%2==0)
		{
			System.out.println("a1 is even");
		}
		else
		{
			System.out.println("a1 is odd");
		}
	}
	void get2()
	{
		System.out.println("Enter the value is::");
		int age=sc.nextInt();
		if(age>=61)
		{
			System.out.println("Enter the salary is::");
			int salary=sc.nextInt();
			if(salary>=20000)
			{
				int bns=salary+1000;
				System.out.println("Your salary is::"+bns);
			}
			else
			{
				int bns=salary+2000;
				System.out.println("Your salary is::"+bns);
			}
		}
		else
		{
			System.out.println("Your age is low");
		}
	}
	void get3()
	{
		int exp;
		System.out.println("Enter the exp::");
		exp=sc.nextInt();
		switch(exp)
		{
		case 1:
			System.out.println("Case-1");
			break;
		case 2:
			System.out.println("Case-2");
			break;
		case 3:
			System.out.println("Case-3");
			break;
		default:
			System.out.println("Default case..");
			break;
		}
	}
}
class Demo
{
	public static void main(String[] args) {
		
		Sample s1=new Sample();
		//s1.get1();
		//s1.get2();
		s1.get3();
	}

}
