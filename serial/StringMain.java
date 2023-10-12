import java.util.*;

class Stringops{
	void reverse(ArrayList<String> words){
		ArrayList<String> temp=new ArrayList<String>();
		Iterator w=words.iterator();
		while(w.hasNext()) temp.add((String)w.next());
		Iterator t=temp.iterator();
		words.removeAll(temp);
		for(int i=words.size()-1; i>0; i--) words.add(i, (String)t.next());
		w=words.iterator();
		while(w.hasNext()) System.out.println(w.next());
		System.out.println("Done");
	}
}

class StringMain{
	public static void main(String args[]){
			Stringops a=new Stringops();
			Scanner in=new Scanner(System.in);
			ArrayList<String> list=new ArrayList<String>();
			for(int i=0; i<5; i++) list.add(in.next());
			Iterator bef=list.iterator();
			a.reverse(list);
			while(bef.hasNext()) System.out.println("la "+bef.next());
	}
}