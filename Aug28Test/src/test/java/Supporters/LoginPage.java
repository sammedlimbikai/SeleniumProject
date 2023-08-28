package Supporters;

import static DriverInit.DrvrProvider.dr;

import org.openqa.selenium.By;


public class LoginPage {
	
	
	
	By fn = By.xpath("//input[@placeholder='First Name']");
	By ln =By.xpath("//input[@placeholder='Last Name']"); 
	By add = By.xpath("//textarea[@ng-model='Adress']");
	By email = By.xpath("//input[@type='email']");
	By phnno = By.xpath("//input[@type='tel']");
	By genderMale = By.xpath("//input[@value='Male']");
	By cricket = By.xpath("//input[@id='checkbox1']");
	By movies = By.xpath("//input[@id='checkbox2']");
	By hockey = By.xpath("//input[@id='checkbox3']");
	
	By lang = By.id("msdd");
	By eng = By.linkText("English");
	By hindi = By.linkText("Hindi");
	
	By skills = By.id("Skills");
	By java = By.xpath("//option[@value='Java']");
	
	By country= By.id("select2-country-container");
	By indopt = By.xpath("(//ul[@id='select2-country-results']/li)[6]");
	
	
	By year = By.xpath("//select[@placeholder='Year']");
	By myYear = By.xpath("//option[@value='2001']");
	
	
	By  month= By.xpath("//select[@placeholder='Month']");
	By myMonth = By.xpath("//option[@value='January']");
	
	
	By day = By.xpath("//select[@placeholder='Day']");
	By myDay = By.xpath("//option[@value='9']");
	
	By pass1 = By.id("firstpassword");
	By pass2 = By.id("secondpassword");
	
	By submitBtn = By.id("submitbtn");
	
	public LoginPage EnterFirstName(String Fn)
	{
		dr.findElement(fn).sendKeys(Fn);;
		return this;
	}
	public LoginPage EnterLastName(String Ln)
	{
		dr.findElement(ln).sendKeys(Ln);;
		return this;
	}
	public LoginPage EnterAddress(String Add)
	{
		dr.findElement(add).sendKeys(Add);;
		return this;
	}
	public LoginPage EnterEmail(String Email)
	{
		dr.findElement(email).sendKeys(Email);
		return this;
	}
	public LoginPage EnterPhone(String  PhnNo)
	{
		dr.findElement(phnno).sendKeys(PhnNo);
		return this;
	}
	public LoginPage EnterGender()
	{
		dr.findElement(genderMale).click();
		return this;
	}
	public void SelectHobbie()
	{
		dr.findElement(cricket).click();
		dr.findElement(movies).click();
		dr.findElement(hockey).click();
//		return this;
	}
	
	
	public void EnterAllDetails(String Fn,String Ln,String Add,String Email,String PhnNo)
	{
		EnterFirstName(Fn).
		EnterLastName(Ln).
		EnterAddress(Add).
		EnterEmail(Email).
		EnterPhone(PhnNo).
		EnterGender().
		SelectHobbie();
	}
	
	
	
	
	
}
