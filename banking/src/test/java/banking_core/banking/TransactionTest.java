package banking_core.banking;



import org.junit.Test;
import static org.junit.Assert.*;

public class TransactionTest 
{

	@Test
	public void transaction_created_balance_is_equal_to_deposit()
	{
		
		double initAmount = 67.77;
		double expectedResult = 67.77;
		
		
		Transaction t1 = new Transaction(initAmount);
		double actualResult = t1.getAmount();
		
		assertEquals(expectedResult, actualResult, 0.0);
		
		
	}
	

}
