import java.util.*;
import java.lang.*;
import java.io.*;

class bye{
	static int mul(int a,int b) {
		return a*b;
	}
	static double mul(double a,double b) {
		return a*b;
	}
	static int mul(int a,int b,int c) {
		return a*b*c;
	}
	void print(){
		System.out.println("this is bye class");
	}
}
class seeyou extends bye{
	void print() {
		System.out.println("This is see you class");
	}
}
class helloworld{
	
	public static void main(String[] args) {
		
//		function overloading illustration
		System.out.println(bye.mul(10.0,5.0));
		System.out.println(bye.mul(10,7));
		System.out.println(bye.mul(10,9,2));
		
//		function overriding illustration
		bye obj=new seeyou();
		obj.print();
	}
}