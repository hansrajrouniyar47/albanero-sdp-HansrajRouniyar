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
			
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
		
	}
	
	public static void main(String[] args) {
		
		
		helloworld t1=new helloworld();  
		helloworld t2=new helloworld();  
		helloworld t3=new helloworld();  
		helloworld t4=new helloworld(); 
		 t1.start();  
		 
		 //with .join the thread executes first and other threads hold till then 
		 // and if want to execute in straight fashion for some time
		 // and then only move in other fashion
		 //can give time in ms after.join as .join(ms)
		 // and it will execute in straight fashion only upto this time
		 try{  
		  t1.join(1500);  
		 }catch(Exception e){System.out.println(e);}  
		 t4.start();
		 try {
			 t4.join();
		 }
		 catch(Exception e) {
			 System.out.println(e);
		 }
		 t2.start();  
		 t3.start();  
		
		
		
	}
}
