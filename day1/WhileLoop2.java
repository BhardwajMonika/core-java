class WhileLoop2{
	public static void main(String s[])
	{
		int n = 10;
		int sum = 0;
		int i=1;
		while(i<=n){
			sum = sum+i;
			i = i+1;
		}
		System.out.print("sum : "+sum);
	}
}