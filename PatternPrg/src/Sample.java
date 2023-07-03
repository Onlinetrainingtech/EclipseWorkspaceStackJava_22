
public class Sample
{
    void get1()
    {
        int i,j;
        for(i=1;i<=5;i++)
        {
        	for(j=1;j<=5;j++)
        	{
        		System.out.print("*");
        	}
        	System.out.println();
        }
    }
    
	public static void main(String[] args) {
		
		Sample s1=new Sample();
		s1.get1();

	}

}
