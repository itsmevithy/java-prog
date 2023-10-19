import java.util.ArrayList;

class point 
{
	double x,y;
	point()
	{
		x=y=0;
	}
	point(double x,double y)
	{
		this.x=x;
		this.y=y;
	}
	point(point p)
	{
	 x=p.x;
	 y=p.y;
	}
	double find_distance(point p)
	{
		double d=Math.sqrt((Math.pow(p.y,2)-Math.pow(y,2))+(Math.pow(p.x,2)-Math.pow(x,2)));
	     return d;  
	}
	double find_distance(double x,double y)
	{
		double d=Math.sqrt((Math.pow(this.y,2)-Math.pow(y,2))+(Math.pow(this.x,2)-Math.pow(x,2)));
	    return d;
	}
	void display()
	{
		System.out.print(x);
		System.out.print(y);
	}
	
}
public class DemoArraylist {
	public static void main(String args[])
	{ 
		point p1= new point(35,59.5);
		ArrayList<point> people=new ArrayList<point>();
		people.add(p1);
		point p2= new point(35,59.5);
		people.add(p2);
		
	}

}
