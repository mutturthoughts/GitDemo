package Practise.AppiumFramework;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Practise.AppiumFramework.BaseNativeApp;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import pageObjects.CheckoutPage;
import pageObjects.FormPage;
import pageObjects.ShopingPage;

import java.io.IOException;

public class Ecommerce_tc_5 extends BaseNativeApp {
	
	@Test
	public void NativeAppValidation() throws IOException, InterruptedException  {
	
		// TODO Auto-generated method stub
//GeneralStoreApk VersistartService()on configure in the POM XML file
	
	//	service=startServer();
		
		AndroidDriver<AndroidElement> driver=Capabilities("GeneralStoreApp");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		FormPage fp=new FormPage(driver);
		
		fp.nameField.sendKeys("Basu");
		//driver.findElementById("com.androidsample.generalstore:id/nameField").sendKeys("Basu");
		driver.hideKeyboard();
		
		//driver.findElementByXPath("//android.widget.RadioButton[@text='Male']").click();
		fp.RadioButton.click();
		
		//driver.findElementById("android:id/text1").click();
		fp.CountrySelection.click();
		
		
		Utilities ut =new Utilities(driver);
		
		//driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Australia\"));");
		ut.ScrollTotex("Australia");
		//driver.findElementByXPath("//android.widget.TextView[@text='Australia']").click();
		fp.DropDown.click();
		
		//driver.findElementById("com.androidsample.generalstore:id/btnLetsShop").click();
		
		fp.ShopEnter.click();
		
		ShopingPage sp=new ShopingPage(driver);
		
		//driver.findElements(By.xpath("//*[@text='ADD TO CART']")).get(0).click();
		sp.Addcart1.click();

	   //  driver.findElements(By.xpath("//*[@text='ADD TO CART']")).get(0).click();
        sp.Addcart2.click();
        
	    //driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
        sp.ButtonCart.click();
        
	Thread.sleep(3000);

	CheckoutPage cp=new CheckoutPage(driver);
	
	int count=cp.Size.size();
			//driver.findElements(By.id("com.androidsample.generalstore:id/productPrice")).size();

	double sum=0;

	for(int i=0;i<count;i++)

	{

	String amount1= cp.Getprice.get(i).getText();
			//driver.findElements(By.id("com.androidsample.generalstore:id/productPrice")).get(i).getText();

	double amount=getAmount(amount1);

	sum=sum+amount;//280.97+116.97

	}

	System.out.println(sum+"sum of products");



	String total=cp.AddedAmount.getText();
			//driver.findElement(By.id("com.androidsample.generalstore:id/totalAmountLbl")).getText();
	 


	total= total.substring(1);

	double totalValue=Double.parseDouble(total);

	System.out.println(totalValue+"Total value of products");
 
	Assert.assertEquals(sum, totalValue); 
	
//	service.stop();
	
		
		}
	

	/* @BeforeTest
	      public void killAllnodes() throws IOException, InterruptedException
	     
	    {
	     	//taskkill /F /IM node.exe
	     	Runtime.getRuntime().exec(System.getProperty("user.dir")+ "\\src\\main\\java\\resources\\killServerNodes.bat");
	     	Thread.sleep(3000);
	     } 
	     */

	public static double getAmount(String value)

	{

	value= value.substring(1);

	double amount2value=Double.parseDouble(value);

	return amount2value;

  
	}

}
