package bankexceptions;

public class InvalidAmountException extends Exception{
	InvalidAmountException(){
		super("Withdrawl failed. Insufficient funds in account.");
	}	
}