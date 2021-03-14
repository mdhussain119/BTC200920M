package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import DB.TestSample;
import utility.Helppage;

public class HeaderPage {
	WebDriver dr;
	@FindBy(xpath="//*[@id=\"root\"]/div/div/div/div[2]/nav/ol/li") List<WebElement> headertext;
	
	public HeaderPage(WebDriver dr) {
		this.dr=dr;
		PageFactory.initElements(dr, this);
	}
	
	public void headertext() {
		String [] original= Helppage.text(headertext);
		Helppage.textverify(original, TestSample.expected);
	}

}
