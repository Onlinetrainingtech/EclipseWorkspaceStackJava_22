import java.io.DataInputStream;
import java.io.IOException;

public class Sample
{
	int pid,pprice;
	String pname;
	DataInputStream d1=new DataInputStream(System.in);
	void input() throws  IOException
	{
		System.out.println("Enter the pid::");
		pid=Integer.parseInt(d1.readLine());
		System.out.println("Enter the pprice::");
		pprice=Integer.parseInt(d1.readLine());
		System.out.println("Enter the pname::");
		pname=d1.readLine();
	}
	void display()
	{
		System.out.println(""+pid+""+pprice+""+pname);
	}
	
}
class Demo
{
	public static void main(String[] args) throws IOException {
		
		Sample p1=new Sample();
		p1.input();
		p1.display();

	}

}
