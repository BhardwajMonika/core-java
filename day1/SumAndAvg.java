           /* -- TYPECASTING -- */
		   
import java.util.Scanner;
class SumAndAvg{
	public static void main(String s[])
	{
		Scanner sc = new Scanner(System.in);
		int a,b,c,sum;
		System.out.println("Enter 3 numbers : ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		sum = a+b+c;
		System.out.println("sum is : "+sum);
		float avg = (float) sum/3;
		System.out.println("Avg is :"+avg);
		
	}
}