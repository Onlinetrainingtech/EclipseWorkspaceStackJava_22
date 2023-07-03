class B
{
	int pid=1001;
}
class D1 extends B
{
	String pname="apple";
}
class D2 extends D1
{
	void get1()
	{
		System.out.println("Your value is::"+pname+""+pid);
	}
}
public class Sample {

	public static void main(String[] args) {
		
		D2 f1=new D2();
		f1.get1();

	}

}
