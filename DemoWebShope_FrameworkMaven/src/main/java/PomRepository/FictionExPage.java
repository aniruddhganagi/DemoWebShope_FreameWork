package PomRepository;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FictionExPage
{
	@FindBy(xpath = "//h1[contains(text(),'Fiction EX')]")
private WebElement fictionEx;
	
	@FindBy(id = "add-to-wishlist-button-78")
private WebElement addToWishList;
	
	public FictionExPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public WebElement getFictionEx() {
		return fictionEx;
	}

	public WebElement getAddToWishList() {
		return addToWishList;
	}
}


