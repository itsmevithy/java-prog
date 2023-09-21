package bank;

public interface Transaction{
	public abstract void deposit(double amount);
	public abstract void withdraw(double amount);
}
