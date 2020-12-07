package resources;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class Listeners implements ITestListener  {

@Test
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("OnTest Start!! Listeners Method");
	}

@Test
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("All Test Cases Passed");
	}
@Test
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		//SCREENsHOT code here
		
/*	 String s= result.getName();
	
	try {
		BaseNativeApp.getscreenshot(s);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	*/					
			 
		}

@Test
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}
@Test
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}
@Test
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}
@Test
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
