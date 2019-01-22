import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogIn {
	 WebDriver driver;
By email=By.id("email");
By pass=By.id("pass");
By login=By.id("send2");
 
public LogIn(WebDriver driver)
{
	  this.driver=driver;
}
public void typeEmail(String username)
{
	  driver.findElement(pass).sendKeys(username);
}

public void typePassword(String pwd)
{
	  driver.findElement(pass).sendKeys(pwd);
}
public void clickOnLogIn()
{
	driver.findElement(login).click();
}
}
