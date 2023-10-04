import java.util.Scanner;
import examfeedback;

class FeedbackDemo{
	public static void main(String args[]){
		Student s= new Student[5];
		Scanner in=new Scanner(System.in);
		for(Student i:s){
			System.out.print("Enter name: ");
			String name=in.next();
			System.out.print("Enter reg no: ");
			int rno=in.nextInt();
			System.out.print("Enter course code: ");
			String ccode=in.next();
			System.out.print("Enter marks obtained: ");
			int marks=in.nextInt();
			System.out.println("Enter your feedback:-\nIs any question from out of syllabus? (Yes / No)");
			String oos=in.next();
			System.out.println("Standard of Questions in QP. (Good/Medium/Low)");
			String stdq=in.next();
			System.out.print("Is time allotted sufficient? (Sufficient/Insufficient)");
			String time=in.next();
			System.out.print("Nature of QP (Tough/Normal/Easy)");
			String nat=in.next();
			i=new Stundent(name, rno, marks, ccode, oos, stdq, time, nat);
		}
	}
}
