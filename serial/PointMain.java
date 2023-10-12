import java.lang.Math;
import java.util.*;

class Point{
	double x, y;
	Point(){
		x=0; y=0;
	}
	Point(double a, double b){
		x=a; y=b;
	}
	Point(Point p){
		this(p.x, p.y);
	}
	double find_distance(double a, double b){
		return(Math.sqrt(Math.pow(a-x, 2)+ Math.pow(b-y, 2)));
	}
	double find_distance(Point p){
		return find_distance(p.x, p.y);
	}
	void display(){
		System.out.print("("+x+", "+y+")");
	}
}

class PointMain{
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		ArrayList<Point> parr=new ArrayList<Point>();
		System.out.print("Enter number of points: ");
		int n=in.nextInt();
		for(int i=0; i<n; i++){
			System.out.println("Enter two points: ");
			parr.add(new Point(in.nextInt(), in.nextInt()));
		}
		Iterator<Point> pitr=parr.iterator();
		Point p=pitr.next();
		System.out.println("Note: The distance will automatically be calculated between two consecutive entries.");
		while(pitr.hasNext()){
			Point q=pitr.next();
			System.out.print("The distance between ");
			p.display();
			System.out.print(" and ");
			q.display();
			System.out.print(" is "+p.find_distance(q.x, q.y)+" units.\n");
			p=new Point(q);
		}
	}
}