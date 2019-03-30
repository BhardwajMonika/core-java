import java.util.Date;
import java.util.ArrayList;
import java.util.Collections;

public class ComparatorDemo 
{

	public static void main(String [] s)
	{
		ArrayList<Student1> ar = new ArrayList<Student1>();
		ar.add(new Student1(111,"bbb","london"));
		ar.add(new Student1(131,"aaaa","delhi"));
		ar.add(new Student1(121,"cccc","jaipur"));
		
		System.out.println("unsorted");
		for(int i = 0; i<ar.size();i++)
			System.out.println(ar.get(i));
		
		Collections.sort(ar,new Sortbyroll());
		
		System.out.println("\nSorted by rollno");
		for(int i=0;i<ar.size();i++)
			System.out.println(ar.get(i));
		
		Collections.sort(ar,new Sortbyname());
		
		System.out.println("\nSorted by name");
		for(int i=0;i<ar.size();i++)
			System.out.println(ar.get(i));
		
		Collections.sort(ar,new Sortbyaddress());
		
		System.out.println("\nSort by city");
		for(int i=0;i<ar.size();i++)
			System.out.println(ar.get(i));
		
		Date d1 = new Date();
		System.out.println(d1.toString());
	}
}
