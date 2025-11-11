package assertStudy;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() {
	  boolean result =true;
	    Assert.assertTrue(result,"TC is failed");
  }
}
