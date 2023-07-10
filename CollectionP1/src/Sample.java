import java.util.*;
class Demo
{
	//HashSet<Integer>list1=new HashSet<Integer>();
	TreeSet<Integer>list1=new TreeSet<Integer>();
	void get1()
	{
		list1.add(1001);
		list1.add(1002);
		list1.add(1003);
		System.out.println("Your data is::"+list1);
		System.out.println("Your data size is::"+list1.size());
		System.out.println("Your data searching is::"+list1.contains(1001));
		System.out.println("Your data Removing is::"+list1.remove(1001));
		System.out.println("Your data after removing data size is::"+list1.size());
		Iterator h1=list1.iterator();
		while(h1.hasNext())
		{
			System.out.println("Inside while data is::"+h1.next());
		}
	}
}
public class Sample {

	public static void main(String[] args) {
		
		Demo f1=new Demo();
		f1.get1();

	}

}
