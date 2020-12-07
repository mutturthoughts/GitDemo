package Practise.AppiumFramework;

import org.testng.annotations.DataProvider;

public class TestData {
	
	@DataProvider(name="InputData")
	
	public Object[][] getDataforEditField()
	{
		Object[][] obj= new Object[][]
		// 2 sets of data "hello" "@#$%!"
	{ {"Hello"}, {"!@#$"} };
		
	return obj;
	}
	

}
