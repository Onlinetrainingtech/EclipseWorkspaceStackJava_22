import java.util.Scanner;

class Foo extends Thread
{
	int n;
	Scanner sc=new Scanner(System.in);
	public void run()
	{
		System.out.println("CurrentThreadis::"+currentThread().getName());
		System.out.println("CurrentThreadis::"+currentThread().getPriority());
		get1();
	}
	void get1()
	{
		//int n;
		System.out.println("Enter the n value is::");
		n=sc.nextInt();
		if(currentThread().getPriority()==n)
		{
			System.out.println("Your Priority High");
		}
		else if(currentThread().getPriority()==n)
		{
			System.out.println("Your Priority low");
		}
	}
}
public class Sample {

	public static void main(String[] args) {
		
		Foo f1=new Foo();
		//f1.start();
		//f1.setPriority(Thread.MAX_PRIORITY);
		Foo f2=new Foo();
		f2.start();
		f2.setPriority(Thread.NORM_PRIORITY);
		f2.setName("Product-0");

	}

}
