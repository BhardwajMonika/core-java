import java.util.*;
public class Sortbyroll implements Comparator<Student1>
{

//used for sorting in ascending order of roll number
	public int compare(Student1 a,Student1 b)
	{
		return a.rollno - b.rollno;
	}
}

class Sortbyname implements Comparator<Student1>
{
//used for sorting in ascending order of all roll name
	public int compare(Student1 a, Student1 b)
	{
		return a.name.compareTo(b.name);
	}
}
class Sortbyaddress implements Comparator<Student1>
{
	public int compare(Student1 a, Student1 b)
	{
		return a.address.compareTo(b.address);
	}
}