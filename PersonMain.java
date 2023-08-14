import java.util.Scanner;

class Person{
	String hairColor, eyeColor, skinColor, name;
	int height, weight;
	Scanner in=new Scanner(System.in);

	void setDetails(){
		System.out.print("Enter name: ");
		name=in.nextLine();
		System.out.print("Enter hair, eye and skin colour: ");
		hairColor=in.next();
		eyeColor=in.next();
		skinColor=in.next();
		System.out.print("Enter weight(kgs): ");
		height=in.nextInt();
		System.out.print("Enter height(feet): ");
		weight=in.nextInt();
		System.out.println();
		in.skip("[\r\n+]");
		System.out.println(name+" is a person with "+hairColor+" hair, "+eyeColor+" eyes and "+skinColor+" skin. "+name+" weighs "+weight+" kg and is "+height+" feet tall.");
	}

	void eat(){
		String food;
		System.out.println(name+" is hungry. Please name any food: ");
		food=in.nextLine();
		System.out.println(name+" eats "+food+" happily. "+name+" is not hungry anymore!");
	}
	void sleep(){
		System.out.println(name+" is tired, and goes to sleep.\nZzzzz...");
	}
	void walk(){
		int dist;
		System.out.println("Enter distance in mts: ");
		dist=in.nextInt();
		in.skip("[\r\n+]");
		System.out.println(name+" starts walking around "+dist+" metres.");
	}
	void play(){
		String game;
		System.out.println(name+" is bored. Name a game: ");
		game=in.nextLine();
		System.out.println(name+" plays "+game+" happily. "+name+" is not bored anymore!");
	}
	void study(){
		String book;
		System.out.println("It's study time! Name a book: ");
		book=in.nextLine();
		System.out.println(name+" reads "+book+". It was a good read!");
	}
}

class PersonMain{
	public static void main(String args[]){
		Person guy=new Person();
		guy.setDetails();
		boolean lctrl=true;
		int choice;
		Scanner inp=new Scanner(System.in);
		while(lctrl){
			System.out.println("Enter choice (1-Eat 2-Sleep 3-Walk 4-Play 5-Study 0-End): ");
			choice=inp.nextInt();
			switch(choice){
				case(0):
					lctrl=false;
					break;
				case(1):
					guy.eat();
					break;
				case(2):
					guy.sleep();
					break;
				case(3):
					guy.walk();
					break;
				case(4):
					guy.play();
					break;
				case(5):
					guy.study();
					break; 
			}
		}
		inp.close();
	}
}
