class Demo
{
	synchronized void test_function(int n1)
	{
		//synchronized method
		for(int i=1;i<=3;i++)
		{
			System.out.println(n1+i);
			try
			{
				Thread.sleep(500);
			}
			catch(Exception t)
			{
				
			}
			
		}
	}
}
public class Example {

	public static void main(String[] args) {
		
		final Demo obj=new Demo();
		Thread t1=new Thread()
				{
			            public void run()
			            {
			            	obj.test_function(16);
			            }
				};
				Thread t2=new Thread()
						{
					        public void run()
					        {
					        	obj.test_function(40);
					        }
						};

						t1.start();
						t2.start();
	}

}
