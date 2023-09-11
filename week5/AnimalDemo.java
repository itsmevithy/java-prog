import java.util.Scanner;

abstract class Animal{
	String name, breed, color;
	int age;
	Scanner in=new Scanner(System.in);
	void getData(){
		System.out.print("Enter name:");
		name=in.nextLine();
		System.out.print("Enter age:");
		age=in.nextInt();
		in.skip("[\r\n+]");
		System.out.print("Enter breed:");
		breed=in.nextLine();
	}
	void printData(){
		System.out.println("I am "+name+".\nMy age is "+age+".\nI'm a "+color+" "+breed);
	}
	void eat(){
		System.out.print(name+" is hungry. Feed some food to "+name+": ");
		String food=in.next();
		System.out.println(name+" eats "+food+" happily!");
	}
	void sleep(){
		System.out.println(name+" is tired, so takes a nap.\nZzzzzz...");
	}
}

class Dog extends Animal{
	void bark(){
		System.out.println("Dog:-\nwoof-woof!!!");
	}
	void getData(){
		System.out.println("Dog:-");
		super.getData();
	}
	void printData(){
		System.out.println("Dog:-");
		super.printData();
	}
	void eat(){
		System.out.print("Dog ");
		super.eat();
	}
	void sleep(){
		System.out.print("Dog ");
	}
}
class Cat extends Animal{
	void meow(){
		System.out.println("Cat-\nmeowww!");
	}
	void getData(){
		System.out.println("Cat:-");
		super.getData();
	}
	void printData(){
		System.out.println("Cat:-");
		super.printData();
	}
	void eat(){
		System.out.print("Cat ");
		super.eat();
	}
	void sleep(){
		System.out.print("Cat ");
	}
}
class Lion extends Animal{
	void roar(){
		System.out.println("Lion:-\nGgrrrrr!!");
	}
	void getData(){
		System.out.println("Lion:-");
		super.getData();
	}
	void printData(){
		System.out.println("Lion:-");
		super.printData();
	}
	void eat(){
		System.out.print("Lion ");
		super.eat();
	}
	void sleep(){
		System.out.print("Lion ");
	}
}

class AnimalMain{
	public static void main(String args[]){
		Animal a[];
		a[0]=new Dog();
		a[1]=new Cat();
		a[2]=new Lion();
//		for(Animal i: a) i.getData();
		a[0].bark();
		a[1].meow();
		a[2].roar();
		for(Animal i:a){
			i.printData();
			i.eat();
			i.sleep();
		}
	}
}
