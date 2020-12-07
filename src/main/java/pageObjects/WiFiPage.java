package pageObjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class WiFiPage {

	public WiFiPage(AndroidDriver<AndroidElement> driver){
		
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	@AndroidFindBy(xpath="(//android.widget.RelativeLayout)[2]")
	public WebElement Button;
	@AndroidFindBy(className="android.widget.EditText")
	public WebElement wp;
	@AndroidFindBy(xpath="//android.widget.Button[@text='OK']")
	public WebElement done;

	@AndroidFindBy(className="android.widget.Button")
	public List<WebElement> finish;
	
}
