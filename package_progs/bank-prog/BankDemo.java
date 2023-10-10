import accounttypes.CurrentAccount;
import accounttypes.SavingsAccount;
import bank.*;
import bankexceptions.InvalidAmountException;
import bankexceptions.InsufficientFundsException;
import java.util.Scanner;

class BankDemo{
	public static void main(String a[]){
		try{
		int choice, i;
		Scanner in=new Scanner(System.in);
		SavingsAccount p[]=new SavingsAccount[2];
		for(i=0; i<2; i++){
			System.out.println("For customer "+(i+1)+": ");
			System.out.print("Enter name: ");
			String name=in.nextLine();
			System.out.print("Enter account number: ");
			int acno=in.nextInt();
			System.out.print("Enter interest: ");
			double intr=in.nextInt();
			System.out.print("Enter current balance: ");
			double bal=in.nextDouble();
			p[i]=new SavingsAccount(acno, name, bal, intr);
		}
		for(i=0; i<2; i++){
			System.out.println("For customer "+(i+1)+": ");
			do{
				System.out.print("Enter choice [1-Deposit, 2-Withdraw, 3-Calculate interest, 4-Display;, 5-Transfer, ANY KEY- End]: ");
				choice=in.nextInt();
				switch(choice){
					case 1:
						System.out.print("Enter amount to be deposited: ");
						double amt=in.nextDouble();
	//					if(amt<=0) throw new InvalidAmountException();
						p[i].deposit(amt);
						break;
					case 2:
						System.out.print("Enter amount to be withdrawn: ");
						p[i].withdraw(in.nextDouble());
						break;
					case 3:
						System.out.println(p[i].calculateInterest());
						break;
					case 4:
						p[i].displayAccountDetails();
						break;
					case 5:
						int c=(i==0)?1:0;
						System.out.println("Automatically transferring to person "+(c+1)+"..");
						p[i].transfer(p[c]);
					default:
						choice=0;
						System.out.println("Exiting...");
						p[i].displayAccountDetails();
						break;
				}
			}while(choice!=0);
		}
	CurrentAccount q[]=new CurrentAccount[2];
		for(i=0; i<2; i++){
			System.out.println("For customer "+(i+1)+": ");
			System.out.print("Enter name: ");
			String name=in.nextLine();
			System.out.print("Enter account number: ");
			int acno=in.nextInt();
			System.out.print("Enter interest: ");
			double intr=in.nextInt();
			System.out.print("Enter current balance: ");
			double bal=in.nextDouble();
			p[i]=new SavingsAccount(acno, name, bal, intr);
		}
		for(i=0; i<2; i++){
			System.out.println("For customer "+(i+1)+": ");
			do{
				System.out.print("Enter choice [1-Deposit, 2-Withdraw, 3-Check overdraft limit, 4-Display;, 5-Transfer, ANY KEY- End]: ");
				choice=in.nextInt();
				switch(choice){
					case 1:
						System.out.print("Enter amount to be deposited: ");
						double amt=in.nextDouble();
	//					if(amt<=0) throw new InvalidAmountException();
						q[i].deposit(amt);
						break;
					case 2:
						System.out.print("Enter amount to be withdrawn: ");
						q[i].withdraw(in.nextDouble());
						break;
					case 3:
						System.out.println(q[i].checkOverdraftLimit());
						break;
					case 4:
						q[i].displayAccountDetails();
						break;
					case 5:
						int c=(i==0)?1:0;
						System.out.println("Automatically transferring to person "+(c+1)+"..");
						q[i].transfer(q[c]);
					default:
						choice=0;
						System.out.println("Exiting...");
						q[i].displayAccountDetails();
						break;
				}
			}while(choice!=0);
		}
	}
	catch (InvalidAmountException iae){
		System.out.println(iae.getMessage());
	}
	catch (InsufficientFundsException ife){
		System.out.println(ife.getMessage());
	}
	}
}
