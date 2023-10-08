package userexception;

public class IncorrectCourseCodeException extends Exception{
	public IncorrectCourseCodeException(){
		super("Incorrect course code entered.\n");
	}
}
