import p1.one;
import java.util.Scanner;

class two{
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		System.out.print("Enter element to search: ");
		int arr[]={1, 5, 35, 8, 12, 34};
		one a=new one(in.nextInt());
		System.out.println("Element "+((a.search(arr))?"found.":"not found."));
	}
}
