package bankexceptions;

public class InsufficientFundsException extends Exception{
	public InsufficientFundsException(){
		super("Withdrawl failed. Insufficient funds in account.");
	}
}
