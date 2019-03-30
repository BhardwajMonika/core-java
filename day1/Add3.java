import java.util.Scanner;
public class Add3
{
	public static void main(String []s)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("A: ");
		int a = sc.nextInt();
		System.out.println("B:");
		int b = sc.nextInt();
		int sum = a+b;
		System.out.println("sum is :"+sum);
		System.out.println("Eneter your name :");
		String c = sc.next();
		System.out.println("your name is :"+c);
		System.out.println("Enter your gender : ");
		char gender = sc.next().charAt(0);
		System.out.println("gender is:"+gender);
	}
}