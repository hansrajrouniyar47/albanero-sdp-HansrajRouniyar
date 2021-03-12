import java.util.*;

import pack.testing;

import java.lang.*;
import java.io.*;
import java.lang.*;

class helloworld extends Thread{
	
	public void run() {
		for(int i=0;i<15;i++) {
			try {
				Thread.sleep(500);
			}
			catch(InterruptedException e) {
				System.out.println(e);
			}
			
			System.out.println(i);
		}
		
	}
	
	public static void main(String[] args) {
		
		
		helloworld h1=new helloworld();
		helloworld h2=new helloworld();
		h1.start();
		h2.start();
		
		
	}
}
