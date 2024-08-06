package pac1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	
	

 WebDriver driver=null;	
String browsername;
	
	 
	
	public void initialization()
	{
		
	if(driver==null)
	{
		if(browsername.equalsIgnoreCase("chrome"))
		{
			 driver=new ChromeDriver();	
		}
		else if(browsername.equalsIgnoreCase("firefox"))
		{
			 driver=new FirefoxDriver();
		}
		else if(browsername.equalsIgnoreCase("edge"))
		{
			driver=new EdgeDriver();
		}
			
	}		
	
	
	    driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://naveenautomationlabs.com/opencart/");

}	
	
	

public void verifyTitle()
{
	String title=driver.getTitle();
	System.out.println(title);
	
}


//*****************
}
