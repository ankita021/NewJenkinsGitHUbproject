package ankita_hrm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstMavenScript {
	public static WebDriver driver;
	@Test
	public void setUP(){
		String driverPath=System.getProperty("user.dir")+"\\chromedriver.exe";
		System.out.println(driverPath);
		System.setProperty("webdriver.chrome.driver",driverPath);  //chrome
		 driver= new ChromeDriver(); //chrome
		 driver.get("https://opensource-demo.orangehrmlive.com");
	}
}
