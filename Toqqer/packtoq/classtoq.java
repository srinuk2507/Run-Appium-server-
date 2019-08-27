package packtoq;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
import java org.testng.TestNG testng.xml   

@Before
public class classtoq 
{	
  	private webdriver driver;
  
  public void launchcmd() 
  {
	  Runtime.getRuntime().exec("cmd.exe /c start cmd.exe /k \"appium -a 0.0.0.0 -p 2507\"");
	  URL u=new URL("http://0.0.0.0:2507/wd/hub");
	  
	  DesiredCapabilities dc=new Desiredcapabilites();
	  dc.setCapability(CapabilityType.BROWSER_NAME, "");
	  dc.setCapability("DeviceName", "ZF6223PBR4");
	  dc.setCapability("platformName", "android");
	  dc.setCapability("platformVersion", "8.0.0");
	  dc.setCapability("appPackage", "com.toqqer.app");
	  dc.setCapability("appActivity", "com.toqqer.app.activity.MainActivity");
  
  	while(2>1)
  	{
  		try
  		{
  			driver= new RemoteWebDriver(u,dc);
  			break;
  		}
  		
  		catch(Exception ex)
  		{
  			
  		}
  	}
  }
}
  
