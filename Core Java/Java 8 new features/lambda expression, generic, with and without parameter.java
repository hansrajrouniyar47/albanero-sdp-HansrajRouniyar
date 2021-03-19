
import java.util.*;
import java.lang.*;
import java.io.*;

interface Begin{
	void Beginning(int i);
	
}


class helloworld{
	public static void main(String[] args) throws Exception{
		
//	Example of Generic Lambda Expressions
		
//	Begin b=new Begin() {
//		public void Beginning() {
//			System.out.println("Hello world. Let's begin....");
//		}
//	};
//	b.Beginning();
	
		
//		With out parameter and for Reduced form of lambda expression in case
//		you have only one function inside interface
//	Begin b;
//	b=()->System.out.println("Reduced form of lambda expression in case"+""
//			+ " you have only one function inside interface");
//	b.Beginning();
	
		
//		With  parameter and for Reduced form of lambda expression in case
//		you have only one function inside interface
		Begin b;
		b=(int i)->System.out.println("With Parameter "+i);
		b.Beginning(8);
	
	
}
}