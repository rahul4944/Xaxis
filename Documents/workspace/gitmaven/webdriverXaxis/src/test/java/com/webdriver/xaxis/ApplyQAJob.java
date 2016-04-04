package com.webdriver.xaxis;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ApplyQAJob {
	
	private WebDriver driver;
	  private String baseUrl;
	  private boolean acceptNextAlert = true;
	  private StringBuffer verificationErrors = new StringBuffer();

	  @Before
	  public void setUp() throws Exception {
	    driver = new FirefoxDriver();
	    baseUrl = "https://www.wellsfargo.com/";
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  }

	  @Test
	  public void Homepage() throws Exception {
	    driver.get(baseUrl + "/");
	    driver.findElement(By.id("tabNavCommercial")).click();
	    driver.findElement(By.linkText("Commercial Electronic Office")).click();
	    driver.findElement(By.linkText("frequently asked questions")).click();
	  }

	  @After
	  public void tearDown() throws Exception {
	    driver.quit();
	    
	  }
	}
