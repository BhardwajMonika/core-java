class Add2
{
	public static void main(String [] s)
	{
		System.out.println(s[0]);
		System.out.println(s[1]);
		System.out.println(s[2]);
		
		/*
		int a = args[0];
		int b = args[1];
		int c = args[2];
		will show error because the we have given string as i/p type but passing int
		so to convert the input type parse is used.
		*/
		
		int a=Integer.parseInt(s[0]);
		int b=Integer.parseInt(s[1]);
		int c=Integer.parseInt(s[2]);
		int sum=a+b+c;
		System.out.println("sum : "+sum);
	}
}