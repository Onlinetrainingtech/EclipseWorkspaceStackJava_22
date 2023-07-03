import java.util.Scanner;

public class Sample 
{
	int empid[][]=new int[2][2];
	int i,n,m,j;
	Scanner sc=new Scanner(System.in);
	
	void get1()
	{
		System.out.println("Enter the n and m value is::");
		n=sc.nextInt();
		m=sc.nextInt();
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
			{
				System.out.println("Enter the array value is::");
				empid[i][j]=sc.nextInt();
			}
		}
		
	}
	void get2()
	{
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
			{
				System.out.println("Your value is::"+empid[i][j]);
			}
		}
	}
}
class Demo
{
	public static void main(String[] args) {
		
		Sample s1=new Sample();
		s1.get1();
		s1.get2();

	}

}
