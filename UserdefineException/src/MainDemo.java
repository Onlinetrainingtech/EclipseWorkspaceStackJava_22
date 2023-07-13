
public class MainDemo {

	public void get1(int amount) throws ExceptionDemo
	{
		int salary=500;
		if((salary-amount)<5000)
		{
			throw new ExceptionDemo();
		}
		else
		{
			System.out.println("Credited..");
		}
		
	}
	public static void main(String[] args) throws ExceptionDemo {
		
		MainDemo f1=new MainDemo();
		f1.get1(1000);

	}

}
