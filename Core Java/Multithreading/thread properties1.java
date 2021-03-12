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
		
		
		helloworld h1=new helloworld();
		helloworld h2=new helloworld();
		helloworld h3=new helloworld();
		helloworld h4=new helloworld();
		System.out.println("getting name of h1 "+h1.getName());
		h4.setName("h5");
		System.out.println("getting name of h5 "+h4.getName());
		System.out.println("getting id of h1 "+h3.getId());
		
			  
			 h2.start();  
			 h3.start();
		
		
		
	}
}
