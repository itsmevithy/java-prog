import Uni.University;
import customexception.NotEligibleException;

public class StudentDetails extends University{
	String name, mailid, mob_no, clvl;
	int cid=0;
	float cgpa=0;
	public StudentDetails(){}
	public StudentDetails(String name, String mid, String mno, int lvl, int marks[]){
		this.name=name;
		mailid=mid;
		mob_no=mno;
		clvl=(lvl==0)?"UG":"PG";
		for(int i=0; i<5; i++){
			cgpa+=marks[i];
		}
		this.calculate();
	}
	public static StudentDetails top[]=new StudentDetails[2];
	//for(int i=0; i<2; i++) top[i]=new StudentDetails();
	void calculate(){
		if(clvl=="UG") cgpa/=5;
		else cgpa/=50;
		cid=(((cgpa>7.5)&&(cgpa<=8.5))?301:(cgpa>8.5&&cgpa<=10)?201:(cgpa>80)?101:0);
		if(cid!=0) max[cid/100-1]-=1;
		try{ if(cid==0) throw new NotEligibleException();}
		catch(NotEligibleException nee){
			System.out.println("NotEligibleException encountered...");
		}
		if(cgpa>top[0].cgpa){
			top[1]=top[0];
			top[0]=this;
		}
		else if(cgpa>top[1].cgpa) top[1]=this;
	}
	static void findTop(){
		System.out.println("The top 2 students with highest marks are, ");
		for(StudentDetails a:top) a.displayDetails();
	}
	public void displayDetails(){
		System.out.println("\nName: "+name+"\nCourse id: "+cid+"\nCourse: "+courses[cid/100]+"\nCourse level: "+clvl+"\nCGPA: "+cgpa+"\nUniversity: "+uni_name+"\nMail id: "+mailid+"\nMob. no: "+mob_no);
	}	
}

