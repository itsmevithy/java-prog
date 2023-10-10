package userexception;

public class InvalidFeedbackException extends Exception{
	public InvalidFeedbackException(){
		super("Less than 10 characters entered.\n");
	}
}
