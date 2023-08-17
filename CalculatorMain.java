class Calculator{
    int add(int a, int b){
        return a+b;
    }
    int add(int a, int b, int c){
        return a+b+c;
    }
    int multiply(int a, int b){
        return a*b;
    }
    int multiply(int a, int b, int c){
        return a*b*c;
    }
}

class CalculatorMain{
    public static void main(String arg[]){
        int i, a[]= new int[3];
        Calculator c=new Calculator();
        for(i=0; i<3; i++){
            a[i]=Integer.parseInt(arg[i]);
        }
        System.out.println("Sum2: "+c.add(a[0], a[1])+"\nSum3: "+c.add(a[0], a[1], a[2])+"\nMultiply2: "+c.multiply(a[0], a[1])+"\nMultiply3: "+c.multiply(a[0], a[1], a[2]));
    }
}