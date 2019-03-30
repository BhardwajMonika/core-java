import java.util.ArrayList;
import java.util.Collections;

public class TestSort3 {

	public static void main(String s[])
	{
		ArrayList<Student> al=new ArrayList<Student>();
		al.add(new Student(111,"John",29));
		al.add(new Student(222,"Mike",21));
		al.add(new Student(555,"Mary",26));
		
		//Collections.sort(al);
		Collections.sort(al);
		
		for(Student st:al)
		{
			System.out.println(st.rollno+" "+st.name+" "+st.age);
		}
	}
}
