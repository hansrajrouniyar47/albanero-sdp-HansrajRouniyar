import java.util.*;

import pack.testing;

import java.lang.*;
import java.io.*;
import java.lang.*;

class helloworld extends Thread{
	
	public void run() {
		System.out.println("Thread is running which is by run function"
				+ " that gets called once you call start method");
	}
	
	public static void main(String[] args) {
		
		
		helloworld h=new helloworld();
		h.start();
		
	}
}
