package p1;

public class one{
	int array[], key;
	public one(int x){
		key=x;
	}
	public boolean search(int x[]){
		array=x;
		for(int i : array){
			if(i==key) return true;
		}
		return false;
	}
}
