//Program to calculate sum of numbers entered by the user,until user enters a negative number.

import java.util.*;
class NestedLoopExample
{
	public static void main(String []s)
	{
		Scanner sc = new Scanner(System.in);
		int i,n;
		int sum = 0;
		System.out.println("Enter 5 numbers :");
		for(i=0;i<=5;i++)
		{
			n = sc.nextInt();
		if(n<0)
		{
			break;
		}
		sum = sum+n;
		}
		System.out.println("sum : "+sum);
	}
}