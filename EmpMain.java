import java.util.Scanner;

class Employee{
	String name, id, department, designation;
	double salary;
	Employee(){}
	Employee(String name1, String id1, String department1, String designation1, double salary1){
		name=name1;
		id=id1;
		department=department1;
		designation=designation1;
		salary=salary1;
	}
	Employee(Employee p){
		name=p.name;
		id=p.id;
		department=p.department;
		designation=p.designation;
		salary=p.salary;
	}
	void displayDetails(){
		System.out.println("Name: "+name+"\nID: "+id+"\nDept: "+department+"\nDesignation: "+designation+"\nSalary: "+salary);
	}
}

class Manager extends Employee{
	double bonus;
	double computeSalary(double bonusamount){
		return salary+bonusamount;
	}
	void displayNew(){
		this.displayDetails();
		System.out.println("Bonus: "+bonus);
	}
	Manager(String name1, String id1, String department1, String designation1, double salary1, double bonus1){
		super(name1, id1, department1, designation1, salary1);
		bonus=bonus1;
	}
}
