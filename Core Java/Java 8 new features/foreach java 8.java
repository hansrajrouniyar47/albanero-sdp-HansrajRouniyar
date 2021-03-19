
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
import java.util.*;
import java.lang.*;
import java.io.*;


class helloworld{
	public static void main(String[] args) throws Exception{
	ArrayList<Integer> array=new ArrayList<Integer>();
	array.add(1);
	array.add(2);
	array.add(3);
	array.add(4);
	
	for(int i=0;i<array.size();i++) {
		System.out.print(array.get(i)+" ");
	}
	System.out.println();
	for(int i:array) {
		System.out.print(i+" ");
	}
	
//	for each is new addition to java 8 and because it is internal to collection
//	unlike of enhanced for loop which is external, thus it is faster
	
	System.out.println();
	array.forEach(i->System.out.print(i+" "));
	
}
}