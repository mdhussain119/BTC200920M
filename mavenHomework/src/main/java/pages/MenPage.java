package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.Helppage;

public class MenPage {
	WebDriver dr;
	@FindBy(xpath= "//*[@id=\"content\"]/div/div[6]/div/div/div/div/div/div/div/p/span") WebElement menpagetext;
	@FindBy(xpath= "//*[@id=\"content\"]/div/div[2]/div/div/div/div[1]/div/div[1]/div/div/div/div/div/div/div/a") List<WebElement> mansub;
	public MenPage(WebDriver dr) {
		this.dr = dr;
		PageFactory.initElements(dr, this);
	}
	
	public void manpagetextferify() {
		Helppage.textisdisplaid(menpagetext);
	}
	public JeansPage manSubmanuText() {
		Helppage.allsubmanuclickablecheck(dr, mansub);
		return new JeansPage(dr);
	}

}
