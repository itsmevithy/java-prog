package examfeedback;

public abstract class Exam{
	public String name, OutOfSbs, qsStd, time, qpNat;
	public int ccode;
	public abstract void displayMarks();
	public void displayExamDetails(){
		System.out.println("CIA - II");
	}
}
