import java.util.Scanner;

class AddTable implements Runnable{
	int n, mul;
	AddTable(int p, int m){
		n=p;
		mul=m;
	}
	public void run(){
		System.out.println("Addtion table of "+mul+" upto "+n);
		for(int i=0; i<n; i++) System.out.println(mul+"+"+i+"="+(mul+i));
	}
}

class SubTable implements Runnable{
	int n, mul;
	SubTable(int p, int m){
		n=p;
		mul=m;
	}
	public void run(){
		System.out.println("Subtraction table of "+mul+" upto "+n);
		for(int i=0; i<n; i++) System.out.println(mul+"-"+i+"="+(mul-i));
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

