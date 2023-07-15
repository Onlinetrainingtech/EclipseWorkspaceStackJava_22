class Demo implements Runnable
{
	public void run()
	{
		System.out.println("This is run method..");
	}
}
public class SampleP1 {

	public static void main(String[] args) {
		
		Demo t1=new Demo();
		Thread s1=new Thread(t1);
		s1.start();

	}

}
