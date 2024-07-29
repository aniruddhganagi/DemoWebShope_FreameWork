package genriclibary;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import PomRepository.HomePage;
import PomRepository.LoginPage;

public class BaseTest 
	{
		public DataUtility data_utility=new DataUtility();
		public WebDriver driver;
		public static WebDriver listeDriver;
		public HomePage home_Page;


		@BeforeClass(alwaysRun = true)
		public void launchTheBrowser() throws IOException
		{
			driver=new ChromeDriver();
			listeDriver=driver;
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get(data_utility.getDataFromProperties("url"));
		}

		@BeforeMethod(alwaysRun = true)
		public void perfornLogin() throws IOException
		{
			home_Page=new HomePage(driver);
			home_Page.getLogIn().click();
			
			LoginPage login_Page=new LoginPage(driver);
			login_Page.getEnmailTF().sendKeys(data_utility.getDataFromProperties("email"));
			login_Page.getPasswordTF().sendKeys(data_utility.getDataFromProperties("pwd"));
			login_Page.getLoginButton().click();
		}

		@AfterMethod(alwaysRun = true)
		public void performLogout()
		{
			home_Page.getLogout().click();
		}

		@AfterClass
		public void closeTheBrowser()
		{
			driver.quit();
		}
	}



