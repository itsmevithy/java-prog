import java.util.*;

class Stringops{
	private ArrayList<String> words;
	private int n;
	Stringops(){
		Scanner in=new Scanner(System.in);
		System.out.print("Enter number of words to be entered: ");
		n=in.nextInt();
		words=new ArrayList<String>();
		for(int i=0; i<n; i++) words.add(in.next());
	}
	void reverse(){
		ArrayList<String> temp=new ArrayList<String>();
		for(int i=n-1; i>=0; i--) temp.add(words.get(i));
		words.removeAll(temp);
		for(int i=0; i<n; i++) words.add(temp.get(i));
	}
	void capitalizePlurals(){
		for(int i=0; i<n; i++) if(((String)words.get(i)).endsWith("s")) words.set(i, ((String)words.get(i)).toUpperCase());
	}
	void removePlurals(){
		for(int i=0; i<words.size(); i++) if(((String)words.get(i)).endsWith("s")||((String)words.get(i)).endsWith("S")) words.remove(i);
		n=words.size();
	}
	void display(){	
		for(int i=0; i<n; i++) System.out.print(words.get(i)+((i!=n-1)?", ":"\n"));
	}
}

class StringMain{
	public static void main(String args[]){
			int i;
			Stringops a= new Stringops();
			System.out.println("\nBefore changes: ");
			a.display();

			a.reverse();
			System.out.println("\nAfter reverse: ");
			a.display();
			
			a.capitalizePlurals();
			System.out.println("\nAfter capitalising plurals: ");
			a.display();
			
			a.removePlurals();	
			System.out.println("\nAfter removing plurals: ");
			a.display();
	}
}
