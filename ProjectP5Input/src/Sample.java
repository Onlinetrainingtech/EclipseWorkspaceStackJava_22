import java.util.Scanner;

public class Sample 
{
	int empid,salary;
	String empname;
	Scanner f1=new Scanner(System.in);
	void input()
	{
		System.out.println("Enter the empid value is::");
		empid=f1.nextInt();
		System.out.println("Enter the salary is::");
		salary=f1.nextInt();
		System.out.println("Enter the empname is::");
		empname=f1.next();
	}
	void display()
	{
		System.out.println("Your Result is::"+empid+""+empname+""+salary);
	}
}
class Demo
{
	public static void main(String[] args) {
		
		Sample s1=new Sample();
		s1.input();
		s1.display();

	}

}
