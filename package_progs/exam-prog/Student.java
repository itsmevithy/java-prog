import examfeedback.Exam;
import examfeedback.Feedback;
import userexception.InvalidFeedBackException;
import java.util.Scanner;

public class Student extends Exam implements Feedback{
	int regno, marks;
	public Student(String name, int rno, int marks, String ccode, String oos, String stdq, String time, String nat){
		this.name=name;
		this.ccode=ccode;
		OutofSbs=oos;
		qsStd=stdq;
		this.time=time;
		qpNat=nat;
		regno=rno;
		this.marks=marks;
	}
	public void getFeedback(){
		Scanner in=new Scanner(System.in);
		String feedback;
		System.out.println("Enter your feedback: ");
		try{
			feedback=in.nextLine();
			if(feedback.length()<10) throw new InvalidFeedbackException;
		}
		catch(InvalidFeedbackException ife){
			System.out.println("InvalidFeedbackException caught.");
		}
	}
	public void displayMarks(){
		System.out.println("The total marks scored is: "+marks+"/100");
	}	
}
