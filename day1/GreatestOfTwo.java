import java.util.Scanner;
class GreatestOfTwo
{
	public static void main(String s[])
	{
		Scanner sc = new Scanner(System.in);
		int a,b;
		System.out.println("Enter the value of A and B :");
		a = sc.nextInt();
		b = sc.nextInt();
		if(a>b)
		{
			System.out.println("A is greater");
		}
		else
		{
			System.out.println("B is greater");
		}
	}
}