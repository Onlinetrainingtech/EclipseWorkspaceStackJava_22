import java.util.InputMismatchException;
import java.util.Scanner;

class  Product
{
	int pid,price;
	String pname;
	Scanner sc=new Scanner(System.in);
	
	void addProduct()
	{
		try
		{
			   System.out.println("Enter the pid is::");
			   pid=sc.nextInt();
			   System.out.println("Enter the pname is::");
			   pname=sc.next();
			   System.out.println("Enter the pprice is::");
			   price=sc.nextInt();
		}
		catch(InputMismatchException t)
		{
			System.out.println("Please check Input"+t);
		}
		finally
		{
			 viewProduct();
		}
	   
	  
	}
	void viewProduct()
	{
		System.out.println(""+pid+""+pname+""+price);
	}
}
public class Sample {

	public static void main(String[] args) {
		
		Product f1=new Product();
		f1.addProduct();
		

	}

}
