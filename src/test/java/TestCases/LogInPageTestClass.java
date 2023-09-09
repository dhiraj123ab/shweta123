package TestCases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.LogInPage;

public class LogInPageTestClass extends TestBase
{
	String a1 = "(Renewed) Redmi Note 10 Pro Max (Vintage Bronze, 6GB RAM, 128GB Storage) -108MP Quad Camera | 120Hz Super Amoled Display";
	
	LogInPage login;
	@BeforeClass
	public void SetUp() throws InterruptedException
	{
		initialization();
		login=new LogInPage(driver);
	}
	
	@Test
	public void inpintoSerachBoxTest()
	{
		login.inpintoSerachBox("redminote10pro");
		login.Findredminote10pro(a1);
	}

	
	
	@AfterClass
	public void closeBrowser()
	{
		driver.close();
	}
	
	
	
}
