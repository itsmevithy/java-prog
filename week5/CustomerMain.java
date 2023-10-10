import java.util.Scanner;

abstract class Account{
 	protected int accnumber;
	protected double balance;
	Account(){}
	abstract void display();
}
class SBAccount extends Account{
	SBAccount(int acno, double bal){
		accnumber=acno;
		balance=bal;
	}
	void deposit(double bal){
		balance+=bal;
		System.out.println("Done. New balance: "+balance);
	}
	void withdraw(double bal){
		double oldbal=balance;
		balance-=(balance<=bal)?0:bal;
		System.out.println(((oldbal>bal)?("Done. New "):("Failed. Insufficient balance. "))+"balance: "+balance);		
	}
	void calc_interest(){
		Scanner in=new Scanner(System.in);
		System.out.print("Enter rate of interest and time period: ");
		double interest=(in.nextDouble())*(in.nextInt())*(balance)/100;
		System.out.println("The interest for Rs "+balance+" is Rs "+interest+" per annum.");
	}
	void display(){}
}
class Customer extends SBAccount{
	int cust_id;
	String name, address;
	Customer(int acno, double bal){
		super(acno, bal);
	}
	void initdata(){
		Scanner in=new Scanner(System.in);
		System.out.print("Enter name: ");
		name=in.nextLine();
		System.out.print("Enter cust id: ");
		cust_id=in.nextInt();
		in.skip("[\n\r+]");in.skip("[\n\r+]");
		System.out.println("Enter address: ");
		address=in.nextLine();
	}
	void display(){
		System.out.println("Name: "+name+"\nCust ID: "+cust_id+"\nAcc no: "+accnumber+"\nAddress: "+address+"\nBalance: "+balance);
	}
}
class CustomerMain{
	public static void main(String a[]){
		int choice;
		Scanner in=new Scanner(System.in);
		System.out.print("Enter account number and balance: ");
		Customer p=new Customer(in.nextInt(), in.nextDouble());
		p.initdata();
		do{
			System.out.print("Enter choice [1-Deposit, 2-Withdraw, 3-Calculate interest, 4-Display, ANY KEY- End]: ");
			choice=in.nextInt();
			switch(choice){
				case 1:
					System.out.print("Enter amount to be deposited: ");
					p.deposit(in.nextDouble());
					break;
				case 2:
					System.out.print("Enter amount to be withdrawn: ");
					p.withdraw(in.nextDouble());
					break;
				case 3:
					p.calc_interest();
					break;
				case 4:
					p.display();
					break;
				default:
					choice=0;
					System.out.println("Exiting...");
					p.display();
					break;
			}
		}while(choice!=0);
	}
}
