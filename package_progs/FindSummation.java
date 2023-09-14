package Summation;
import Factorial.Findfactorial;

public class FindSummation{
	public double sum(int n){
		double a=0;
		Findfactorial f=new Findfactorial();
		for(; n>0; n--) a+=(1.0/f.fact(n));
		return a;
	}
}