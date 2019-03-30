import java.util.Scanner;
class DoWhile2{
	public static void main(String []s)
	{
		String guess;
		Scanner sc = new Scanner(System.in);
		do
		{
			System.out.print("Guess my name : ");
			guess = sc.nextLine();
		}
		while(!"Raj".equals(guess));
		System.out.println("Congratulations u guessed my name correctly");
	}
}