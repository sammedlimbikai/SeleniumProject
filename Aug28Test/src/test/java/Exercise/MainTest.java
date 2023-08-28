package Exercise;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import DriverInit.DrvrProvider;
import Supporters.LoginPage;

public class MainTest {
	
	@BeforeTest
	void starter()
	{
		DrvrProvider.createDrvr();
	}
	@AfterTest
	void finisher()
	{
		
		DrvrProvider.closeDriver();
	}
	
	@Test
	void fun()
	{
		LoginPage lp = new LoginPage();
		lp.EnterAllDetails("Sammed","Limbikai","Pune","sammed@gmail.com","9307861671");
		
		
		
		
	}
}
