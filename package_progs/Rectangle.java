package shape2d;

public class Rectangle implements Shape{
	double len, bth;
	public Rectangle(double l, double b){
		len=l;
		bth=b;
	}
	public void area(){
		System.out.println("The area is "+(len*bth));
	}
	public void perimeter(){
		System.out.println("The perimeter is "+(2*(len+bth)));
	}
}
