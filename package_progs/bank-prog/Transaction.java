package bank;

public interface Transaction{
	public abstract void deposit(double amount);
	public abstract boolean withdraw(double amount);
}
