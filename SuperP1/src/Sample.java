class B
{
	final int pid=1001;
	void get1()
	{
		System.out.println("Your Base class value is::"+pid);
	}
	final void add()
	{
		
	}
}
class D extends B
{
	void display()
	{
	    pid=2001;
		System.out.println("Your Dervied class value is::"+super.pid);
	}
	void add()//Error
	{
		
	}
	
}
public class Sample {

	public static void main(String[] args) {
		 D f1=new D();
		 f1.get1();
		 f1.display();

	}

}
