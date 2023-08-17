class RectangleArea{
    double length, width;
    RectangleArea(){
        length=0;
        breadth=0;
    }
    RectangleArea(int a){
        length=a;
        breadth=1;
    }
    RectangleArea(int a, int b){
        length=a; breadth=b;
    }
    void setDim(){
        Scanner in= new Scanner(System.in);
        System.out.print("Enter length: ");
        length=in.nextDouble;
        System.out.print("Enter width: ");
        width=in.nextDouble;
    }
    double computeArea(){
        return length*breadth;
    }
    void print(){
        System.out.print("Length: ");
        System.out.print("Width: ");
        System.out.print("Area: "+ this.computeArea());
    }
}

class Rectangle{
    public static void main(String args[]){
        Scanner in= new Scanner(System.in);
        System.out.print("Enter length: ");
        double len=in.nextDouble;
        System.out.print("Enter width: ");
        double wid=in.nextDouble;
        RectangleArea a, b, c;
        a=new RectangleArea();
        b=new RectangleArea(length);
        c=new RectangleArea(length, breadth);
        a.setDim();
        a.print();
        b.print();
        c.print();
    }
}