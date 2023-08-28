import java.util.Scanner;

class Vehicle{
	protected String name, brand, vnum, color;
	protected double speed;
	Scanner in=new Scanner(System.in);
	void initData(){
		System.out.print("Enter name: ");
		name=in.nextLine();
		System.out.print("Enter brand name: ");
		brand=in.nextLine();
		System.out.print("Enter color: ");
		color=in.nextLine();
		System.out.print("Enter plate number: ");
		vnum=in.nextLine();
		System.out.print("Enter max speed: ");
		speed=in.nextDouble();
		in.skip("[\r\n+]");
	}
 	void showDetails(){
        	System.out.println("Name: "+name+"\nBrand: "+brand+"\nVehicle Number: "+vnum+"\nColor: "+color+"\nSpeed(max-kmph): "+speed);
	}
}

class Car extends Vehicle{
	int wheels=4;
	void showDetails(){
		super.showDetails();
		System.out.println("Number of wheels: "+wheels);

	}
}

class Bike extends Vehicle{
	int wheels=2;
	int gearRatio=0;
	public void isGeared(){
		System.out.println((gearRatio==0)?"The vehicle is not geared":("The vehicle is geared with "+gearRatio+" gears."));
	}
	void showDetails(){
		super.showDetails();
		System.out.println("Number of wheels: "+wheels);

	}
}

class GearedBike extends Bike{
	public void isGeared(){
		System.out.print("Enter number of gears: ");
		gearRatio=in.nextInt();
		in.skip("[\r\n+]");
		super.isGeared();
	}
	void showDetails(){
		super.showDetails();
		System.out.println("Number of wheels: "+wheels);
		this.isGeared();
	}
}

class VehicleMain{
	public static void main(String a[]){
		Car c=new Car();
		Bike b=new Bike();
		GearedBike g=new GearedBike();
		System.out.println("Car:-");
		c.initData();
		c.showDetails();
		System.out.println("Bike:-");
		b.initData();
		b.showDetails();
		System.out.println("GearedBike:-");
		g.initData();
		g.showDetails();
	}
}
