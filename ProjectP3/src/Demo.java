
public class Demo 
{
	int pid=1001;//To create a class or instance variable
   void fun1()
   {
	   String pname="apple";//To Create a local variable
	   System.out.println("Your variable is::"+pname);
   }
   void fun2()
   {
	   System.out.println("Your class or instance:::"+pid);
   }
	public static void main(String[] args) {
		

		Demo f1=new Demo();
		f1.fun1();
		f1.fun2();
	}

}
