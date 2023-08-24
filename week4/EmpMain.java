import java.util.Scanner;

class Employee{
	protected String name, id, department, designation;
	protected double salary;
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
    public String toString(){
        return String.valueOf("Name: "+name+"\nID: "+id+"\nDept: "+department+"\nDesignation: "+designation+"\nSalary: "+salary);
    }
	public void displayDetails(){
		System.out.println(this);
	}
}

class Manager extends Employee{
	double bonus;
	public double computeSalary(double bonusamount){
		return salary+bonusamount;
	}
    public String toString(){
        return String.valueOf(this.toString()+"\nBonus: "+bonus);
    }
	public void displayNew(){
		System.out.println(this);
	}
	Manager(String name1, String id1, String department1, String designation1, double salary1, double bonus1){
		super(name1, id1, department1, designation1, salary1);
        salary=this.computeSalary(bonus1);
		bonus=bonus1;
	} 
}

class EmpMain{
    public static void main(String a[]){
        Scanner scn=new Scanner(System.in);
        Manager m[]=new Manager[2];
        for(int i=0; i<2; i++){
            System.out.println("Enter name: ");
            String name=scn.nextLine();
            System.out.println("Enter ID: ");
            String id=scn.nextLine();
            System.out.println("Enter dept: ");
            String dept=scn.nextLine();
            System.out.println("Enter designation: ");
            String desig=scn.nextLine();
            System.out.println("Enter salary: ");
            double salary=scn.nextDouble();
            System.out.println("Enter bonus: ");
            double bonus=scn.nextDouble();
            scn.skip("[\r\n+]");
            scn.skip("[\r\n+]");
            m[i]= new Manager(name, id, dept, desig, salary, bonus);
        }
        for(int i=0; i<2; i++) m[i].displayNew();
        scn.close();
    }
}