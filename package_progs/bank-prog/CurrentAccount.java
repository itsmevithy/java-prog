package accounttypes;
import bank.*;
import java.util.Scanner;
import bankexceptions.InvalidAmountException;
import bankexceptions.InsufficientFundsException;

public class CurrentAccount extends BankAccount implements Transaction{
	double overdraftLimit;
	public CurrentAccount(int acno, String name, double bal, double ovdftlim){
		accountNumber=acno;
		accountHolderName=name;
		balance=bal;
		overdraftLimit=ovdftlim;
	}
	public void displayAccountDetails(){
		System.out.println("Account no: "+accountNumber+"\nAccount holder name: "+accountHolderName+"\nBalance: "+balance+"\nOverdraft Limit: "+overdraftLimit);
	}
	public void deposit(double amount) throws InvalidAmountException{
		if(amount<=0) throw new InvalidAmountException();
		balance+=amount;
		System.out.println("Done!");
	}
	public boolean withdraw(double amount) throws InsufficientFundsException{
		boolean res;
		if(amount>=balance){
			if(amount>=overdraftLimit) throw new InsufficientFundsException();
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
	public void transfer(CurrentAccount q){
                Scanner in=new Scanner(System.in);
                System.out.print("Enter amont to transfer: ");
                double amt=in.nextDouble();
                System.out.println("Withdrawing amount from payer...");
                try{
			if(this.withdraw(amt)){
                        	System.out.println("Tranferring to payee...");
                        	q.deposit(amt);
                	}
		}
		catch (InvalidAmountException iae){
			System.out.println (iae.getMessage ());
		}
		catch (InsufficientFundsException ife){
			System.out.println (ife.getMessage ());
		}
        }

}
