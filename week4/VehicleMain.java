import java.util.Scanner;

class Vehicle{
	protected String name, brand, vnum, color;
	protected double speed;

 	public void showDetails(){
        	System.out.println("Name: "+name+"\nBrand: "+brand+"\nVehicle Number: "+vnum+"\nColor: "+color+"\nSpeed(max-kmph): "+speed);
	}
}

class Car extends Vehicle{
	int wheels=4;
}

class Bike extends Vehicle{
	int wheels=2;
	int gearRatio=0;
	public void isGeared(){
		System.out.println((gearRatio==0)?"The vehicle is not geared":("The vehicle is geared with "+gearRatio+" gears."));
	}
}

class GearedBike extends Bike{
	public void isGeared(){
		System.out.println((gearRatio==0)?"The bike is not geared":("The bike is geared with "+gearRatio+" gears."));
	}
}
