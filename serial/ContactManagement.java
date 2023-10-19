import java.util.*;

class DupeContactException extends Exception{
	DupeContactException(){
		super("Duplicate Conact!!\nContact already exits...\n");
	}
}
class Contact{
	String name, number;
	static Scanner in=new Scanner(System.in);
	Contact(){
		System.out.println("Enter number: ");
		number=in.next();
		boolean check;
		do{
			check=true;
			if(number.length<10) check=false;
			if(check) for(char i:number) if(i<'0'||i>'9') check=false;
			if(check){
				System.out.println("Enter valid mobile number: ");
				number=in.next();
			}
		}while(!check);
	}
}

class ContactManagement{
	public static void main(String a[]){
		ArrayList<Contact> clist=new ArrayList<Contact>();
		System.out.println("Enter number of entries: ");
		int n=Contact.in.nextInt();
		for(i=0; i<n; i++){
			Contact c=new Contact();
			Iterator l=clist.iterator();
			while(l.hasNext()){
				Contact p=l.next();
				try{ if(p.number==c.number) throw new DupeContactException();}
				catch(DupeContactException dce){
					dce.
				}
			}
			clist.add();
		}
	}
}

