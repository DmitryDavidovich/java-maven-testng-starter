package com.qualityworkscg.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HomeTest extends AbstractTest {

  @Test
  public void verifyTitle () {
    Assert.assertEquals(page.getTitle(), "Яндекс", "Testing if the title of url is correct");
  }

}
