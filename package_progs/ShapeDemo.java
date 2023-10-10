import shape2d.*;//Shape;
//import shape2d.Circle;
//import shape2d.Rectangle;
//import shape2d.Square;
import java.util.Scanner;

class ShapeDemo{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter radius of circle: ");
		Shape c=new Circle(sc.nextDouble());
		c.area();
		c.perimeter();
		System.out.print("Enter length and breadth of rectangle: ");
		Shape r=new Rectangle(sc.nextDouble(), sc.nextDouble());
		r.area();
		r.perimeter();
		System.out.print("Enter length of side of square: ");
		Shape s=new Square(sc.nextDouble());
		s.area();
		s.perimeter();
	}
}