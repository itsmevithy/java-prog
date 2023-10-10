package bank;
import bankexceptions.InsufficientFundsException;
import bankexceptions.InvalidAmountException;

public interface Transaction{
	public abstract void deposit(double amount) throws InvalidAmountException;
	public abstract boolean withdraw(double amount) throws InsufficientFundsException;
}
