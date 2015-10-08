import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class CredoGenearlSearch {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  public static void main(String args[]) {
    CredoGenearlSearch css = new CredoGenearlSearch();
  
    try {
      css.setUp();
      css.testCredoGenearlSearch();
      css.tearDown();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "http://www.credoweb.bg/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testCredoGenearlSearch() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.cssSelector("div.element-container.green_wrapper")).click();
    {
      WebElement link;
      try {
        link = driver.findElement(By.xpath("//a[text()='Форум']"));
        try {
          link.click();
        } catch(ElementNotVisibleException ex) {
          try {
            link = driver.findElement(By.linkText("Форум"));
          } catch(NoSuchElementException ex2) {
            link = driver.findElement(By.linkText("ФОРУМ"));
          }
          link.click();
        }
      } catch(NoSuchElementException ex) {
        try {
          link = driver.findElement(By.linkText("Форум"));
        } catch(NoSuchElementException ex2) {
          link = driver.findElement(By.linkText("ФОРУМ"));
        }
        link.click();
      }
    }
    driver.findElement(By.name("filterText")).clear();
    driver.findElement(By.name("filterText")).sendKeys("крак");
    driver.findElement(By.cssSelector("button[type=\"submit\"]")).click();
    {
      WebElement link;
      try {
        link = driver.findElement(By.xpath("//a[text()='Ходенето пеша помага при съдови увреждания в краката']"));
        try {
          link.click();
        } catch(ElementNotVisibleException ex) {
          try {
            link = driver.findElement(By.linkText("Ходенето пеша помага при съдови увреждания в краката"));
          } catch(NoSuchElementException ex2) {
            link = driver.findElement(By.linkText("ХОДЕНЕТО ПЕША ПОМАГА ПРИ СЪДОВИ УВРЕЖДАНИЯ В КРАКАТА"));
          }
          link.click();
        }
      } catch(NoSuchElementException ex) {
        try {
          link = driver.findElement(By.linkText("Ходенето пеша помага при съдови увреждания в краката"));
        } catch(NoSuchElementException ex2) {
          link = driver.findElement(By.linkText("ХОДЕНЕТО ПЕША ПОМАГА ПРИ СЪДОВИ УВРЕЖДАНИЯ В КРАКАТА"));
        }
        link.click();
      }
    }
    {
      WebElement link;
      try {
        link = driver.findElement(By.xpath("//a[text()='Харесвам']"));
        try {
          link.click();
        } catch(ElementNotVisibleException ex) {
          try {
            link = driver.findElement(By.linkText("Харесвам"));
          } catch(NoSuchElementException ex2) {
            link = driver.findElement(By.linkText("ХАРЕСВАМ"));
          }
          link.click();
        }
      } catch(NoSuchElementException ex) {
        try {
          link = driver.findElement(By.linkText("Харесвам"));
        } catch(NoSuchElementException ex2) {
          link = driver.findElement(By.linkText("ХАРЕСВАМ"));
        }
        link.click();
      }
    }
    {
      WebElement link;
      try {
        link = driver.findElement(By.xpath("//a[text()='Харесвам']"));
        try {
          link.click();
        } catch(ElementNotVisibleException ex) {
          try {
            link = driver.findElement(By.linkText("Харесвам"));
          } catch(NoSuchElementException ex2) {
            link = driver.findElement(By.linkText("ХАРЕСВАМ"));
          }
          link.click();
        }
      } catch(NoSuchElementException ex) {
        try {
          link = driver.findElement(By.linkText("Харесвам"));
        } catch(NoSuchElementException ex2) {
          link = driver.findElement(By.linkText("ХАРЕСВАМ"));
        }
        link.click();
      }
    }
    driver.findElement(By.name("filterText")).click();
    driver.findElement(By.name("filterText")).clear();
    driver.findElement(By.name("filterText")).sendKeys("спорт");
    driver.findElement(By.cssSelector("button[type=\"submit\"]")).click();
    driver.findElement(By.name("filterText")).clear();
    driver.findElement(By.name("filterText")).sendKeys("спорт");
    driver.findElement(By.cssSelector("button[type=\"submit\"]")).click();
    {
      WebElement link;
      try {
        link = driver.findElement(By.xpath("//a[text()='Спортът през зимата повдига настроението']"));
        try {
          link.click();
        } catch(ElementNotVisibleException ex) {
          try {
            link = driver.findElement(By.linkText("Спортът през зимата повдига настроението"));
          } catch(NoSuchElementException ex2) {
            link = driver.findElement(By.linkText("СПОРТЪТ ПРЕЗ ЗИМАТА ПОВДИГА НАСТРОЕНИЕТО"));
          }
          link.click();
        }
      } catch(NoSuchElementException ex) {
        try {
          link = driver.findElement(By.linkText("Спортът през зимата повдига настроението"));
        } catch(NoSuchElementException ex2) {
          link = driver.findElement(By.linkText("СПОРТЪТ ПРЕЗ ЗИМАТА ПОВДИГА НАСТРОЕНИЕТО"));
        }
        link.click();
      }
    }
    {
      WebElement link;
      try {
        link = driver.findElement(By.xpath("//a[text()='Харесвам']"));
        try {
          link.click();
        } catch(ElementNotVisibleException ex) {
          try {
            link = driver.findElement(By.linkText("Харесвам"));
          } catch(NoSuchElementException ex2) {
            link = driver.findElement(By.linkText("ХАРЕСВАМ"));
          }
          link.click();
        }
      } catch(NoSuchElementException ex) {
        try {
          link = driver.findElement(By.linkText("Харесвам"));
        } catch(NoSuchElementException ex2) {
          link = driver.findElement(By.linkText("ХАРЕСВАМ"));
        }
        link.click();
      }
    }
    driver.findElement(By.cssSelector("div.delete.closeModalWindow")).click();
    {
      WebElement link;
      try {
        link = driver.findElement(By.xpath("//a[text()='Начало']"));
        try {
          link.click();
        } catch(ElementNotVisibleException ex) {
          try {
            link = driver.findElement(By.linkText("Начало"));
          } catch(NoSuchElementException ex2) {
            link = driver.findElement(By.linkText("НАЧАЛО"));
          }
          link.click();
        }
      } catch(NoSuchElementException ex) {
        try {
          link = driver.findElement(By.linkText("Начало"));
        } catch(NoSuchElementException ex2) {
          link = driver.findElement(By.linkText("НАЧАЛО"));
        }
        link.click();
      }
    }
    {
      WebElement link;
      try {
        link = driver.findElement(By.xpath("//a[text()='Медицински специалисти']"));
        try {
          link.click();
        } catch(ElementNotVisibleException ex) {
          try {
            link = driver.findElement(By.linkText("Медицински специалисти"));
          } catch(NoSuchElementException ex2) {
            link = driver.findElement(By.linkText("МЕДИЦИНСКИ СПЕЦИАЛИСТИ"));
          }
          link.click();
        }
      } catch(NoSuchElementException ex) {
        try {
          link = driver.findElement(By.linkText("Медицински специалисти"));
        } catch(NoSuchElementException ex2) {
          link = driver.findElement(By.linkText("МЕДИЦИНСКИ СПЕЦИАЛИСТИ"));
        }
        link.click();
      }
    }
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
    {
      WebElement link;
      try {
        link = driver.findElement(By.xpath("//a[text()='Лечебни заведения']"));
        try {
          link.click();
        } catch(ElementNotVisibleException ex) {
          try {
            link = driver.findElement(By.linkText("Лечебни заведения"));
          } catch(NoSuchElementException ex2) {
            link = driver.findElement(By.linkText("ЛЕЧЕБНИ ЗАВЕДЕНИЯ"));
          }
          link.click();
        }
      } catch(NoSuchElementException ex) {
        try {
          link = driver.findElement(By.linkText("Лечебни заведения"));
        } catch(NoSuchElementException ex2) {
          link = driver.findElement(By.linkText("ЛЕЧЕБНИ ЗАВЕДЕНИЯ"));
        }
        link.click();
      }
    }
    driver.findElement(By.name("hospital")).click();
    driver.findElement(By.xpath("//div[@id='mainContent']/div/div/div/div[2]/div/form/div/div/div/div[2]/div[4]/div")).click();
    driver.findElement(By.name("city")).click();
    driver.findElement(By.name("city")).clear();
    driver.findElement(By.name("city")).sendKeys("софия");
    driver.findElement(By.name("first_name")).click();
    driver.findElement(By.name("first_name")).clear();
    driver.findElement(By.name("first_name")).sendKeys("токуда");
    driver.findElement(By.xpath("//input[@value='Търси']")).click();
    {
      WebElement link;
      try {
        link = driver.findElement(By.xpath("//a[text()='Многопрофилен детски център \"Токуда\"']"));
        try {
          link.click();
        } catch(ElementNotVisibleException ex) {
          try {
            link = driver.findElement(By.linkText("Многопрофилен детски център \"Токуда\""));
          } catch(NoSuchElementException ex2) {
            link = driver.findElement(By.linkText("МНОГОПРОФИЛЕН ДЕТСКИ ЦЕНТЪР \"ТОКУДА\""));
          }
          link.click();
        }
      } catch(NoSuchElementException ex) {
        try {
          link = driver.findElement(By.linkText("Многопрофилен детски център \"Токуда\""));
        } catch(NoSuchElementException ex2) {
          link = driver.findElement(By.linkText("МНОГОПРОФИЛЕН ДЕТСКИ ЦЕНТЪР \"ТОКУДА\""));
        }
        link.click();
      }
    }
    {
      WebElement link;
      try {
        link = driver.findElement(By.xpath("//a[text()='Контакти']"));
        try {
          link.click();
        } catch(ElementNotVisibleException ex) {
          try {
            link = driver.findElement(By.linkText("Контакти"));
          } catch(NoSuchElementException ex2) {
            link = driver.findElement(By.linkText("КОНТАКТИ"));
          }
          link.click();
        }
      } catch(NoSuchElementException ex) {
        try {
          link = driver.findElement(By.linkText("Контакти"));
        } catch(NoSuchElementException ex2) {
          link = driver.findElement(By.linkText("КОНТАКТИ"));
        }
        link.click();
      }
    }
    {
      WebElement link;
      try {
        link = driver.findElement(By.xpath("//a[text()='Многопрофилен детски център \"Токуда\"']"));
        try {
          link.click();
        } catch(ElementNotVisibleException ex) {
          try {
            link = driver.findElement(By.linkText("Многопрофилен детски център \"Токуда\""));
          } catch(NoSuchElementException ex2) {
            link = driver.findElement(By.linkText("МНОГОПРОФИЛЕН ДЕТСКИ ЦЕНТЪР \"ТОКУДА\""));
          }
          link.click();
        }
      } catch(NoSuchElementException ex) {
        try {
          link = driver.findElement(By.linkText("Многопрофилен детски център \"Токуда\""));
        } catch(NoSuchElementException ex2) {
          link = driver.findElement(By.linkText("МНОГОПРОФИЛЕН ДЕТСКИ ЦЕНТЪР \"ТОКУДА\""));
        }
        link.click();
      }
    }
    {
      WebElement link;
      try {
        link = driver.findElement(By.xpath("//a[text()='София']"));
        try {
          link.click();
        } catch(ElementNotVisibleException ex) {
          try {
            link = driver.findElement(By.linkText("София"));
          } catch(NoSuchElementException ex2) {
            link = driver.findElement(By.linkText("СОФИЯ"));
          }
          link.click();
        }
      } catch(NoSuchElementException ex) {
        try {
          link = driver.findElement(By.linkText("София"));
        } catch(NoSuchElementException ex2) {
          link = driver.findElement(By.linkText("СОФИЯ"));
        }
        link.click();
      }
    }
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
}
