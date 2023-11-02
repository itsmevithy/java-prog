import java.util.*;

class Stringops{
	private TreeSet<String> words;
	private int n;
	Stringops(){
		Scanner in=new Scanner(System.in);
		System.out.print("Enter number of words to be entered: ");
		n=in.nextInt();
		words=new TreeSet<String>();
		for(int i=0; i<n; i++) words.add(in.next());
		System.out.println("Original: "+words);
	}
	void reverse(){
		TreeSet<String> temp=new TreeSet<String>(words.descendingSet());
		System.out.println("Reversed: "+temp);
	}
	void capitalizePlurals(){
		ArrayList<String> word=new ArrayList<String>(words);
		Iterator w=word.iterator();
		while(w.hasNext()){
			String p=(String)w.next();
			if(p.endsWith("s")) word.add(p.toUpperCase());
		}
		Iterator wo=word.iterator();
		while(wo.hasNext()) if(((String)wo.next()).endsWith("s")) wo.remove();
		TreeSet<String> temp=new TreeSet<String>(word);
		System.out.println("After Capitalizing: "+temp);
	}
	void removePlurals(){
		TreeSet<String> temp=new TreeSet<String>(words);
		Iterator w=temp.iterator();
		String p;
		while(w.hasNext()){
			p=(String)w.next(); 
			if(p.endsWith("s")) w.remove();
		}
		System.out.println("After removing plurals: "+temp);
	}
}

class WordsTree{
	public static void main(String args[]){
			int i;
			Stringops a= new Stringops();
			a.reverse();
			a.capitalizePlurals();
			a.removePlurals();	
	}
}
