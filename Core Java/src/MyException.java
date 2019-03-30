//program throws an exception when balance is less than 1000.
public class MyException extends Exception 
{
//store account information
	private static int accno[]= {1001,1002,1003,1004};
	private static String name[]= {"a","b","c","d","e"};
	private static double bal[]= {10000.00,12000.00,5600.0,999.00,1100.55};
	
	MyException()
	{
		
	}
	MyException(String str)
	{ super(str); }
	
	public static void main(String [] args)
	{
		try
		{
			System.out.println("ACCNO"+"\t"+"CUSTOMER"+
		"\t"+"BALANCE");
			for(int i=0;i<5;i++)
			{
				System.out.println(accno[i] + "\t"+name[i]+"\t"+bal[i]);
			//display own exception if balance < 1000
			if(bal[i]<1000)
			{
				MyException me = new MyException("Balance is less than 1000");
			throw me;
			}
			}
		}
		catch(MyException e)
		{
			e.printStackTrace();
		}
	}
}
