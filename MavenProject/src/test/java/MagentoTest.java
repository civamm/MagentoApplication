import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class MagentoTest {
@Test
private void magento()
  {
   String url="http://www.magento.com";
   WebDriver driver=new FirefoxDriver();
   driver.manage().window().maximize();
   driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
   driver.get(url);
  Home h=new Home(driver);
  h.clickOnMyAcc();
   
  LogIn l1=new LogIn(driver);
  l1.typeEmail("nintinmanjunath1991@gmail.com");
  l1.typePassword("Welcome123");
  l1.clickOnLogIn();
  
  LogOut l2=new LogOut(driver);
  l2.clickOnLogOut();
  
  driver.quit();
  }
}
