
public class Sample 
{
	void get1(int empid,String empname)
	{
		System.out.println("Your get1 function is::"+empid+""+empname);
	}

}

class Demo
{
	public static void main(String[] args) {
		
		Sample s1=new Sample();
		s1.get1(1001,"mohamed");

	}

}
