class Demo<M>
{
	public M t;
	public void setValue(M t)
	{
		this.t=t;
	}
	public void get1()
	{
		System.out.println("This is get value is::"+t);
	}
}
public class Sample {

	public static void main(String[] args) {
		
		Demo<Integer> d1=new Demo<Integer>();
		d1.setValue(100);
		//d1.setValue("azar");
		//d1.setValue("3.4");
		d1.get1();

	}

}
