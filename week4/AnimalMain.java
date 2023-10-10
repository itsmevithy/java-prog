import java.util.Scanner;

class Animal{
	String name, family;
	int age;
	void getInput(){
		Scanner in=new Scanner(System.in);
		System.out.print("Enter name:");
		name=in.nextLine();
		System.out.print("Enter age:");
		age=in.nextInt();
		in.skip("[\r\n+]");
		System.out.print("Enter family:");
		family=in.nextLine();
	}
	void makeSound(String sound){
		this.getInput();
		System.out.println("I am "+name+".\nMy age is "+age+".\nI'm a "+family+".\n"+sound);
	}
}

class Dog extends Animal{
	void makeSound(String sound){
		System.out.println("Dog:- ");
		super.makeSound("woof-woof!!!");
	}
}
class Cat extends Animal{
	void makeSound(String sound){
		System.out.println("Cat- ");
		super.makeSound("meowww!");
	}
}
class Cow extends Animal{
	void makeSound(String sound){
		System.out.println("Cow:- ");
		super.makeSound("moooooo!");
	}
}

class AnimalMain{
	public static void main(String args[]){
		Dog d=new Dog();
		d.makeSound("dummy");
		Cat c=new Cat();
		c.makeSound("dummy");
		Cow cw=new Cow();
		cw.makeSound("dummy");
	}
}
