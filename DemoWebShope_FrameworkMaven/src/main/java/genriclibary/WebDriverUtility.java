package genriclibary;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtility 
{
	public void captureScreenShot(WebDriver driver,String name)
	{
		String modName=name+" "+JavaUtility.getTimeStamp();
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File trg=new File("./Screenshot/"+modName+".png");
		try {
			FileHandler.copy(src, trg);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void acceptAlert(WebDriver driver) 
	 {
	driver.switchTo().alert().accept();
	 }
	 
	public void dismissAlert(WebDriver driver) 
	{ 
		driver.switchTo().alert().dismiss();
	}

	public void switchToFrame(WebDriver driver, int indexNum) 
 	{
	driver.switchTo().frame(indexNum);
	}

	public void switchToFrame(WebDriver driver, String IdOrName) 
	{
	driver.switchTo().frame(IdOrName);
	}

	public void switchToFrame(WebDriver driver, WebElement frameElement) 
	{
	driver.switchTo().frame(frameElement);
	}

	public void selectOptionByIndex(WebElement dropDown, int indexNum) 
	{
	Select s =new Select (dropDown);
	s.selectByIndex(indexNum);
	}

	public void selectOptionByValue (WebElement dropDown, String value) 
	{ 
	Select s=new Select (dropDown);
	s.selectByValue(value);
	}

	public void selectOptionByVisibleText(WebElement dropDown, String visibleText) 
	{	
	Select s= new Select(dropDown);
	s.selectByVisibleText(visibleText);
	}

	public void mouseOverOnElement(WebDriver driver, WebElement element) 
	{
	Actions act=new Actions(driver);
	act.moveToElement(element).perform();
	}

	public void clickUsingActions(WebDriver driver,WebElement element) 
	{
	Actions act=new Actions(driver);
	act.moveToElement(element).click().perform();
	}

	public void scrollTillElementUsingActions(WebDriver driver, WebElement element) 
	{
	Actions act=new Actions(driver);
	act.scrollToElement(element).perform();
	}
}



