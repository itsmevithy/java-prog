import Summation.FindSummation;
import java.util.Scanner;

class Edemo{
	public static void main(String a[]){
		FindSummation p=new FindSummation();
		System.out.print("Enter number of terms: ");
		Scanner in=new Scanner(System.in);
		System.out.println("The sum is "+p.sum(in.nextInt()));
	}
}