import java.util.Scanner;

class Book{
	String title, author;
	public int rating;
	double price;
	
	Scanner in=new Scanner(System.in);
	void initData(){
		System.out.print("Enter title of the book: ");
		title=in.nextLine();
		System.out.print("Enter name of the author: ");
		author=in.nextLine();
		System.out.print("Rate the book from 1-10: ");
		rating=in.nextInt();
		System.out.print("Enter price(INR): ");
		price=in.nextDouble();
	}
	void display(int n){
		System.out.println("Book "+(n+1)+":-"+"\nTitle: "+title+"\nAuthor: "+author+"\nPrice(INR): "+price+"\nRating: "+rating);
	}	
}

class BookMain{
	public static void main(String a[]){
		Scanner in=new Scanner(System.in);
		System.out.println("Enter number of books: ");
		int i, maxrating=0, maxi=0, size=in.nextInt();
		Book b[]=new Book[size];
		for(i=0; i<size; i++){
			System.out.println("Details of book "+(i+1)+":-");
			b[i]=new Book();
			b[i].initData();
			if(b[i].rating>maxrating){
				maxrating=b[i].rating;
				maxi=i;
			}
		}
		for(i=0; i<size; i++) b[i].display(i);
		System.out.println("The book with the highest rating is book "+(maxi+1)+". That is, ");
		b[maxi].display(maxi);
	}
}