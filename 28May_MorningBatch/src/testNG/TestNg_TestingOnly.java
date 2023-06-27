package testNG;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNg_TestingOnly {
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Before Class");
	}
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Before Method");
	}
	@Test
	public void test()
	{
		System.out.println("Test");
	}
}
