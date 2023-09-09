package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage 
{
	WebDriver driver;
	
	@FindBy(xpath="//input[@id='twotabsearchtextbox']")private WebElement SearchBox;
	@FindBy(xpath="//input[@id='nav-search-submit-button']")private WebElement SearchButton;
	@FindBy(xpath="//*[@id=\\\"search\\\"]/div[1]/div[1]/div/span[1]/div[1]/div/div/div/div/div/div/div[2]/div/div/div[1]//span")private List<WebElement> allelements;


	public LogInPage(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}

	public void inpintoSerachBox(String searchdata)
	{
		SearchBox.sendKeys(searchdata);
		SearchButton.click();
	}

	public boolean Findredminote10pro(String result)
	{

		for( WebElement s1:allelements)
		{
			String actvalues = s1.getText();
			if(result.equals(actvalues))
			{
				s1.click();
				return true;
			}

		}
		return false;

	}

	



}
