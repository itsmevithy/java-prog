import java.io.*;
import java.util.Scanner;

class EBBill implements Serializable{
	int houseno;
	String name;
	int start;
	int end;
	static Scanner in=new Scanner(System.in);
	static FileOutputStream fout=null;
	static ObjectOutputStream out=null;
	static File f=new File("EBBill.txt");

	EBBill(int houseno, String name, int start, int end){
		this.houseno=houseno;
		this.name=name;
		this.start=start;
		this.end=end;
		while(this.start>this.end){
			System.out.println("Enter valid start and end values: ");
			this.start=in.nextInt();
			this.end=in.nextInt();
		}
	}
	public String toString(){
		return ("\nTenent name: "+name+"\nHouse no: "+houseno+"\nReading start: "+start+" units\nReading end: "+end+" units\nBill: Rs "+(end-start)*10);
	}
	void SaveData(){
		try{fout=new FileOutputStream(f, true);}
		catch(FileNotFoundException fnf){
			try{
				fout=new FileOutputStream(f, false);}
			catch(Exception e){}
		}
		try{
			out=new ObjectOutputStream(fout);
			out.writeObject(this);
			fout.close();
			out.close();
		}
		catch(Exception e){}
	}
	void CalculateBill(){
		System.out.println("Amount to be entered is: RS "+(end-start)*10);
	}
	public void view(){
		FileInputStream fin;
		ObjectInputStream in=null;
		try{
			fin=new FileInputStream("EBBill.txt");
			for(int i=0; i<4; i++){ 			
				in=new ObjectInputStream(fin);
				System.out.println(in.readObject());
			}
			fin.close();
			in.close();
		}
		catch(Exception e){}
	}
}

class EBillSerial{
	public static void main(String a[]){
		EBBill ob[]=new EBBill[4];
		for(int i=0; i<4; i++){
			System.out.print("Enter details for house "+(i+1)+" [house number, name, start reading, end reading]: ");
			ob[i]=new EBBill(EBBill.in.nextInt(), EBBill.in.next(), EBBill.in.nextInt(), EBBill.in.nextInt());
			ob[i].SaveData();
			ob[i].CalculateBill();
		}
		System.out.println("Written Successfully...");
		ob[2].view();
	}
}