package customexception;

public class NotEligibleException extends Exception{
	public NotEligibleException(){
		super("Not eligible for any course...\n");
	}	
}
