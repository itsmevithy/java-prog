import java.util.Scanner;

class Factorial implements Runnable{
	int n;
	Factorial(int p){
		n=p;
	}
	int fact(int x){
		int f=1;
		for(; x>0; x--) f*=x;
		return f;
	}
	public void run(){
		for(int i=0; i<n; i++) System.out.println("Factorial of "+i+" is "+fact(i));
	}
}
class SumOfSeries implements Runnable{
	int n;
	SumOfSeries(int p){
		n=p;
	}
	int sum(int x){
		int sum=0;
		for(; x>0; x--) sum+=x;
		return sum;
	}
	public void run(){
		for(int i=0; i<n; i++) System.out.println("Sum upto "+i+" is "+sum(i));
	}
}
class MultiplicationTable implements Runnable{
	int n, mul;
	MultiplicationTable(int p, int m){
		n=p;
		mul=m;
	}
	public void run(){
		System.out.println("Multiplication table of "+mul+" upto "+n);
		for(int i=0; i<n; i++) System.out.println(mul+"x"+i+"="+(mul*i));
	}
}
class ArithThread{
	public static void main(String a[]) throws InterruptedException{
		System.out.println("Enter number of terms: ");
		Scanner in =new Scanner(System.in);
		int n=in.nextInt();
		Factorial f=new Factorial(n);
		SumOfSeries s=new SumOfSeries(n);
		System.out.println("Enter multiple for multipllication table: ");
		MultiplicationTable m=new MultiplicationTable(n, in.nextInt());
		Thread t1=new Thread(f);
		Thread t2=new Thread(s);
		Thread t3=new Thread(m);
		t1.start();
		try{t1.join();}
		catch(InterruptedException e){
			e.printStackTrace();
		}
		t2.start();
		try{t2.join();}
		catch(InterruptedException e){
			e.printStackTrace();
		}
		t3.start();
	}
}

