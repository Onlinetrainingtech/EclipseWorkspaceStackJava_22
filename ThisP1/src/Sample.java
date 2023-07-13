class Foo
{
	int empid;
	String empname;
	void get1(int empid,String empname)
	{
		this.empid=empid;
		this.empname=empname;
		System.out.println("Your empid is::"+empid+","+empname);
	}
	void display()
	{
		System.out.println("Your empid is::"+empid+","+empname);
	}
}
public class Sample {

	public static void main(String[] args) {
		
		Foo f1=new Foo();
		f1.get1(1001,"azar");
		f1.display();

	}

}
