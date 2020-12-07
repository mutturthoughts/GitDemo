package Practise.AppiumFramework;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseNativeApp {
//public static AppiumDriverLocalService service;
public  static AndroidDriver<AndroidElement> driver;
	

/*	public AppiumDriverLocalService startServer() throws IOException
	{

		boolean flag=CheckIfServerIsRunning(4723);
		if(!flag)
		{	
			service=AppiumDriverLocalService.buildDefaultService();
			
			service.start();	
		}
		    return service;

	}

	public static boolean CheckIfServerIsRunning(int port) throws IOException
	{

		boolean isServerRunning=false;
		ServerSocket serverSocket;

		try {
			serverSocket=new ServerSocket(port);
			serverSocket.close();
		} catch (IOException e) {
			// If Control comes here,then it means that port in use
			isServerRunning=true;
		} finally{
			serverSocket=null;
		}
		return isServerRunning;

	} 
	*/

	public static void startEmulator() throws IOException 
	{
		//C:\Users\BASAPPA MUTTUR\workspace\AppiumFramework\src\main\java\resources\startEmulator.bat
		Runtime.getRuntime().exec(System.getProperty("user.dir")+ "\\src\\main\\java\\resources\\startEmulator.bat");
	}
   
	public static AndroidDriver<AndroidElement> Capabilities(String AppName) throws IOException
	{
		// TODO Auto-generated method stub

		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+ "\\src\\main\\java\\Practise\\AppiumFramework\\global.properties");	

		Properties prop=new Properties();
		prop.load(fis);
		prop.get(AppName);
		File f= new File("src");
		File fs=new File(f, (String) prop.get(AppName));
		DesiredCapabilities cap =new DesiredCapabilities();

		//cap.setCapability(MobileCapabilityType.DEVICE_NAME, "BasuEmulator");
		//String device= (String) prop.get("device");
		String device=System.getProperty("deviceName");
		  
		if(device.contains("Emulator"))
		{
		 startEmulator();
		 
		}	
		
		// AndroidDriver<AndroidElement> driver;
		 
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, device);
		cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
		
		
		URL url=new URL("http://127.0.0.1:4723/wd/hub");
		
		AndroidDriver <AndroidElement> driver=new AndroidDriver<AndroidElement>(url,cap);

		return driver;
	}
  /*   public static void getscreenshot(String s) throws IOException
      {
    	  System.out.println(" Getting the Screenshot  !! BaseNativeApp Class");
    	  File srcfile1=driver.getScreenshotAs(OutputType.FILE);
    	  //File srcfile1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
          FileUtils.copyFile(srcfile1, new File(System.getProperty("user.dir")+"\\"+s+".png"));
            	 //System.getProperty("user.dir")+ "\\"+s+".png"
    }  */
}
