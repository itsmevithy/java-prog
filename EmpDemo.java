import java.util.Scanner;

class Employee{
	String empname, empdesignation, empid;
	double basicpay, netpay;

	Employee(){}

	Employee(String empname, String empdesignation, String empid, double basicpay, double netpay){
		this.empname=empname;
		this.empdesignation=empdesignation;
		this.empid=empid;
		this.basicpay=basicpay;
		this.netpay=netpay;
	}
	void EmpUpdate(String name, String id, double bpay, double npay){
		this.empname=name;
		this.empid=id;
		this.basicpay=bpay;
		this.netpay=npay;
	}
	double payBill(double bpay){
		double da=0.18*bpay, hra=0.05*bpay, pf=0.08*bpay;
		return (bpay+da+hra-pf);
	}
	void display(){
		System.out.println("Employee name: "+empname);
		System.out.println("Designation: "+empdesignation);
		System.out.println("Employee id: "+empid);
		System.out.println("Basic pay: Rs. "+basicpay);
		System.out.println("Net pay: Rs. "+netpay);	
	}
}

class EmpDemo{
	public static void main(String a[]){
		Employee e1= new Employee();
		String name, id, designation;
		double basicpay;
		boolean choice=false;
		do{
			Scanner in=new Scanner(System.in);
			System.out.println("Enter employee's details;-");
			System.out.print("Name: ");
			name=in.next();
			System.out.print("Designation: ");
			in.skip("[\r\n]+");
			designation=in.nextLine();
			System.out.print("Employee ID: ");
			id=in.next();
			System.out.print("Basic pay: ");
			basicpay=in.nextDouble();
			if(!choice) e1=new Employee(name, designation, id, basicpay, e1.payBill(basicpay));
			else e1.EmpUpdate(name, id, basicpay, e1.payBill(basicpay));
			System.out.println("Employee details updated.");
			e1.display();
			System.out.println("Do you want to continue updating details?[y/n]");
			choice=(in.next().charAt(0)=='y')?true:false;
		}while(choice);
	}
}
