class Demo
{
	public <M> M test(M t)//public int test(int t)
	{
		return t;
	}
}
public class Sample {

	public static void main(String[] args) {
		
		Demo g1=new Demo();
		System.out.println(g1.test(100));
		System.out.println(g1.test("azar"));
		System.out.println(g1.test(10.5));

	}

}
