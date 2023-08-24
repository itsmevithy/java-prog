import java.util.Scanner;

class Vehicle{
    protected String name, brand, vnum, color;
    protected double speed;

    public void showDetails(){
        System.out.println("Name: "+name+"\nBrand: "+brand+"\nVehicle Number: "+vnum+"\nColor: "+color+"\nSpeed(max-kmph): "+speed);
    }
}