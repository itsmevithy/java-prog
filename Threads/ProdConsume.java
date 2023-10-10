class Queue{
	int[] queue;
	int front, rear;
	boolean full, empty;
	Queue(int size){
		queue=new int[size];
		front=0;
		rear=-1;
		full=false;
		empty=true;
	}
	synchronized void put(int item){
		while(full){
			try{wait();}
			catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		queue[++rear]=item;
		if(rear==queue.length-1){
			full=true;
			empty=false;
			notifyAll();
		}
	}
	synchronized int get(){
		while(empty){
			try{wait();}
			catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		int item=queue[front++];
		if(front==rear+1){
			empty=true;
			full=false;
			notifyAll();
		}
		return item;
	}
}
class Producer implements Runnable{
	Queue queue;
	Producer(Queue q){
		queue=q;
	}
	public void run(){
		for(int i=0; i<10; i++){
			queue.put(i);
			System.out.println("Produced: "+i);
			try{Thread.sleep((int)(Math.random()*100));}
			catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}
class Consumer implements Runnable{
	Queue queue;
	Consumer(Queue q){
		queue=q;
	}
	public void run(){
		for(int i=0; i<10; i++){
			int item=queue.get();
			System.out.println("Consumed: "+item);
			try{Thread.sleep((int)(Math.random()*100));}
			catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}
class ProdConsume{
	public static void main(String a[]) throws InterruptedException{
		Queue q= new Queue(10);
		Producer p=new Producer(q);
		Consumer c=new Consumer(q);	
		Thread t1=new Thread(p);
		Thread t2=new Thread(c);
		t1.start();
		t2.start();
	}
}

