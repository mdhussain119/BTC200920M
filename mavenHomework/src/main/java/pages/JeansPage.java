package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.Helppage;

public class JeansPage {
	WebDriver dr;
	@FindBy(xpath="//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div/div[2]/div[1]/a/img") WebElement jeansproduct;
	
	public JeansPage(WebDriver dr) {
		this.dr = dr;
		PageFactory.initElements(dr, this);
	}
	public ProductPage clickonjeansProduct() {
		
		Helppage.clickonelement(jeansproduct);
		return new ProductPage(dr); 
	}
	

}
