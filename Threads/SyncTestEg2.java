class Callme{
	void call(String msg){
		System.out.print("["+msg);
		try{
			Thread.sleep(1000);
		}
		catch(Exception e){
			System.out.println(e);
		}
		System.out.println("]");
	}
}
class Caller extends Thread{
	Callme target;
	String message;
	Caller(Callme c, String s){
		target=c;
		message=s;
	}
	public void run(){
		target.call(message);
	}
}
class SyncTestEg2{
	public static void main(String args[]){
		Callme obj=new Callme();
		Caller one=new Caller(obj, "Hello");
		Caller two= new Caller(obj, "Synchronized");
		Caller three= new Caller(obj, "Example");
		one.start();
		try{one.join();}
		catch(InterruptedException e){ e.printStackTrace();}
		two.start();
		try{two.join();}
		catch(InterruptedException e){ e.printStackTrace();}
		three.start();
	}
}
