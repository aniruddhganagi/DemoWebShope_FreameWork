package PomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ragisterpage {



		@FindBy(id="gender-male")
	private WebElement maleRadio;
		
		@FindBy(id="gender-female")
	private WebElement femaleRadio;
		
		@FindBy(id="FirstName")
	private WebElement firstnameTF;
		
		@FindBy(id="LastName")
	private WebElement lastNameTF;
		
		@FindBy(id="Email")
	private WebElement emailTF;
		
		@FindBy(id="Password")
	private WebElement passwordTF;
		
		@FindBy(id="ConfirmPassword")
	private WebElement confirnPasswordTF;
		
		@FindBy(id="register-button")
	private WebElement registrButton;
		
		@FindBy(className = "result")
	private WebElement successfullmessage;

		public Ragisterpage(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}

		public WebElement getMaleRadio() {
			return maleRadio;
		}

		public WebElement getFemaleRadio() {
			return femaleRadio;
		}

		public WebElement getFirstnameTF() {
			return firstnameTF;
		}

		public WebElement getLastNameTF() {
			return lastNameTF;
		}

		public WebElement getEmailTF() {
			return emailTF;
		}

		public WebElement getPasswordTF() {
			return passwordTF;
		}

		public WebElement getConfirnPasswordTF() {
			return confirnPasswordTF;
		}

		public WebElement getRegistrButton() {
			return registrButton;
		}

		public WebElement getYourRegistrationCompleted() {
			return successfullmessage;
		}
		
	}


