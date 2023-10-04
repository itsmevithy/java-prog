package userexception;

class IncorrectFeedbackException extends Exception{
	public IncorrectFeedbackException(){
		super("Less than 10 characters entered.\n");
	}
}
