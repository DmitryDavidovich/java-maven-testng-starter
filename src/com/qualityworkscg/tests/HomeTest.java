package com.qualityworkscg.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HomeTest extends AbstractTest {

  @Test
  public void verifyTitle () {
    String titleToFind = System.getProperty("title");
    Assert.assertEquals(page.getTitle(), titleToFind, "Testing if the title of url is correct");
  }

}
