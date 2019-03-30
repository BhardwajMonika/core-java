class NestedLoop2
{
	public static void main(String []s)
	{
		int i,j;
		//for(i=5;i>=1;i--)
			for(i=1;i<=5;i++)
		{
			for(j=5;j>=i;j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}