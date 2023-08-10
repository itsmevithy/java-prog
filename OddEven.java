class OddEven{
	public static void main(String args[]){
		int x=14, a;
		for(a=0; a<2; a++){
			System.out.println("The value of x is "+x);
			System.out.print("And x is ");
			if((x%2)!=0) System.out.print("odd.\n");
			else System.out.print("even.\n");
			x++;
		}
	}
}
