
public class Sample 
{
	void op1()
	{
		int a1=100,b1=200;
		System.out.println("Add::"+(a1+b1));
		System.out.println("Mul::"+(a1*b1));
		System.out.println("Div::"+(a1/b1));
		System.out.println("Mod::"+(a1%b1));
	}
	void op2()
	{
		int a2=200,b2=100;
		System.out.println("Lessthan::"+(a2<b2));
		System.out.println("Greater than::"+(a2>b2));
		System.out.println("Equal to::"+(a2==b2));
		System.out.println("NotEqual to::"+(a2!=b2));
	}
	void op3()
	{
		int a3=300,b3=400;
		System.out.println("LogicalAND::"+((a3<b3)&&(b3>a3)));
		System.out.println("LogicalOR::"+((a3>b3)||(b3>a3)));
		System.out.println("LogicalNOT::"+(!(a3<b3)));
	}
}
class Demo
{
	public static void main(String[] args) {
		
		
		Sample d1=new Sample();
		d1.op1();
		d1.op2();
		d1.op3();

	}

}
