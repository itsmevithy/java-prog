package bankexceptions;

public class InvalidAmountException extends Exception{
	public InvalidAmountException(){
		super("Invalid amount. Amount is less than or equal to 0.");
	}
}
