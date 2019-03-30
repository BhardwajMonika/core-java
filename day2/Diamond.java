
class Diamond
{
	public static void main(String []s)
	{
		int i,j;
		for(i=1;i<=6;i++)
		{
			for(j=1;j<=6-i;j++)
			{
				System.out.print(" ");
			}
			for(j=1;j<=i*2-1;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(i=5;i>0;i--)
		{
			for(j=1;j<=6-i;j++)
			{
				System.out.print(" ");
			}
			for(j=1;j<=i*2-1;j++)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
}