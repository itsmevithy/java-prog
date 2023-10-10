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
        return ("Name: "+name+"\nID: "+id+"\nDept: "+department+"\nDesignation: "+designation+"\nSalary: "+salary);
    }
	public void displayDetails(){
		System.out.println(this);
	}
}

class Manager extends Employee{
	double bonus;
    Manager(String name1, String id1, String department1, String designation1, double salary1, double bonus1){
		super(name1, id1, department1, designation1, salary1);
        salary=this.computeSalary(bonus1);
		bonus=bonus1;
	} 
	public double computeSalary(double bonusamount){
		return salary+bonusamount;
	}
    public String toString(){
        return ("Name: "+name+"\nID: "+id+"\nDept: "+department+"\nDesignation: "+designation+"\nSalary(net): "+salary+"\nBonus: "+bonus);
    }
	public void displayNew(){
		System.out.println(this);
	}
    public String getName(){return name;}
    public String getId(){return id;}
    public double getSalary(){return salary;}
    public String getDepartment(){return department;}
    public String getDesignation(){return designation;}
    public double getBonus(){return bonus;}
}

class EmpMain{
    public static void main(String a[]){
        Scanner scn=new Scanner(System.in);
        System.out.print("Enter number of managers: ");
        int size= scn.nextInt();
        Manager m[]=new Manager[size];
        for(int i=0; i<size; i++){
            System.out.println("\nDetails of manager "+(i+1)+":-");
            scn.skip("[\r\n+]");
            scn.skip("[\r\n+]");
            System.out.print("Enter name: ");
            String name=scn.nextLine();
            System.out.print("Enter ID: ");
            String id=scn.nextLine();
            System.out.print("Enter dept: ");
            String dept=scn.nextLine();
            System.out.print("Enter designation: ");
            String desig=scn.nextLine();
            System.out.print("Enter salary: ");
            double salary=scn.nextDouble();
            System.out.print("Enter bonus: ");
            double bonus=scn.nextDouble();
            scn.skip("[\r\n+]");
            scn.skip("[\r\n+]");
            m[i]= new Manager(name, id, dept, desig, salary, bonus);
        }
        System.out.println("\nDisplaying using method displayNew():-");
        for(int i=0; i<size ; i++){
            System.out.println("Details of manager "+(i+1)+": ");
            m[i].displayNew();
            System.out.print('\n');
        }
        System.out.println("Displaying using method get_____():-");
        for(int i=0; i<size; i++) System.out.println("Details of manager "+(i+1)+":- \nName: "+m[i].getName()+"\nID: "+m[i].getId()+"\nDept: "+m[i].getDepartment()+"\nDesignation: "+m[i].getDesignation()+"\nSalary(net): "+m[i].getSalary()+"\nBonus: "+m[i].getBonus());
            scn.close();
    }
}