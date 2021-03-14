import java.util.*;
import java.lang.*;
class mul{
	  void print(int n) {
		
//		  an implementation of block method with anonymous class 
		  
		synchronized(this) {
		for(int i=n;i<(n+5);i++) {
			System.out.println(i);
			try {
				Thread.sleep(600);
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
		}
	}
}

class helloworld extends Thread{
	
	public static void main(String[] args) {
		mul obj=new mul();
		Thread t1=new Thread(){
			public void run() {
				obj.print(5);
			}
		};
		Thread t2=new Thread() {
			public void run() {
				obj.print(9);
			}
		};
		t1.start();
		t2.start();
	}
}
