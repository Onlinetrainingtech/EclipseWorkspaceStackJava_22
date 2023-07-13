import java.util.*;
class Demo
{
	
	void get1()
	{
		try
		{
	     String s1=null;
	     System.out.println("Length of the value is::"+s1.length());
		}
		catch(NullPointerException t)
		{
			System.out.println(t);
		}
		
	}
	void get2()
	{
		try
		{
			int a[]=new int[2];
			int i,n;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the n value is::");
			n=sc.nextInt();
			for(i=0;i<=n;i++)
			{
				System.out.println("Enter the array value is::");
				a[i]=sc.nextInt();
				System.out.println("Your data is::"+a[i]);
			}
		}
		catch(ArrayIndexOutOfBoundsException t)
		{
			System.out.println("Check the size");
		}
	}
}
public class Sample {

	public static void main(String[] args) {
		
		Demo f1=new Demo();
		//f1.get1();
		f1.get2();

	}

}
