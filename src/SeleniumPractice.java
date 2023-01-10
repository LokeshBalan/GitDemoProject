import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DIVYABHARATHI\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor) driver ;
		js.executeScript("document.getElementById('twotabsearchtextbox').value = 'HeadPhones' ");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal'][1]")).click();
		
		
		String ParentWindow = driver.getWindowHandle();
		System.out.println(ParentWindow);
		Set<String> windows = driver.getWindowHandles();
		
		List<String> windId = new ArrayList<String>(windows);
		
		for(int i=0; i<windId.size(); i++) {
			
			System.out.println(windId);
		}
		
//		driver.switchTo().window(windId.get(0));	
//		String windowname = driver.getTitle();
//		System.out.println(windowname);
//		
//		driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal'][1]")).click();
//		System.out.println(driver.getCurrentUrl());
//		
//		driver.switchTo().window(windId.get(1));
//		
//		driver.switchTo().window(windId.get(0));
		
	
	
		
		
		
		
//		driver.findElement(By.id("username")).sendKeys("Lokeshbalan");
//		driver.findElement(By.id("password")).sendKeys("Mayicomein@04", Keys.ENTER);
//		driver.manage().window().maximize();
//		
//		WebElement location = driver.findElement(By.className("search_combobox"));
//		WebElement hotel = driver.findElement(By.id("hotels"));
//		WebElement room_type = driver.findElement(By.id("room_type"));
//		WebElement roomNo = driver.findElement(By.id("room_nos"));
//		WebElement checkIn = driver.findElement(By.name("datepick_in"));
//		WebElement adultRoom = driver.findElement(By.id("adult_room"));
//		WebElement childRoom = driver.findElement(By.id("child_room"));
//		
//		Select option = new Select(location);
//		option.selectByValue("Brisbane");
//		
//		driver.findElement(By.id("radiobutton_0")).click();
//		driver.findElement(By.xpath("//input[id='continue']")).click();
//		
//		driver.findElement(By.className("first_name")).sendKeys("Lokesh");
//		driver.findElement(By.className("last_name")).sendKeys("Balan");
//		driver.findElement(By.id("address")).sendKeys("Chennai");
//        driver.findElement(By.id("cc_num")).sendKeys("1987787902029929");
        
        
        
        
        
        
        
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
