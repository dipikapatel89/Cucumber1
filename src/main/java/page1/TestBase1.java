package page1;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import cucumber.runtime.Timeout;

public class TestBase1 {

	public static WebDriver driver;
	public static void initDriver()
	{
		System.setProperty("webdriver.chrome.driver","drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);		
	}
	
	public void takescreenshot(WebDriver driver)
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File sourcefile=ts.getScreenshotAs(OutputType.FILE);
		String currentDir=System.getProperty("user.dir");
    	SimpleDateFormat simpledate=new SimpleDateFormat("MMddyy_HHmmss");
		Date date=new Date();
		String label=simpledate.format(date);
		
		
		
		try
		{
			FileUtils.copyFile(sourcefile,new File(currentDir + "/screenshot/" +label + ".png"));
			//FileUtils.copyFile(ts.getScreenshotAs(OutputType.FILE),new File(System.getProperty("user.dir") + "/screenshot/" +System.currentTimeMillis() + ".png"));
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	
	
	
	/*public void takescreenshot(WebDriver driver)
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File sourcefile=ts.getScreenshotAs(OutputType.FILE);
		String currentDir=System.getProperty("user.dir");
		SimpleDateFormat simpledate=new SimpleDateFormat("MMddyy_HHmmss");
		Date date=new Date();
		String label=simpledate.format(date);
		
		
		
		try
		{
			//FileUtils.copyFile(sourcefile,new File(currentDir + "/screenshot/" +label + ".png"));
			FileUtils.copyFile(ts.getScreenshotAs(OutputType.FILE),new File(System.getProperty("user.dir") + "/screenshot/" +System.currentTimeMillis() + ".png"));
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}*/
}
