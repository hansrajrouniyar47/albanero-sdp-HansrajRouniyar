import java.lang.*;
import java.util.*;
import java.io.*;
import java.sql.*;
class A{
	public void showme() {
		System.out.println("Common, show me! THe first class");
	}
}

class B extends A{
	@Override
	public void showme() {
		System.out.println("Common, show me! THe second class");
	}
}


class helloworld{
	public static void main(String[] args) throws Exception{
	
		A obj=new B();
		obj.showme();
}
}