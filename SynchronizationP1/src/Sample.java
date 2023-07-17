

//A Class used to send a msg

class Sent
{
	
	public void send(String msg)
	{
	    System.out.println("Sending..."+msg);
	    try
	    {
	    	Thread.sleep(1000);
	    }
	    catch(Exception r)
	    {
	    	System.out.println(r);
	    }
	    System.out.println("\n"+msg+"Sending...");
	}
}
//A class for send a msg using Threads
class ThreadSent extends Thread
{
	String msg;
	Sent sender;
	
	//Receives a msg obj and a String
	//msg to be sent
	ThreadSent(String m,Sent obj)
	{
		msg=m;
		sender=obj;
	}
	public void run()
	{
		//Only one thread can send a mesg at a time
		
		synchronized (sender)
		{
			  //synchronizing the send object
			sender.send(msg);
		}
	}
}
public class Sample {

	
	public static void main(String[] args) {
		
		Sent send=new Sent();
		ThreadSent s1=new ThreadSent("Welcome", send);
		ThreadSent s2=new ThreadSent("End",send);
		//Start two thread of ThreadSent
		
		s1.start();
		s2.start();
		
		//wait for thread to end
		try
		{
			s1.join();
			s2.join();
		}
		catch(Exception t)
		{
			System.out.println("End");
		}

	}

}
