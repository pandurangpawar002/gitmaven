package ok;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.jupiter.api.Test;

public class TestJunit {
	
	@BeforeClass
	public void test1() { System.out.println("method executing is BeforeClasss");}
	
	@Before
	public void test3() { System.out.println("method executing is Before");}
	
	@After
	public void test2() { System.out.println("method executing is BeforeClass");}
	
	@After
	public void test4() { System.out.println("method executing is After");}
	
	@Test
	public void test5() { System.out.println("Method executing test");}
	
	 @Ignore
	public void test6() { System.out.println("Method skipped");}
	
	/*
	 * @Test(timeout=500) public void test7() { System.out.println("Hello Junit");}
	 * 
	 * @Test(expected=IllegalArgumentException.class) public void test8() {
	 * System.out.println("Hello Junit");}
	 */


}
