class Demo
{
	Demo()
	{
		System.out.println("default cons...");
	}
	Demo(int empid,String empname)
	{
		System.out.println("ParamCons...");
	}
	void get1()
	{
		System.out.println("This is normal method...");
	}
}
public class Sample {

	public static void main(String[] args) {
		Demo f1=new Demo();
		new Demo(1001,"azar");
		f1.get1();

	}

}
