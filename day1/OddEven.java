import java.util.Scanner;
class OddEven
{
	public static void main(String s[])
	{
		Scanner sc = new Scanner(System.in);
		int a;
		System.out.println("Enter a number :");
		a = sc.nextInt();
		if(a%2==0)
		{
			System.out.println("number is even");
		}
		else
		{
			System.out.println("number is odd");
		}
	}
}