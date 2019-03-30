import java.util.Scanner;

public class Division {

	public static void main(String[] args) {
		int a, b, result;
		Scanner sc = new Scanner(System.in);
		System.out.println("Input two Integers");
		a = sc.nextInt();
		b = sc.nextInt();
		try {
			result = a/b;
			System.out.println("Result = "+ result);
		}
		catch(ArithmeticException e){
			System.out.println("Exception caught: Division by zero.");
			
		}
		finally {
			sc.close();
			System.out.println("In Finally Block");
		}

	}

}
