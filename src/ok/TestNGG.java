package ok;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class TestNGG {

	@Test
	public void testconfition() {
		int expected = 10;
		int actual = 10;

		assertEquals(expected, actual);

		int expected1 = 10;
		int actual1 = 10;

		assertEquals(expected1, actual1);

	}
	
	//@Test(priority=0)
	@Test(priority = 0, alwaysRun = true)
	public void Check() {
	
		System.out.println("TestNg is Working fine");
	}

	/*
	 * 
	 * Summary of TestNG Annotations
	 * 
	 * @BeforeSuite: The annotated method will be run before all tests in this suite
	 * have run.
	 * 
	 * @AfterSuite: The annotated method will be run after all tests in this suite
	 * have run.
	 * 
	 * @BeforeTest: The annotated method will be run before any test method
	 * belonging to the classes inside the tag is run.
	 * 
	 * @AfterTest: The annotated method will be run after all the test methods
	 * belonging to the classes inside the tag have run.
	 * 
	 * @BeforeGroups: The list of groups that this configuration method will run
	 * before. This method is guaranteed to run shortly before the first test method
	 * that belongs to any of these groups is invoked.
	 * 
	 * @AfterGroups: The list of groups that this configuration method will run
	 * after. This method is guaranteed to run shortly after the last test method
	 * that belongs to any of these groups is invoked.
	 * 
	 * @BeforeClass: The annotated method will be run before the first test method
	 * in the current class is invoked.
	 * 
	 * @AfterClass: The annotated method will be run after all the test methods in
	 * the current class have been run.
	 * 
	 * @BeforeMethod: The annotated method will be run before each test method.
	 * 
	 * @AfterMethod: The annotated method will be run after each test method.
	 * 
	 * @Test: The annotated method is a part of a test case
	 */
	
}
