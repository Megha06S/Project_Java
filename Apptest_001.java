package Verfone.UiFramework;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Apptest_001 {
	
	@Test
	void setup()
	{
		System.out.println("I am Ram ");
	}
	
	@BeforeClass
	void Testing()
	{
		System.out.println("Before I am Ram ");
	}	

}
