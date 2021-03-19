import java.lang.*;
import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.*;
import java.io.*;
import java.sql.*;


@Inherited
@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface PC{
	String os() default "Windows";
	int bit() default 64;
}

@PC(os="Linux",bit=32)
class MyComputer{
	int ram;
	String brand;
	public MyComputer(int ram,String brand) {
		this.ram=ram;
		this.brand=brand;
		
	}
	
}


class helloworld{
	public static void main(String[] args) throws Exception{
	MyComputer obj=new MyComputer(8,"lenovo");
	System.out.println(obj.brand);
	
	Class c=obj.getClass();
	Annotation an=c.getAnnotation(PC.class);
	PC s=(PC)an;
	System.out.println(s.os());
}
}