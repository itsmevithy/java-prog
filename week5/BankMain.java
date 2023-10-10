import java.util.Scanner;

abstract class Account{
	protected int customer_id, account_num;
	static int transcount=0;
	String customer_name;
	abstract void deposit(double bal);
}
class SavingsAccount extends Account{
	protected double balance;
	SavingsAccount(String name, int acno, int cid, double bal){
		account_num=acno;
		balance=bal;
		customer_id=cid;
		customer_name=name;
	}
	void deposit(double bal){
		balance+=bal;
		transcount++;
		System.out.println("Done. New balance: "+balance);
	}
	boolean withdraw(double bal){
		double oldbal=balance;
		balance-=(balance<=bal)?0:bal;
		System.out.println(((oldbal>bal)?("Done. New "):("Failed. Insufficient balance. "))+"balance: "+balance);		
		transcount++;
		return (oldbal>bal)?true:false;
	}
	void addInterest(){
		Scanner in=new Scanner(System.in);
		System.out.print("Note: Interest for first term will be automatically deposited to account.\nEnter rate of interest and time period: ");
		double interest=(in.nextDouble())*(in.nextInt())*(balance)/100;
		System.out.println("The interest for Rs "+balance+" is Rs "+interest+" per annum.");
		balance+=interest;
	}
	void transfer(SavingsAccount q){
		Scanner in=new Scanner(System.in);
		System.out.print("Enter amont to transfer: ");
		double amt=in.nextDouble();
		System.out.println("Withdrawing amount from payer...");
		if(this.withdraw(amt)){
			System.out.println("Tranferring to payee...");
			q.deposit(amt);
		}
		transcount+=2;
	}
	void display(){
		System.out.println("Name: "+customer_name+"\nCust ID: "+customer_id+"\nAcc no: "+account_num+"\nBalance: "+balance);
	}
}
class BankMain{
	public static void main(String a[]){
		int choice;
		Scanner in=new Scanner(System.in);
		SavingsAccount p[]=new SavingsAccount[2];
		for(int i=0; i<2; i++){
			System.out.println("For customer "+(i+1)+": ");
			System.out.print("Enter name: ");
			String name=in.nextLine();
			System.out.print("Enter account number: ");
			int acno=in.nextInt();
			System.out.print("Enter cust id: ");
			int cid=in.nextInt();
			System.out.print("Enter current balance: ");
			double bal=in.nextDouble();
			p[i]=new SavingsAccount(name, acno, cid, bal);
		}
		for(int i=0; i<2; i++){
			System.out.println("For customer "+(i+1)+": ");
			do{
				System.out.print("Enter choice [1-Deposit, 2-Withdraw, 3-Calculate interest, 4-Display, 5-Transfer, ANY KEY- End]: ");
				choice=in.nextInt();
				switch(choice){
					case 1:
						System.out.print("Enter amount to be deposited: ");
						p[i].deposit(in.nextDouble());
						break;
					case 2:
						System.out.print("Enter amount to be withdrawn: ");
						p[i].withdraw(in.nextDouble());
						break;
					case 3:
						p[i].addInterest();
						break;
					case 4:
						p[i].display();
						break;
					case 5:
						int c=(i==0)?1:0;
						System.out.println("Automatically transferring to person "+(c+1)+"..");
						p[i].transfer(p[c]);
						break;
					default:
						choice=0;
						System.out.println("Exiting...");
						p[i].display();
						break;
				}
			}while(choice!=0);
		}
	}
}
