import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

class Airlines{
	String Passenger_Name, Source, Destination;
	int Flight_Number, Passenger_ID;
	Scanner in=new Scanner(System.in);
	Airlines(){}
	Airlines(int x){
		System.out.println("Passenger name: ");
		Passenger_Name=in.next();	
		System.out.println("Passenger ID: ");
		Passenger_ID=in.nextInt();
		System.out.println("Flight number: ");
		Flight_Number=in.nextInt();
		System.out.println("Source: ");
		Source=in.next();
		System.out.println("Destination: ");
		Destination=in.next();
	}
	Airlines getInput(){
		return new Airlines(3);
	}
	public String toString(){
		return ("\nPassenger name: "+Passenger_Name+"\nPassenger ID: "+Passenger_ID+"\nFlight number: "+Flight_Number+"\nSource: "+Source+"\nDestination: "+Destination);
	}
}

class AirlinesManagement extends Airlines{
	ArrayList<Airlines> psgList=new ArrayList<Airlines>();
	Scanner in=new Scanner(System.in);
	void insert(){
		insert(1);
	}
	void insert(int n){
		for(int i=0; i<n; i++) psgList.add(getInput());
		System.out.print("Current: ");
		this.display();
	}
	String search(int targetID){
		int check=0;
		for(Airlines i: psgList) if(i.Passenger_ID==targetID){
			String str=i.toString();
			check++;
			return("Passenger found!\n"+str);
		}
		if(check==0) return("Passenger not found!\n");
		return "";
	}
	String display(){
		int a=0;
		String text="";
		psgList.sort((o1, o2)->(o1.Passenger_Name).compareTo(o2.Passenger_Name));
		//for(Airlines i: psgList) System.out.println("Passenger "+(a++)+":-\n"+i);
		for(Airlines i: psgList) text+=i;
		return text;
	}
}

class Jswing{
	public static void main(String a[]){
		AirlinesManagement list=new AirlinesManagement();
		/*int n;
		System.out.print("Number of entries to be recorded: ");
		n=list.in.nextInt();
		list.insert();
		System.out.println("Enter ID to search: ");
		int x=list.in.nextInt();
		list.search(x);
		System.out.println("Final list:-");
		list.display();*/
		System.out.println("Note: only diplay button will be opened in new window after entering details in cmdline");
		list.insert();
		JFrame mainframe=new JFrame("Passenger Portal");
		mainframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		/*JButton ins=new JButton("Insert");
		ins.setBounds(150, 200, 220, 50);
		ins.addActionListener(new ActionListener()){
			public void actionPerformed(ActionEvent e){
				
			}
		}*/
		JButton disp=new JButton("Display");
		disp.setBounds(150, 200, 220, 50);		
		mainframe.add(disp);
		disp.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				JOptionPane.showMessageDialog(mainframe, list.display());
			}
		});
		/*JButton src=new JButton("Display");
		src.setBounds(150, 200, 220, 50);		
		mainframe.add(src);
		mainframe.setSize(500, 600);
		mainframe.setLayout(new FlowLayout());
		mainframe.setVisible(true);
		src.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				JOptionPane.showMessageDialog(mainframe, list.display());
			}
		});*/
	}
}