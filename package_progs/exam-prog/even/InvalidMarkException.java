package customexception;

public class InvalidMarkException extends Exception{
	public InvalidMarkException(){
		super("Enter mark in range 0-100!!!\n");
	}
}
