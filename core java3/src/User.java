import java.util.*;
public class User implements Comparable {

	int id;
	String first, last;
	User()	
	{}
	
	User(String fname,String lname,int n)
	{
		first = fname;
		last = lname;
		id = n;
	}
	//@Override
	public int compareTo(Object o)
	{
		return 0;
	}
	
	public String toString()
	{
		return first+" "+last+" "+id;
	}
}
