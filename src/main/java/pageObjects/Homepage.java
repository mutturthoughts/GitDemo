package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

//All the objects belonging to on page will be defined in java class
public class Homepage {
	
	//1. Is to call the driver object from test case to page object file
	//Concatenate driver
	public Homepage(AndroidDriver<AndroidElement> driver)
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
@AndroidFindBy(xpath="//android.widget.TextView[@text='Preference']")
public WebElement Preferences;
//driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
}
