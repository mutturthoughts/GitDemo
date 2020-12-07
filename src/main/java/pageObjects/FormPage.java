package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class FormPage {
	
	public FormPage(AndroidDriver<AndroidElement> driver) 
		// TODO Auto-generated constructor stub
	
	{
		
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		
	}

	@AndroidFindBy(id="com.androidsample.generalstore:id/nameField")
	
	public WebElement nameField;
	
	
	@AndroidFindBy(xpath="//android.widget.RadioButton[@text='Male']")
	
	public WebElement RadioButton;
	
	@AndroidFindBy(id="com.androidsample.generalstore:id/spinnerCountry")
	public WebElement CountrySelection;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Australia']")
	public WebElement DropDown;
	
	@AndroidFindBy(id="com.androidsample.generalstore:id/btnLetsShop")
	
	public WebElement ShopEnter;
	
	
	
	
}
