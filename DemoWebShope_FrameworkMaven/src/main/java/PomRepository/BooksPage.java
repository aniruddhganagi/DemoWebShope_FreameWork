package PomRepository;


import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BooksPage
{
	@FindBy(id="products-orderby")
private WebElement sortBy;
	
	@FindBy(id="products-pagesize")
private WebElement display;
	
	@FindBy(id="products-viewmode")
private WebElement grid;
	
	@FindBy(xpath ="//h2[@class='product-title']/a")
private List<WebElement> fictionEX;

public BooksPage(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}

public WebElement getSortBy() {
	return sortBy;
}

public WebElement getDisplay() {
	return display;
}

public WebElement getGrid() {
	return grid;
}

public List<WebElement> getFictionEX() {
	return fictionEX;
}
}

