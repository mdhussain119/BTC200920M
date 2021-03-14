package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.Helppage;

public class HomePage {
	
	 WebDriver dr;
	 @FindBy(xpath="//*[@id=\"closeModal\"]") WebElement promotion;
	 @FindBy(xpath="//*[@id=\"root\"]/div/div/div/div[2]/nav/ol/li") List<WebElement> headertext;
	 @FindBy(xpath="//*[@id=\"root\"]/div/div/div/div[2]/div/div[2]/a/img") WebElement htextdisplay;
	 @FindBy(xpath="//*[@id=\"root\"]/div/div/div/div[2]/nav/ol/li[2]/a") WebElement menpage;
	 
	 public HomePage(WebDriver dr) {
		this.dr = dr;
		PageFactory.initElements(dr, this);
	}
	 
	 public void closepromotion() {
		 Helppage.clickonelement(promotion);
		 System.out.println("git");
	 }
	 
	public void homepagetextdisplay() {
		Helppage.textisdisplaid(htextdisplay);
	}
	public MenPage clickonmen() {
		Helppage.clickonelement(menpage);
		return new MenPage(dr);
		
		
	}
	 
	
	 

}
