
public class Sample 
{
	void get1()
	{
		int i,n=10;
		for(i=0;i<n;i++)
		{
			if(i%2==0)
			{
				System.out.println("Even I value is::"+i);
			}
			else
			{
				System.out.println("Odd I value is::"+i);
			}
			//System.out.println("Your value is::"+i);
		}
	}
	void get2()
	{
		int i,n=4;
		int fact=1;
		for(i=1;i<=n;i++)
		{
			fact=fact*i;
			
		}
		System.out.println("Fact value is::"+fact);
	}
	
}
class Demo
{
	public static void main(String[] args) {
		
		Sample s1=new Sample();
		//s1.get1();
		s1.get2();
	}

}
