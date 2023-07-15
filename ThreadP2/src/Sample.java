import java.util.Scanner;

class Foo extends Thread
{
	int empid;
	String empname;
	Scanner sc=new Scanner(System.in);
	public void run()
	{
		try
		{
			System.out.println("Getting the Input..Please Wait");
			Thread.sleep(20000);
			System.out.println("Enter the value is::");
			empid=sc.nextInt();
			empname=sc.next();
			display();
		}
		catch(InterruptedException t)
		{
			System.out.println("Please check Inputs..");
		}
		
	}
	void display()
	{
		System.out.println("Your Empid is::"+empid+"Your Empname is::"+empname);
	}
}
public class Sample {

	public static void main(String[] args) {
		
		Foo t1=new Foo();
		//Foo t2=new Foo();
		t1.start();
		//t2.start();

	}

}
