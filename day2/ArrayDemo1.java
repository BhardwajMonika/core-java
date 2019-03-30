class ArrayDemo1
{
	public static void main(String []s)
	{
		int sum = 0;
		int i;
		int[] numbers = {8,18,5,2,1,10};
		System.out.println("Total number of elements in an array are : " +numbers.length);
		System.out.println("First element of the array is :"+numbers[0]);
		System.out.println("Last element of the array is : "+ numbers	[numbers.length-1]);
		for(i=0;i<numbers.length;i++)
		{
			sum = sum+numbers[i];
		}
		System.out.println("sum : "+sum);
	}
}	