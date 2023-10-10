package shape2d;

public class Circle implements Shape{
	double radius;
	public Circle(double r){
		radius=r;
	}
	public void area(){
		System.out.println("The area is "+(pi*radius*radius));
	}
	public void perimeter(){
		System.out.println("The perimeter is "+(2*pi*radius));
	}
}