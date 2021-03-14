import java.lang.*;
import java.util.*;
import java.io.*;

class bank extends Thread{
	int amt=500;
	
	synchronized void withdraw(int amt){
		if(this.amt<amt) {
			System.out.println("Amount insufficient");
			
		}
		try {
			wait();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		this.amt-=amt;
		System.out.println("Amount withdrawn successfully Rs. "+amt);
		System.out.println("Remaining Balance Rs. "+this.amt);
		
	}
	synchronized void deposit(int amt) {
		System.out.println("Going to deposit");
		this.amt+=amt;
		System.out.println("Amount deposited Rs. "+this.amt);
		notify();
	}
	
	
}
class helloworld{
	public static void main(String[] args) {
		final bank obj=new bank();
		Thread t1=new Thread() {
			public void run() {
				obj.withdraw(1000);
			}
		};
		Thread t2=new Thread() {
			public void run() {
				obj.deposit(700);
			}
		};
		t1.start();
		t2.start();
		
	}
}
