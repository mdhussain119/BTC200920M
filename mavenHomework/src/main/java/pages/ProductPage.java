package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.Helppage;

public class ProductPage {

	WebDriver dr;
	@FindBy(xpath="//*[@id=\"content\"]/div/div/section/section[1]/section/div[6]/div/div/button") List<WebElement> jeanssizelist;
	
	public ProductPage(WebDriver dr) {
		this.dr = dr;
		PageFactory.initElements(dr, this);
	}
	public void clickonjeansSizesection(String attname, String size) {
	
		Helppage.clickonsizemanu(jeanssizelist, attname, size);
		
		
	}
	

}
