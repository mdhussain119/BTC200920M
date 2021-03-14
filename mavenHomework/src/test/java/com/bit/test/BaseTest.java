package com.bit.test;

import java.io.IOException;
import java.util.Properties;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utility.Helppage;

public class BaseTest {
	WebDriver dr;
	Properties pro;
	
//	discribe your pom?  (paage object model)?
//	what is pom? ==== pom is page object model which works page by page
//	means against every page we will create a class and will keep all the object and service in respective page.
	
//	why do u need pom? == as we know now a days developer keep changing UI (user interface) 
//	very frequently so to keep track and more organized pom take place.
	
//	benefit of using pom?==  pom helps to make code more business readable means
//	we follow naming convition and the way design test cases easily understandable flow of test case behavior.
//	it helps to avoid code means eventhough i ma not responsible for all pages but when we design our testing
//	cases i can get any service from any classes because weuse same driver through out the whole project.
//	well maintanable means if some thing goes wrong any where we don't have to look for everywhere just check from 
//	which class is comimg. fix there and it will reflect where ever we used.
	
//	how wit work?== create class against each page and store all elements using findby anotation and use 
//	singletone pattern in project means passing same driver in every class using constructor
	
	@Before
	public void beganing() throws IOException {
		
		pro = Helppage.property();
		String bro = pro.getProperty("browser");
		if (bro.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "/Users/mdhussain/Downloads/chromedriver");
			dr = new ChromeDriver();
		}
		else {
			System.out.println("wrong");
		}
		dr.get(pro.getProperty("url"));
		
	}
	

}
