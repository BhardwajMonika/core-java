
import java.util.HashMap;
import java.util.Map;
public class LambdaDemo5 {

	public static void main(String[] args) {
		Map<String, String> books = new HashMap<>();
		books.put("Let us C","Yashwant Kanetkar");
		books.put("Object Oriented Programming Using Java","Simon kendal");
		books.put("Java: Graphical User Interfaces","David Etheridge");
		
books.forEach((key,value)-> System.out.println("Book Name: "+key+", Author: "+value));
	System.out.println();
	
	books.forEach((key,value)->{System.out.println("Book Name:"+key+" Author: "+value);
	});
	
	System.out.println();
	}

}
