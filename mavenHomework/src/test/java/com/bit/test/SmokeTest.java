package com.bit.test;

import org.junit.Test;

import DB.TestSample;
import pages.HeaderPage;
import pages.HomePage;
import pages.JeansPage;
import pages.MenPage;
import pages.ProductPage;

public class SmokeTest  {
	@Test
	public void test1() {
		System.out.println("hi");
	}
//	HomePage homepage;
//	MenPage manpage;
//	HeaderPage header;
//	JeansPage jeanspage;
//	ProductPage product;
//	
//	@Test
//	public void test1() throws InterruptedException {
//		System.out.println("hi");
//		homepage = new HomePage(dr);
//		homepage.closepromotion();
//		header = new HeaderPage(dr);
//		header.headertext();
//		homepage.homepagetextdisplay();
//		manpage =homepage.clickonmen();
//		manpage.manpagetextferify();
//		jeanspage= manpage.manSubmanuText();
//		Thread.sleep(5000);
//		product =jeanspage.clickonjeansProduct();
//		Thread.sleep(5000);
//		product.clickonjeansSizesection("value", TestSample.jeanssizechart[0] );
//	}

}
