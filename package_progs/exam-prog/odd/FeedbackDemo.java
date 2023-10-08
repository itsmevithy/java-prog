import java.util.Scanner;
import userexception.IncorrectCourseCodeException;

class FeedbackDemo{
	static int getCC(){
		Scanner in=new Scanner(System.in);
		int ccode=in.nextInt();
		try{if(ccode!=101&&ccode!=103&&ccode!=105) throw new IncorrectCourseCodeException();}
		catch(IncorrectCourseCodeException e){
			System.out.print("Enter valid course code!!!");
			ccode=getCC();
		}
		return ccode;
	}
	public static void main(String args[]){
		Student s[]= new Student[5];
		Scanner in=new Scanner(System.in);
		for(int p=0; p<1; p++){
			System.out.print("Enter name: ");
			String name=in.next();
			System.out.print("Enter reg no: ");
			int rno=in.nextInt();	
			System.out.print("Enter course code[101- DSD, 103-Data Structures, 105-Computer Organisation]: ");
			int ccode=getCC();
			System.out.print("Enter marks obtained: ");
			int marks=in.nextInt();
			System.out.print("Enter your feedback:-\nIs any question from out of syllabus? (Yes / No): ");
			String oos=in.next();
			System.out.println("Standard of Questions in QP. (Good/Medium/Low) ");
			String stdq=in.next();
			System.out.print("Is time allotted sufficient? (Sufficient/Insufficient) ");
			String time=in.next();
			System.out.print("Nature of QP (Tough/Normal/Easy) ");
			String nat=in.next();
			s[p]=new Student(name, rno, marks, ccode, oos, stdq, time, nat);
		}
		System.out.print("Are you a student or faculty?[0-Student, 1-Faculty]:");

		switch(in.nextInt()){
			case 0:
				System.out.println("Access denied!!");
				break;
			case 1:
				System.out.println("The feedback of the students are as follows:-");
				for(Student a:s) a.display();
				break;
		}
	}
}
