import java.util.ArrayList;
import java.util.Collections;
public class MyBasicArrayList {

	public static void main(String[] args) {
		ArrayList<String> a1 = new ArrayList<String>();
		
		a1.add("JAVA");
		a1.add("C++");
		a1.add("C");
		a1.add("PYTHON");
		a1.add(".NET");
		//a1.add(10); compiler error(will not take int)
		
		System.out.println(a1);
		//get elements by index
		System.out.println("Element at index 1: "+a1.get(1));
		System.out.println("Does list conatins JAVA?"+a1.contains("JAVA"));
		
		//add elements at a specific index
		a1.add(2,"PLAY");
		System.out.println(a1);
		System.out.println(" Is arraylist empty?"+a1.isEmpty());
		System.out.println("Index of Python is "+a1.indexOf("PYTHON"));
		System.out.println("Size of arraylist is: "+a1.size());
		Collections.sort(a1);
		System.out.println(a1);
	}

}
