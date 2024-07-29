package PomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

		@FindBy(xpath="//a[text()='Register']")
	private WebElement register;
		
		@FindBy(xpath = "//a[text()='Log in']")
	private WebElement logIn;
		
		@FindBy(xpath = "//a[text()='Log out']")
		private WebElement logOut;
		
		@FindBy(xpath  = "//span[text()='Shopping cart']")
	private WebElement shoppingCart;
		
		@FindBy(xpath ="//span[text()='Wishlist']")
	private WebElement wishList;
		
		@FindBy(id="small-searchterms")
	private WebElement searchStoreTF;
		
		@FindBy(className = "button-1 search-box-button")
	private WebElement searchButton;
		
		@FindBy(xpath ="//ul[@class='top-menu']//a[contains(text(),'Books')]")
	private WebElement books;
		
		@FindBy(xpath = "//ul[@class='top-menu']//a[contains(text(),'Computers')]")
	private WebElement computers;
		
		@FindBy(xpath = "//ul[@class='top-menu']//a[contains(text(),'Electronics')]")
	private WebElement electronics;
		
		@FindBy(xpath = "//ul[@class='top-menu']//a[contains(text(),'Apparel & Shoes')]")
	private WebElement apparelShoes;
		
		@FindBy(xpath = "//ul[@class='top-menu']//a[contains(text(),'Digital downloads')]")
	private WebElement digitalDownloads;
		
		@FindBy(xpath = "//ul[@class='top-menu']//a[contains(text(),'Jewelry')]")
	private WebElement jewelry;
		
		@FindBy(xpath = "//ul[@class='top-menu']//a[contains(text(),'Gift Cards')]")
	private WebElement giftCards;
		
		public HomePage(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}

		public WebElement getRegister() {
			return register;
		}

		public WebElement getLogIn() {
			return logIn;
		}
		

		public WebElement getLogout() {
			return logOut;
		}

		public WebElement getShoppingCart() {
			return shoppingCart;
		}

		public WebElement getWishList() {
			return wishList;
		}

		public WebElement getSearchStoreTF() {
			return searchStoreTF;
		}

		public WebElement getSearchButton() {
			return searchButton;
		}

		public WebElement getBooks() {
			return books;
		}

		public WebElement getComputers() {
			return computers;
		}

		public WebElement getElectronics() {
			return electronics;
		}

		public WebElement getApparelShoes() {
			return apparelShoes;
		}

		public WebElement getDigitalDownloads() {
			return digitalDownloads;
		}

		public WebElement getJewelry() {
			return jewelry;
		}

		public WebElement getGiftCards() {
			return giftCards;
		}
	}



