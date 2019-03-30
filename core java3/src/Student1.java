
public class Student1
{

	int rollno;
	String name, address;
	
	//constructor
	public Student1(int rollno, String name, String address)
	{
		this.rollno = rollno;
		this.name = name;
		this.address = address;
	}
	
// used to print student details in main()
	public String toString()
	{
		return this.rollno+" "+this.name +" "+this.address;
	}
}
