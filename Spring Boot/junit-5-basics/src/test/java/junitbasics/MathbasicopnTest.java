package junitbasics;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MathbasicopnTest {

	@Test
	void testAdd() {
		Mathbasicopn obj1=new Mathbasicopn();
		int expected=5;
		int actual=obj1.add(2, 3);
		assertEquals(expected,actual);
	}
	@Test
	void testDivide() {
		Mathbasicopn obj2=new Mathbasicopn();
		assertThrows(NullPointerException.class,()->
		obj2.divide(1,0),"Should throw exception");
	}

}
