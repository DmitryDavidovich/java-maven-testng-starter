package com.qualityworkscg.tests;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.qualityworkscg.pages.Page;

public abstract class  AbstractTest {
  
  protected static Page page;

  
  @BeforeTest
  public void setup() {
    page = new Page(new ChromeDriver());
    page.navigate("https://ya.ru");
  }

  @AfterTest
  public void afterTest() {
    page.tearDown();
  }
}
