package Practise.AppiumFramework;

import java.io.IOException;

import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import pageObjects.Dependencies;
import pageObjects.Homepage;
import pageObjects.Preferences;
import pageObjects.WiFiPage;

public class ApiDemoTest extends BaseNativeApp{
	
	@Test(dataProvider="InputData",dataProviderClass=TestData.class)
	public void apiDemo(String input) throws IOException {
		
		//service=startServer();
		
		AndroidDriver<AndroidElement> driver =Capabilities("apiDemo");

		//xpath, id ,classname, androiduiatuomator these 4 locators

		/* xpath syntax
		 * //tagname[@attribute='value']
		 * 
		 */
		Homepage h=new Homepage(driver);
		//Constructor of class will be invoked when you create object for the class
		//default constructor will be called
		//constructor cabe be defined with an arguments
		h.Preferences.click();
		//driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
		Preferences p=new Preferences(driver);
		//driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
		p.dependencies.click();
		
		Dependencies dp=new Dependencies(driver);
		
		//driver.findElementById("android:id/checkbox").click();
		
		dp.Page3Dependencies.click();
		
		WiFiPage w=new WiFiPage(driver);
		
		//driver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();
		
		w.Button.click();
		
		//driver.findElementByClassName("android.widget.EditText").sendKeys("Hello");
		
		w.wp.sendKeys(input);
		
		//driver.findElementByXPath("//android.widget.Button[@text='OK']").click();
		w.done.click();
		
		//driver.findElementsByClassName("android.widget.Button").get(1).click();
        //w.finish.get(1).click();
      
        //System.out.println("All Test Cases Passed");
        
   // service.stop();
	}

 /*@BeforeTest
      public void killAllnodes() throws IOException, InterruptedException
     
    {
     	//taskkill /F /IM node.exe
     	Runtime.getRuntime().exec(System.getProperty("user.dir")+ "\\src\\main\\java\\resources\\killServerNodes.bat");
     	Thread.sleep(3000);
     } 
	*/
}

