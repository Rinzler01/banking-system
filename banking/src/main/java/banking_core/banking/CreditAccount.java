package banking_core.banking;

public class CreditAccount extends Account
{
	InterestRate rate;
	public CreditAccount(int id, String name, double amount, InterestRate rate)
	{
		super(id, name, amount, rate);
		
		this.rate = rate;
		
		
	}
	
	public void rate(InterestRate rate)
	{
		this.rate = rate;
		
	}

	
	@Override
	public double debit(double amount)
	{
		if (super.availableBalance() - amount < 0)
		{
			amount += (rate.rate()/100)*amount;
			
		}
		return super.availableBalance();
	}
	
	
}
