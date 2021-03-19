
import java.util.*;
import java.lang.*;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.io.*;



class helloworld{
	public static void main(String[] args) throws Exception{
		
		
		LocalDate d=LocalDate.now();
		System.out.println(d);

		LocalTime t=LocalTime.now();
		System.out.println(t);
		
		Instant it=Instant.now();
		System.out.println(it);
		
		LocalDateTime dt=LocalDateTime.now(ZoneId.of("GMT"));
		System.out.println(dt);
		
		LocalDate dtt=LocalDate.of(1999, 3, 29);
		System.out.println(dtt);
	
}
}