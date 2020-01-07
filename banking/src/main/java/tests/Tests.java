package tests;
import banking_core.banking.Account;
import banking_core.banking.CreditAccount;
import banking_core.banking.InterestRate;
import banking_core.banking.Transaction;


public class Tests 
{
	public static void main(String[] args)
	{
		test_Transactions();
		test_initial_balance();
		test_does_balance_match_after_debit_on_CreditAccount();
		test_does_balance_match_after_debit();		
		
	}
	
	static void test_Transactions()
	{
		
		Transaction t1 = new Transaction(90.11);
		
		System.out.println("Amount: " + t1.getAmount());
		System.out.println("When: " + t1.getWhen());
	}
	
	
	public static void test_initial_balance()
	{
		double openingBalance = 56.78;
		
		Account acc = new CreditAccount(1, "Selvyn", openingBalance, InterestRate.BUSINESS_LOAN);
		
		if (openingBalance == acc.availableBalance()
			&& openingBalance == acc.currentBalance())
			System.out.println("Test_going_overdrawn_on_credit_account: PASSED");
		
		else
			System.out.println("Test_going_overdrawn_on_credit_account: Failed");
		
		
	}
	
		
	static void test_does_balance_match_after_debit()
	{
		double openingBalance = 56.77;
		double amountToDebit = 44.00;
		Account acc = new Account(1, "Selvyn", openingBalance, InterestRate.HOME_LOAN);
		
		acc.debit(amountToDebit);
		
		amountToDebit += amountToDebit * InterestRate.HOME_LOAN.rate()/100;
		if (openingBalance - amountToDebit == acc.availableBalance()
				&& (openingBalance - amountToDebit) == acc.currentBalance() )
		System.out.println("Tests_Balance+match_After_Debit: Passed");
		else 
			System.out.println("Tests_Balance+match_After_Debi:Failed");
		
		
		
	}
	
	
	
	static void test_does_balance_match_after_debit_on_CreditAccount()
	{
		double openingBalance = 56.77;
		double amountToDebit = 44.00;
		Account acc = new Account(1, "Selvyn", openingBalance, InterestRate.HOME_LOAN);
		
		acc.debit(amountToDebit);
		
		amountToDebit += amountToDebit * InterestRate.HOME_LOAN.rate()/100;
		if (openingBalance - amountToDebit == acc.availableBalance()
				&& (openingBalance - amountToDebit) == acc.currentBalance() )
		System.out.println("Test_going_Overdrawn_on_credit_account: Passed");
		else 
			System.out.println("Test_going_Overdrawn_on_credit_account:Failed");
		
		
		
	}
	
	
	
	
	
	
}
