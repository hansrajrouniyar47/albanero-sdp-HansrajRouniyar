
import java.util.*;
import java.lang.*;
import java.io.*;

interface Begin{
	void Beginning();
	default void Systemrunningdefault() {
		System.out.println("Default running.....");
	}
}

class Running implements Begin{
	
	public void Beginning() {
		System.out.println("Beginning..........");
	}
}
class helloworld{
	public static void main(String[] args) throws Exception{
	Running obj=new Running();
	obj.Beginning();
	obj.Systemrunningdefault();
}
}