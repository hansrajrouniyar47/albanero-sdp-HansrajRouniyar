import java.util.*;
import java.lang.*;
import java.io.*;

class bye{
	private int x=5;
	private void print() {
		System.out.println("Hey I am private method so you can't print me");
	}
		
}

class helloworld{
	
	public static void main(String[] args) {
		
		bye obj=new bye();
		System.out.println(obj.x);
		obj.print();
	}
}