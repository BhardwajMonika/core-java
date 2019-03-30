import java.util.Scanner;
class GreatestOfThree
{
	public static void main(String s[])
	{
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter the value of A,B and C :");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		if((a>b)&&(a>c))
		{
			System.out.println("A is greatest");
		}
		else if((b>a)&&(b>c))
		{
			System.out.println("B is greatest");
		}
		else 
		{
		System.out.println("C is greatest");
		}
	}
}