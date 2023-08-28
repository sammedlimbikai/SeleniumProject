package DriverInit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DrvrProvider {
	public static WebDriver dr;
	public  static WebDriver createDrvr()
	{
		dr = new ChromeDriver();
		dr.get("https://demo.automationtesting.in/Register.html");
		dr.manage().window().maximize();
		
		return dr; 
	}
	public static  void closeDriver()
	{
		dr.quit();
	}
}
