package tests;
import banking_core.banking.Account;
import banking_core.banking.Transaction;


public class Tests 
{
	public static void main(String[] args)
	{
		Transaction t1 = new Transaction(90.11);
		
		System.out.println("Amount: " + t1.getAmount());
		System.out.println("When: " + t1.getWhen());
		
		double openingBalance = 56.78;
		
		Account acc = new Account(1, "Selvyn", openingBalance);
		
		if (openingBalance == acc.availableBalance()
			&& openingBalance == acc.getBalance())
			System.out.println("All good");
		
		else
			System.out.println("oops");
		
		
	}
	
	static void test_does_balance_match_after_debit()
	{
		double openingBalance = 56.77;
		double amountToDebit = 44.00;
		Account acc = new Account(1, "Selvyn", openingBalance);
		
		acc.debit(amountToDebit);
		
	}
	
	
}
