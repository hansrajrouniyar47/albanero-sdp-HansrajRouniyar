import java.util.*;

import pack.testing;

import java.lang.*;
import java.io.*;
import java.lang.*;

class helloworld implements Runnable{
	
	public void run() {
		System.out.println("Thread is running by implements Runnable method");
	}
	
	public static void main(String[] args) {
		
		
		helloworld h=new helloworld();
		Thread t1=new Thread(h);
		t1.start();
		
	}
}
