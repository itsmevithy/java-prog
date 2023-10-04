package examfeedback;

abstract class Exam{
	public String ccode, name, OutOfSbs, qsStd, time, qpNat;
	public abstract void displayMarks();
	public void displayExamDetails(){
		System.out.println("CIA - II");
	}
}
