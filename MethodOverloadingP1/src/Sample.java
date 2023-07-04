class Demo
{
	void get1(int empid,String empname)
	{
		System.out.println("Your data is::"+empid+""+empname);
	}
	void get1(int salary)
	{
		System.out.println("Your data is::"+salary);
	}
}
public class Sample {

	public static void main(String[] args) {
		
		Demo d1=new Demo();
		d1.get1(1001,"azar");
		d1.get1(10000);

	}

}
