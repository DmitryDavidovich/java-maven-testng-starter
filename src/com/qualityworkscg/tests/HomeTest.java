package com.qualityworkscg.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HomeTest extends AbstractTest {

  @Test
  public void verifyTitle () {
    String title = System.getProperty("title");
    Assert.assertEquals(page.getTitle(), title, "Testing if the title of url is correct");
  }

}
