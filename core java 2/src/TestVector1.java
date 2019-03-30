import java.util.*;
public class TestVector1 {

	public static void main(String [] args)
	{
		Vector<String> v = new Vector<String>(); //creating vector
		v.add("Umesh"); //method of collection
		v.addElement("John");//method of vector
		v.addElement("Kumar");
		
		//traversing elements  using Enumeration
		Enumeration e = v.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
	}
}
