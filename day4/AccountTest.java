/* Program to understand overriding methods*/
class Account
{
	String name;
	protected double balance;
	
	Account(String n,double amt)
	{
		name = n;
		balance = amt;
	}
	String getName()
	{
		return name;
	}
	double getBalance()
	{
		return balance;
	}
	void deposit(double amt)
	{
		balance += amt;
		System.out.println("Depositing : "+ amt);
	}
	void withdraw(double amt)
	{
		balance-=amt;
		System.out.println("WithDraw : "+amt);
	}
}
class SavingsAccount extends Account
{
	double interestRate;
	SavingsAccount(String n, double amt,double rate)
	{
		super(n,amt);
		interestRate = rate;
	}
}
class CheckingAccount extends Account
{
	double overDraft;
	CheckingAccount(String n,double amt)
	{
		super(n,amt);
	}
	CheckingAccount(String n, double amt,double draft)
	{
		super(n,amt);
		overDraft = draft;
	}
	/*overriding the method calculating the withdraw amount.
	@param amt is received to subtract from the balance*/
	void withdraw(double amt)
	{
		System.out.println("Overdraft Amount:"+overDraft);
		if(amt <= balance)
		{
			balance-=amt;
			System.out.println("Withdrawing : "+amt);
		}
		else if((amt>balance)&&(amt>(balance+overDraft)))
		{
			System.out.println("Sorry! You cannot withdraw");
		}
		else
		{
			double result = amt-balance;
			overDraft -= result;
			balance = 0;
			System.out.println("Withdrawing:"+amt);
			System.out.println("Current overDraft Amount:"+overDraft);
		}
	}
}
class AccountTest
{
	public static void main(String s[])
	{
		SavingsAccount savObj = new SavingsAccount("John",500,4);
		System.out.println("\nSavings Account Details");
		System.out.println("---------------------------------");
		System.out.println("" +savObj.getName()+" has an initial Balance of: "+savObj.getBalance());
		savObj.deposit(200);
		savObj.withdraw(200);
		System.out.println(""+savObj.getName()+" at the end of transaction has a balance of:"
		+savObj.getBalance());
		System.out.println("\n CHECKING ACCOUNT DETAILS");
		System.out.println("----------------------------------");
		CheckingAccount checkObj = new CheckingAccount("Stephen",200  );
		System.out.println(""+checkObj.getName()+" has intitail balance of:"
		+ checkObj.getBalance());
		checkObj.deposit(200);
		checkObj.withdraw(500);
		System.out.println(""+checkObj.getName()+" at the end of tarnsaction has a balnce of:"
		+ checkObj.getBalance());
	}
}