import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogOut {
	WebDriver driver;
	  By logOut=By.linkText("Log Out");
	  public LogOut(WebDriver driver)
	  {
		  this.driver=driver;
	  }
	  public void clickOnLogOut()
	  {
		  driver.findElement(logOut).click();
	  }
}
