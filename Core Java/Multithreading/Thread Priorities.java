import java.util.*;

import pack.testing;

import java.lang.*;
import java.io.*;
import java.lang.*;

class helloworld extends Thread{
	
	public void run() {
		for(int i=0;i<7;i++) {
			try {
				Thread.sleep(500);
			}
			catch(InterruptedException e) {
				System.out.println(e);
			}
			
			System.out.println(Thread.currentThread().getName()+" :"+Thread.currentThread().getPriority());
		}
		
	}
	
	public static void main(String[] args) {
		
		
		helloworld t1=new helloworld();  
		helloworld t2=new helloworld();  
		t1.setPriority(MAX_PRIORITY);
		t2.setPriority(MIN_PRIORITY);
		t1.start();
		t2.start();
		
		
		
	}
}
