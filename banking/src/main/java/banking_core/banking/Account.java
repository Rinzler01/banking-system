package banking_core.banking;

import java.util.AbstractList;
import java.util.ArrayList;

public class Account 
{
	private int id;
	private String name;
	private double balance;
	private AbstractList<Transaction> transactions = new ArrayList<>();
	
	
	public Account(int id, String name, double balance, InterestRate homeLoan)
	{
		this.id = id;
		this.name = name;
		
		credit(balance);
		
	}
	
	public  double credit(double amount)
	{
		balance += amount;
		transactions.add(new Transaction(amount));
		
		return balance;
	}
	
	public  double debit(double amount)
	{
		balance += amount * -1;
		transactions.add(new Transaction(amount*-1));
		
		return balance;
	}
	
	
	
	
	public int getId() 
	{
		return id;
	}
	
	
	public void setId(int id) 
	{
		this.id = id;
	}
	
	public String getName() 
	{
		return name;
	}
	
	public void setName(String name) 
	{
		this.name = name;
	}
	
	public double getBalance() 
	{
		return balance;
	}
	
	public void setBalance(double balance) 
	{
		this.balance = balance;
	}

	public double availableBalance() 
	{
		return getBalance();
	}

	public double currentBalance() 
	{
		return transactions.stream().mapToDouble(Transaction::getAmount).sum();
	}
	
	
}
