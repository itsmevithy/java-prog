package accounttypes;
import bank.*;
import java.util.Scanner;
import bankexceptions.InvalidAmountException;
import bankexceptions.InsufficientFundsException;

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
	public void deposit(double amount) throws InvalidAmountException{
                if(amount<=0) throw new InvalidAmountException();
		balance+=amount;
		System.out.println("Done!");
	}
	public boolean withdraw(double amount) throws InsufficientFundsException{
		double oldbal=balance;
		if(amount>=amount) throw new InsufficientFundsException();
		balance-=(balance<=amount)?0:amount;
		//System.out.println(((oldbal>amount)?("Done. New "):("Failed. Insufficient balance. "))+"balance: "+balance);
		return (oldbal>amount)?true:false;
	}
	public void transfer(SavingsAccount q){
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
	public double balanceEnquiry(){
		return balance;
	}
}
