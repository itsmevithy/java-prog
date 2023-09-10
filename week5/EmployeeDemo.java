import java.util.Scanner;

abstract class EmployeeData{
	protected String name, department;
	protected double basicpay, da, hra, pf, lic;
	abstract void getDetails(double da, double hrf, double pf, double lic);
	abstract void calculateSal();
	abstract void display();
}
class Employee extends EmployeeData{
	String designation;
	double GrossPay, NetPay;
	Employee(String name, String dept, double bpay, int i){
		designation=(i==1)?"Manager":(i==2)?"Scientist":(i==3)?"SoftwareAnalyst":"Unknown";
		this.name=name;
		this.basicpay=bpay;
		department=dept;
	}
	void getDetails(double da, double hra, double pf, double lic){
		this.da=da;
		this.hra=hra;
		this.pf=pf;
		this.lic=lic;
	}
	void calculateSal(){
		GrossPay=basicpay+da+hra;
		NetPay=GrossPay-pf-lic;
	}
	void display(){
		System.out.println("Employee name: "+name);
		System.out.println("Designation: "+designation);
		System.out.println("Department: "+department);
		System.out.println("Basic pay: Rs. "+basicpay);
		System.out.println("Net pay: Rs. "+NetPay);
		System.out.println("Gross pay: Rs. "+GrossPay);
	}
}

class EmployeeDemo{
	public static void main(String a[]){
		Scanner in=new Scanner(System.in);
		System.out.print("Enter number of employees: ");
		int n=in.nextInt();
		Employee e1[]= new Employee[n];
		String name, department;
		double basicpay;
		boolean choice=false;
		for(int i=0; i<n; i++){
			System.out.println("Enter employee "+(i+1)+"'s details;-");
			System.out.print("Name: ");
			name=in.next();
			System.out.print("Department: ");
			in.skip("[\r\n]+");
			department=in.nextLine();
			System.out.print("Basic pay: ");
			basicpay=in.nextDouble();
			System.out.print("Designation: Enter 1-Manager, 2-Scientist, 3-Software Analyst: ");
			e1[i]=new Employee(name, department, basicpay, in.nextInt());
			System.out.print("DA, HRA, PF and LIC: ");
			e1[i].getDetails(in.nextDouble(), in.nextDouble(), in.nextDouble(), in.nextDouble());
			e1[i].calculateSal();
			System.out.println("Employee details updated.");
		}
		for(int i=0; i<n; i++){
			System.out.println("\nDetails of employee "+(i+1)+":-");	
			e1[i].display();
		}
	}
}
