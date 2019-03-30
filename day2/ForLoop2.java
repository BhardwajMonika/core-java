import java.util.*;
class ForLoop2
{
	public static void main(String s[])
	{
		Scanner sc = new Scanner(System.in);
	int i;
	int n,m;
		System.out.print(" Enter a number: ");
		n = sc.nextInt();
		
			for(i=1;i<=10;i++)
			{
				m = n*i;
				System.out.println(n +" * "+i+ " = "+m);
		}
			
	}
}