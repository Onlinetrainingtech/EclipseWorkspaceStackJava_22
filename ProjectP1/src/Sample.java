
public class Sample 
{
	
	void get1()
	{
		System.out.println("This is the get1 function..");
	}
	void get2()
	{
		System.out.println("This is the get2 function..");
	}

	public static void main(String[] args) {
		
		System.out.println("This is my main function..");
		
		Sample s1=new Sample();//To creating the objects
		s1.get1();
		s1.get2();
		

	}

}
