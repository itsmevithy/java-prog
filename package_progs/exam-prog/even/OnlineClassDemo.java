import java.util.Scanner;
import customexception.InvalidMarkException;
import Uni.University;

class OnlineClassDemo{
	public static void main(String a[]){
		Scanner in=new Scanner(System.in);
		int n, choice=1;
		System.out.print("Enter university name: ");
		University.uni_name=in.next();
		System.out.print("Enter max number of seats per course: ");
		n=in.nextInt();
		for(int i=0; i<3; i++){
			University.max[i]=n;
		}
		System.out.print("Enter number of students: ");
		n=in.nextInt();
		StudentDetails s[]=new StudentDetails[n];
		for(int i=0; i<n; i++){
			System.out.print("\nFor student "+(i+1)+",\nEnter name: ");
			String name=in.next();
			System.out.print("Enter mail id: ");
			String mid=in.next();
			System.out.print("Enter mobile number: ");
			String mno=in.next();
			System.out.print("Enter level[0-UG, Any key- PG]: ");
			int lvl=in.nextInt();
			System.out.println("Enter marks in 5 subjects: ");
			int marks[]=new int[5];
			do{
				try{
					for(int j=0; j<5; j++){
						marks[j]=in.nextInt();
						if(marks[j]>100||marks[j]<0) throw new InvalidMarkException();
						else choice=1;
					}
				}
				catch(InvalidMarkException ime){
					System.out.println("InvalidMarkException encountered... Enter 5 valid marks, from beginning...");
					choice=0;
				}
			}while(choice==0);
			if(i<2) s[0].top[i]=new StudentDetails();
			s[i]=new StudentDetails(name, mid, mno, lvl, marks);	
		}
		System.out.println("\nPrinting student details..");
		for(StudentDetails p: s) p.displayDetails();
		System.out.println("\nRemaining seats in each branch:\nBBA-"+s[0].max[0]+"\nMCA-"+s[0].max[1]+"\nMBA-"+s[0].max[2]+"\n");
		if(s[0].top[0].cid!=0) s[0].findTop();
		else System.out.println("No toppers...");
	}
}
