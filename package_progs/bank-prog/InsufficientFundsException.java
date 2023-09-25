package bankexceptions;

public class InsufficientFundsException extends Exception{
	InsufficientFundsException(){
		super("Withdrawl failed. Insufficient funds in account.");
	}	
}
