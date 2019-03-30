import java.util.*;
class StudentDetails
{
      private String name;
	 private int rollno;
	 private String branch;
	 private double m1,m2,m3,m4;
	 private double percent;
	Scanner sc = new Scanner(System.in);
	  public void in()
	{
		System.out.println("Enter Name :");
		name = sc.next();
		System.out.println("Enter Roll no :");
		rollno = sc.nextInt();
		System.out.println("Enter Branch :");
		branch = sc.next();
	}
	public void marks()
	{
		System.out.println("Enter marks of 4 subjects :");
		m1 = sc.nextDouble();
		m2 = sc.nextDouble();
		m3 = sc.nextDouble();
		m4 = sc.nextDouble();
	}
	public void calculateResult()
	{
		percent = (m1+m2+m3+m4)/4.0;
	}
	 public void displayResult()
	{
		System.out.println("Name : "+name);
		System.out.println("Roll No :"+rollno);
		System.out.println("Branch :"+branch);
		System.out.println("Your total percentage :"+percent);
	}
}
class StudentResult
{
	public static void main(String s[])
	{
		StudentDetails obj = new StudentDetails();
		obj.in();
		obj.marks();
		obj.calculateResult();
		obj.displayResult();
	}
}