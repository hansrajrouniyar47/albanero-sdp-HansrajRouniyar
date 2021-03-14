import java.util.*;
import java.lang.*;
class mul{
	synchronized void print(int n) {
		
//		and if you want to add synchronize with block method
//		you can simply use synchronized(this) between any blocks of codes
//		and synchronized method will run the same way
		
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
class Test1 extends Thread{
	mul m1;
	Test1(mul m1){
		this.m1=m1;
	}
	public void run() {
		m1.print(1);
	}
}
class Test2 extends Thread{
	mul m1;
	Test2(mul m1){
		this.m1=m1;
	}
	public void run() {
		m1.print(9);
	}
}
class Test3 extends Thread{
	mul m1;
	Test3(mul m1){
		this.m1=m1;
	}
	public void run() {
		m1.print(199);
	}
}
class helloworld{
	
	public static void main(String[] args) {
		final mul obj=new mul();
		Test1 t1=new Test1(obj);
		Test2 t2=new Test2(obj);
		Test3 t3=new Test3(obj);
		t1.start();
		t2.start();
		t3.start();
	
	}
}
