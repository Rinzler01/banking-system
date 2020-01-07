package banking_core.banking;
import org.junit.Test;
import static org.junit.Assert.*;


public class AccountTest 
{
	@Test
	public void account_credit()
	{
		
		double openingBalance = 56.77;
		double amountToDebit = 44.00;
		Account acc = new Account(1, "Selvyn", openingBalance, InterestRate.HOME_LOAN);
		
		assertNotEquals(openingBalance, amountToDebit, 0.0);
		
		
	}
	

}
