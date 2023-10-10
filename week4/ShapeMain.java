import java.util.Scanner;
import java.lang.Math;

class Shape{
	int dim1, dim2, dim3;
	double computeArea(){
		return 0;
	}
	double area;
	int setDim(){
		Scanner in= new Scanner(System.in);
		return in.nextInt(); 
	}
	void display(){
		System.out.println("The area is "+area+" sq.units.");
	}
}
class Circle extends Shape{
	double computeArea(){
		return 3.1415*dim1*dim1;
	}
	int setDim(){
		System.out.print("\nFor Circle,\nEnter dimension 1: ");
		dim1=super.setDim();
		area=computeArea();
		this.display();
		return 0;
	}
}
class Rectangle extends Shape{
	double computeArea(){
		return dim1*dim2;
	}
	int setDim(){
		System.out.print("\nFor Rectangle,\nEnter dimension 1: ");
		dim1=super.setDim();
		System.out.print("Enter dimension 2: ");
		dim2=super.setDim();
		area=computeArea();
		this.display();
		return 0;
	}
}
class Triangle extends Shape{
	double computeArea(){
		double s=(dim1+dim2+dim3)/(2.0);
		return Math.sqrt(s*(s-dim1)*(s-dim2)*(s-dim3));
	}
	int setDim(){
		System.out.print("\nFor Triangle,\nEnter dimension 1: ");
		dim1=super.setDim();
		System.out.print("Enter dimension 2: ");
		dim2=super.setDim();
		System.out.print("Enter dimension 3: ");
		dim3=super.setDim();
		area=computeArea();
		this.display();
		return 0;
	}

}

class ShapeMain{
	public static void main(String args[]){
		Circle c=new Circle();
		Rectangle r=new Rectangle();
		Triangle t=new Triangle();
		c.setDim();
		r.setDim();
		t.setDim();
	}
}
