interface B1
{
	void get1();
}
interface B2 extends B1
{
	void get2();
}
class D implements B2
{

	public void get1() {
		System.out.println("This is B1 interface..");
		
	}

	public void get2() {
		System.out.println("This is B2 interface..");
		
	}
	
}
public class Sample {

	public static void main(String[] args) {
		
		D f1=new D();
		f1.get1();
		f1.get2();
		//B2 f2=new B2();

	}

}
