import java.util.Scanner;
class SwitchCase
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		char op;
		System.out.println("Enter two numbers : ");
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println("Enter the operator : ");
		op = sc.next().charAt(0);
		switch (op)
		{
			case '+' : 
				c = a+b;
				System.out.println("sum is : "+c);
				break;
			case '-' : 
				c = a-b;
				System.out.println("Difference is : "+c);
				break;
			case '*' :
				c = a *b;
				System.out.println("Multiplication : "+c);
				break;
			case '/' :
				 c =a/b;
				System.out.println("Division is : "+c);
			break;
			default :
				System.out.println("Invalid operator");
					
		}
	
	}
}