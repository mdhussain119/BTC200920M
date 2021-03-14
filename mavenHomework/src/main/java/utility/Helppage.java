package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Helppage {
	
	public static Properties property() throws IOException {
		FileInputStream file = new FileInputStream(new File("/Users/mdhussain/eclipse-workspace/mavenHomework/src/main/resources/conflit.property"));
		Properties p = new Properties();
		p.load(file);
		return p;
		
	}
	
	public static  void clickonelement(WebElement element) {
		waitforelement(element).click();
		
	}
	
	 public static String[] text(List<WebElement> element) {
		 String [] list = new String [element.size()];
		 
		 for (int i = 0; i < list.length; i++) {
			String a = element.get(i).getText();
			list[i] = a;
	
		}
		 return list;
	 
	 }
	 public static void textverify(String [] actual, String []expected) {
		 for (int i = 0; i < expected.length; i++) {
			 if (actual[i].equals(expected[i])) {
				 System.out.println("text match");
				
			}
			 else {
				 System.out.println("text didnt match");
			 }
			
		}
		 
	 }
	 
	 public static void textisdisplaid(WebElement element) {
			if (element.isDisplayed()) {
				System.out.println("text is displaid");	
			}
			else {
				System.out.println("text is not displaid");
			}
		}
	 
	 public static WebElement waitforelement(WebElement element) {
		 ExpectedConditions.visibilityOf(element);
		 return element;
	 }
	 
	 public static void allsubmanuclickablecheck(WebDriver dr, List<WebElement>element) {
		 String [] manusub = new String[element.size()];
		 
			for (int i = 0; i < manusub.length; i++) {
				element.get(i).click();
				System.out.println("good");
				dr.navigate().back();
				
				
			}
			element.get(0).click();
				
				
		}
	 
	 public static void clickonsizemanu(List<WebElement> elements, String attname, String size) {
		 
		 for (WebElement webElement : elements) {
			 if (webElement.getAttribute(attname).equals(size)) {
				 webElement.click();
				 System.out.println(size);
				 
				 
				
			}else {
				System.out.println("dont match");
			}
			
			 
			
		}
			
		}
	 
		
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 

}
