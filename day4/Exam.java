interface Exam
{
	void percent_cal();
}
class Student
{
	String name;
	int roll_no,marks,mark2;
	Students(String n,int r,int m1,int m2)
	{
		name = n;
		roll_no = r;
		mark1 = m1;
		mark2 = m2;
	}
	void display()
	{
		System.out.println("Name of Student:"+name);
		System.out.println("Roll no of student:"+roll_no);
		System.out.println("Marks of subject1:"+mark1);
		System.out.println("Marks of subject2:"+mark2);
	}
}
	class Result extends Student implements Exam
	{
		Result(String n,int r,int m1,int m2)
		{
			super(n,r,m1,m2);
		}
		public void percent_cal()
		{
			int total=(mark1+mark2);
			float percent=total*100/200;
			System.out.println("Percentage:"+percent+"%");
		}
		void display()
		{
			super.display();
		}
	}
	class MultipleDemo
	{
		public static void main(String s[])
		{
			Result r = new Result("Ra.one",12,93,84);
			r.display();
			r.percent_cal();
		}
	}
