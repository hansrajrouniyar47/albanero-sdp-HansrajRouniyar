

//with two packages, all the access modifiers have been explained in the below portions,

package pack;

public class testing {

	
		// TODO Auto-generated method stub
		public void printpack() {
			System.out.println("This is print package");
		}
		public int z=7;
		protected int y=8;

	

}



import java.util.*;

import pack.testing;

import java.lang.*;
import java.io.*;


class helloworld extends testing{
	
	public static void main(String[] args) {
		
		
//		same when called without protected and public
//		i.e default gave error
		
		testing newobj=new testing();
		newobj.printpack();
		System.out.println(newobj.z);
		
//		for protected you need to inherit and then only it will work 
//		but if simply by importing object and instantiating class you 
//		call, that won't work and as well you need to instantiate class by latest class name 
//		where you have inherited
		
		
		helloworld newwobj=new helloworld();
		System.out.println(newwobj.y);
		
//		with public in class and methods and objects,
//		you can work anywhere
		
	}
}