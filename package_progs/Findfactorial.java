package Factorial;

public class Findfactorial{
	public int fact(int x){
		int a=1;
		for(; x>0; x--) a*=x;
		return a;		
	}
}