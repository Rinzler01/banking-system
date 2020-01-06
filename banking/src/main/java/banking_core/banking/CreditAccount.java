package banking_core.banking;

public class CreditAccount
{
	InterestRate rate;
	public CreditAccount(int id, String name, double amount, InterestRate rate)
	{
		super(id, name, amount);
		
		this.rate = rate;
		
		
	}
	
	public double rate()
	{
		this.rate = rate;
		
	}
	
}
