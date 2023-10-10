package shape2d;

public class Square implements Shape{
	double side;
	public Square(double s){
		side=s;
	}
	public void area(){
		System.out.println("The area is "+(side*side));
	}
	public void perimeter(){
		System.out.println("The perimeter is "+(4*side));
	}
}