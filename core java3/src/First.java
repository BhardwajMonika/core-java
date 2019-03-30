
public class First 
{

	//synchronized 
	public void display(String msg) // this was synchronized method
	{
		System.out.print("["+msg);
		try {
			Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println("]");
	}
}
class Second extends Thread
{
	String msg;
	First fobj;
	
	Second(First fp,String str)
	{
		fobj=fp;
		msg=str;
		start();
	}
	public void run()
	{
		synchronized(fobj) //this is synchronized block
		{
		fobj.display(msg);
		}
	}
}