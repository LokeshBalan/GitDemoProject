import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Selenium_Automaiton {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DIVYABHARATHI\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/");
		driver.getCurrentUrl();
	    System.out.println(driver.getTitle());
	    driver.manage().window().maximize();
	    
	    driver.navigate().to("https://rahulshettyacademy.com/dropdownsPractise/");
//STATIC Drop down	   
	    WebElement staticdropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
	    Select dropdown = new Select(staticdropdown);
	    dropdown.selectByIndex(3);
	    dropdown.selectByVisibleText("INR");
	    dropdown.selectByValue("AED");
	    System.out.println(dropdown.getFirstSelectedOption().getText());
	    
	    
//DYNAMIC Drop down
	    
	    driver.navigate().to("https://rahulshettyacademy.com/dropdownsPractise/");
	    Thread.sleep(2000L);
	    driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
	    driver.findElement(By.xpath("//a[@value='BLR']")).click();
	    Thread.sleep(2000);
	    //driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();    
   //PARENR RELATIVE XPATH
	    
	    driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
	   
	    Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

	  //Assert.assertFalse(true);System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

	  driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();

	  System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

	  Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
	    //driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();    
	    driver.findElement(By.id("divpaxinfo")).click();

	    Thread.sleep(2000L);

	    /*integer i=1;
	      while(i<5) {
	         driver.findElement(By.id("hrefIncAdt")).click();//4 times
	                       i++;
	              }*/

	    System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

	 for(int i=1;i<5;i++) {
	 driver.findElement(By.id("hrefIncAdt")).click();
	 }

	 driver.findElement(By.id("btnclosepaxoption")).click();

	 Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");

	 System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
	 
	 
//AUTOSUGGEST	DROPDOWN 
	 driver.findElement(By.id("autosuggest")).sendKeys("ind");

	 Thread.sleep(3000);

	 List<WebElement> options =driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));

	 for(WebElement option :options)

	 {

	 if(option.getText().equalsIgnoreCase("India"))

	 {

	 option.click();

	 break;

	 }

	 }

	 }


	 
	 
	 
	 
	 
		}
	
	
	

	


