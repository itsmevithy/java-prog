import examfeedback.Exam;
import examfeedback.Feedback;
import userexception.InvalidFeedbackException;
import java.util.Scanner;

public class Student extends Exam implements Feedback{
	int regno, marks;
	String feedback;
	public Student(String name, int rno, int marks, int ccode, String oos, String stdq, String time, String nat){
		this.name=name;
		this.ccode=ccode;
		OutOfSbs=oos;
		qsStd=stdq;
		this.time=time;
		qpNat=nat;
		regno=rno;
		this.marks=marks;
		this.getFeedback();
	}
	public void getFeedback(){
		Scanner in=new Scanner(System.in);
		System.out.print("Enter your overall feedback: ");
		try{
			feedback=in.nextLine();
			if(feedback.length()<10) throw new InvalidFeedbackException();
		}
		catch(InvalidFeedbackException ife){
			System.out.println("InvalidFeedbackException. Enter min 10 characters...");
			this.getFeedback();
		}
	}
	public void displayMarks(){
		System.out.println("The total marks scored was: "+marks);
	}
	public void display(){
		System.out.println("Name: "+name+"\nReg no: "+regno+"\nCourse code: "+ccode+"\nFeedback details:-\nOut of syllabus questions present: "+OutOfSbs+"\nStandard of qp: "+qsStd+"\nHad sufficient time: "+time+"\nNature of qp: "+qpNat+"\nGeneral feedback: "+feedback);
		this.displayMarks();
	}	
}
