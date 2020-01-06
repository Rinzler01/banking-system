package banking_core.banking;

public enum InterestRate 
{
	HOME_LOAN( 5.67), BUSINESS_LOAN(2.34);
	
	private final double rate;
	
	private InterestRate(double rate)
	{
		this.rate = rate;
		
	}
}
