package accounttypes;
import bank.*;

public class CurrentAccount extends Bankaccount implements Traansaction{
	double overdraftLimit;
	public CurrentAccount(double acno, String name, double bal, double ovdftlim){
		accountNumber=acno;
		accountHolderName=name;
		balance=bal;
		overdraftLimit=ovdftlim;
	}
	public void displayAccountDetails(){
		System.out.println("Account no: "+accountNumber+"\nAccount holder name: "+accountHolderName+"\nBalance: "+balance+"\nOverdraft Limit: "+overdraftLimit);
	}
	public void deposit(double amount){
		balance+=amount;
		System.out.println("Done!");
	}
	public boolean withdraw(double amount){
		boolean res;
		if(amount>=balance){
			if(amount>=overdraftLimit) return false;
			amount-=balance;
			balance=0.0;
			overdraftLimit-=amount;}
		else balance-=amount;	
		return true;
//		System.out.println(((oldbal>amount)?("Done. New "):("Failed. Insufficient balance. "))+"balance: "+balance);
	}
	public double checkOverdraftLimit(){
		return overdraftLimit;
	}
}