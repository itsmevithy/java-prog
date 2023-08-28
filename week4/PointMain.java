import java.util.Scanner;
import java.lang.Math;

class Point{
	double x, y;
	Point(double a, double b){
		x=a;
		y=b;
	}
	Point(Point p){
		x=p.x;
		y=p.y;
	}
	double findDistance(Point p){
		System.out.print("The distance between ");
		p.display();
		System.out.print(" and ");
		this.display();
		System.out.print(" is ");
		return Math.sqrt(Math.pow((p.x-x), 2)+Math.pow((p.y-y), 2));
	}
	void display(){
		System.out.print("("+x+", "+y+")");
	}
}

class PointMain{
	public static void main(String a[]){
		Point p1, p2, p3;
		p1=new Point(3.25, 7.89);
		p2=new Point(5.37, 18.12);
		System.out.println(p1.findDistance(new Point(7.9, 16.25))+" units.");
		System.out.println(p1.findDistance(p3=new Point(p2))+" units.");
	}
}
