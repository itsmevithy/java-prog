import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.util.*;

class Airlines{
	String Passenger_Name, Source, Destination;
	int Flight_Number, Passenger_ID;
	Scanner in=new Scanner(System.in);
	Airlines(){}
	Airlines(String pname, String src, String dest, int fnum, int pid){
		Passenger_Name=pname;
		Source=src;
		Destination=dest;
		Flight_Number=fnum;
		Passenger_ID=pid;
	}
	public String toString(){
		return ("\nPassenger name: "+Passenger_Name+"\nPassenger ID: "+Passenger_ID+"\nFlight number: "+Flight_Number+"\nSource: "+Source+"\nDestination: "+Destination);
	}
}

class AirlinesManagement extends Airlines{
	private JFrame f;
	ArrayList<Airlines> psgList=new ArrayList<Airlines>();
	Scanner in=new Scanner(System.in);
	AirlinesManagement(JFrame mf){
		this.f=mf;
	}
	void getInput(){
		JFrame inf=new JFrame("Insert entries");
		inf.setSize(300, 240);
		inf.setLayout(new GridLayout(2,1));
		JLabel larr[]=new JLabel[5];
		JTextField tarr[]=new JTextField[5];
		larr[0]=new JLabel("Passenger name: ");
		larr[1]=new JLabel("Passenger ID: ");
		larr[2]=new JLabel("Flight number: ");
		larr[3]=new JLabel("Source: ");
		larr[4]=new JLabel("Destination: ");
		JButton ib=new JButton("Insert");
		for(int i=0; i<5; i++) tarr[i]=new JTextField();
		ib.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
					String pname=tarr[0].getText();
					int pid=Integer.parseInt(tarr[1].getText());
					int fnum=Integer.parseInt(tarr[2].getText());
					String src=tarr[3].getText();
					String dest=tarr[4].getText();
					psgList.add(new Airlines(pname, src, dest, fnum, pid));
					for(int i=0; i<5; i++) tarr[i].setText("");
					JOptionPane.showMessageDialog(ib, ("Done. No of entries: "+psgList.size()));
			}
		});
		JPanel gin=new JPanel();
		gin.setLayout(new GridLayout(5, 2));
		for(int i=0; i<5; i++){
			gin.add(larr[i]);
			gin.add(tarr[i]);
		}
		inf.getContentPane().add(gin);
		inf.add(ib);
		inf.setVisible(true);
	}
	void search(){
		JFrame sf=new JFrame("Search passenger");
		sf.setSize(300, 200);
		JLabel lb=new JLabel("Enter Passenger ID to search");
		JButton sb=new JButton("Search");
		JTextField tb=new JTextField(8);
		sb.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				int targetID=Integer.parseInt(tb.getText());
				for(Airlines i: psgList) if(i.Passenger_ID==targetID){
					JOptionPane.showMessageDialog(sf, ("Passenger found!\n"+(i.toString())));
					return;
				}
				JOptionPane.showMessageDialog(sf, ("Passenger not found!\n"));
				tb.setText("");
			}
		});
		sf.setLayout(new FlowLayout());
		sf.add(lb);
		sf.add(tb);
		sf.add(sb);
		sf.setVisible(true);
	}
	void display(){
		String text="";
		if(psgList.size()>0){
			psgList.sort((o1, o2)->(o1.Passenger_Name).compareTo(o2.Passenger_Name));
			for(Airlines i: psgList) text+=i;
			text+="\n";
		}
		else text="Empty list!!!\nUpload some entries first!";
		JOptionPane.showMessageDialog(f, text);
	}
}

class Jswing{
	public static void main(String a[]){
		JFrame mainframe=new JFrame("Passenger Portal");
		mainframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainframe.setSize(300, 150);
		AirlinesManagement list=new AirlinesManagement(mainframe);
		JButton ins=new JButton("Insert");
		JButton disp=new JButton("Display");
		JButton src=new JButton("Search");
		ins.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				list.getInput();
			}
		});		
		disp.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				list.display();
			}
		});
		src.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				list.search();
			}
		});
		mainframe.setLayout(new GridLayout(3, 1));
		mainframe.add(ins);
		mainframe.add(disp);
		mainframe.add(src);
		mainframe.setVisible(true);
	}
}
