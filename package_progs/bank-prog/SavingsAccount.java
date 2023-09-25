package accounttypes;
import bank.*;
import java.util.Scanner;

public class SavingsAccount extends BankAccount implements Transaction{
	double interestRate;
	public SavingsAccount(int acno, String name, double bal, double intr){
		accountNumber=acno;
		accountHolderName=name;
		balance=bal;
		interestRate=intr;
	}
	public void displayAccountDetails(){
		System.out.println("Account no: "+accountNumber+"\nAccount holder name: "+accountHolderName+"\nBalance: "+balance+"Interest rate: "+interestRate);
	}
	public double calculateInterest(){
		return interestRate;
	}
	public void deposit(double amount){
		balance+=amount;
		System.out.println("Done!");
	}
	public boolean withdraw(double amount){
		double oldbal=balance;
		balance-=(balance<=amount)?0:amount;
		//System.out.println(((oldbal>amount)?("Done. New "):("Failed. Insufficient balance. "))+"balance: "+balance);
		return (oldbal>amount)?true:false;
	}
	public void transfer(SavingsAccount q){
		Scanner in=new Scanner(System.in);
		System.out.print("Enter amont to transfer: ");
		double amt=in.nextDouble();
		System.out.println("Withdrawing amount from payer...");
		if(this.withdraw(amt)){
			System.out.println("Tranferring to payee...");
			q.deposit(amt);
		}
	}
	public double balanceEnquiry(){
		return balance;
	}
}
