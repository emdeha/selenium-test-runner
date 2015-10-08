// import java.io.File;
import java.util.regex.Pattern;

import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
// import org.openqa.selenium.phantomjs.PhantomJSDriver;
// import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

public class CredoSearchSpec {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
	/*
	PhantomJSDriverService service = 
	  new PhantomJSDriverService.Builder()
			.usingPhantomJSExecutable(new File("./phantomjs"))
			.build();
    driver = new PhantomJSDriver(service, new DesiredCapabilities());
    */
	driver = new FirefoxDriver();
    baseUrl = "http://www.credoweb.bg/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testCredoSearchSpec() throws Exception {
	    driver.get(baseUrl + "/");
	    driver.findElement(By.cssSelector("div.element-container.green_wrapper")).click();
	    driver.findElement(By.linkText("Форум")).click();
	    driver.findElement(By.name("filterText")).clear();
	    driver.findElement(By.name("filterText")).sendKeys("крак");
	    driver.findElement(By.cssSelector("button[type=\"submit\"]")).click();
	    driver.findElement(By.linkText("Ходенето пеша помага при съдови увреждания в краката")).click();
	    driver.findElement(By.linkText("Харесвам")).click();
	    driver.findElement(By.linkText("Харесвам")).click();
	    driver.findElement(By.name("filterText")).click();
	    driver.findElement(By.name("filterText")).clear();
	    driver.findElement(By.name("filterText")).sendKeys("спорт");
	    driver.findElement(By.cssSelector("button[type=\"submit\"]")).click();
	    driver.findElement(By.name("filterText")).clear();
	    driver.findElement(By.name("filterText")).sendKeys("спорт");
	    driver.findElement(By.cssSelector("button[type=\"submit\"]")).click();
	    driver.findElement(By.linkText("Спортът през зимата повдига настроението")).click();
	    driver.findElement(By.linkText("Харесвам")).click();
	    driver.findElement(By.cssSelector("div.delete.closeModalWindow")).click();
	    driver.findElement(By.linkText("Начало")).click();
	    driver.findElement(By.linkText("Медицински специалисти")).click();
	    driver.findElement(By.name("doctor")).click();
	    driver.findElement(By.cssSelector("div.ExAC-dropdown-result-title")).click();
	    driver.findElement(By.name("city")).click();
	    driver.findElement(By.name("city")).clear();
	    driver.findElement(By.name("city")).sendKeys("софия");
	    driver.findElement(By.xpath("//input[@value='Търси']")).click();
	    driver.findElement(By.name("specialization")).click();
	    driver.findElement(By.name("specialization")).click();
	    driver.findElement(By.name("specialization")).click();
	    driver.findElement(By.name("specialization")).click();
	    driver.findElement(By.name("specialization")).click();
	    driver.findElement(By.name("first_name")).click();
	    driver.findElement(By.name("first_name")).clear();
	    driver.findElement(By.name("first_name")).sendKeys("яначков");
	    driver.findElement(By.xpath("//input[@value='Търси']")).click();
	    driver.findElement(By.cssSelector("img[alt=\"CredoWeb\"]")).click();
	    driver.findElement(By.name("filterText")).click();
	    driver.findElement(By.linkText("Лечебни заведения")).click();
	    driver.findElement(By.name("hospital")).click();
	    driver.findElement(By.xpath("//div[@id='mainContent']/div/div/div/div[2]/div/form/div/div/div/div[2]/div[4]/div")).click();
	    driver.findElement(By.name("city")).click();
	    driver.findElement(By.name("city")).clear();
	    driver.findElement(By.name("city")).sendKeys("софия");
	    driver.findElement(By.name("first_name")).click();
	    driver.findElement(By.name("first_name")).clear();
	    driver.findElement(By.name("first_name")).sendKeys("токуда");
	    driver.findElement(By.xpath("//input[@value='Търси']")).click();
	    driver.findElement(By.linkText("Многопрофилен детски център \"Токуда\"")).click();
	    driver.findElement(By.linkText("Контакти")).click();
	    driver.findElement(By.linkText("Многопрофилен детски център \"Токуда\"")).click();
	    driver.findElement(By.linkText("София")).click();
	    driver.findElement(By.name("specialization")).click();
	    driver.findElement(By.name("specialization")).clear();
	    driver.findElement(By.name("specialization")).sendKeys("педи");
	    driver.findElement(By.xpath("//div[@id='mainContent']/div/div/div/div[2]/div/form/div[3]/div/div/div[2]/div[2]/div[2]/div")).click();
	    driver.findElement(By.name("first_name")).click();
	    driver.findElement(By.name("first_name")).clear();
	    driver.findElement(By.name("first_name")).sendKeys("даскалова");
	    driver.findElement(By.xpath("//input[@value='Търси']")).click();
	    driver.findElement(By.cssSelector("img[alt=\"CredoWeb\"]")).click();
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }

  public static void main(String args[]) {
	CredoSearchSpec css = new CredoSearchSpec();
	  
	try {
      css.setUp();
	  css.testCredoSearchSpec();
	  css.tearDown();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  }
}