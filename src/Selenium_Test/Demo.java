package Selenium_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo {

	public static void main(String[] args) {
	
		// Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "D:\\Backup_2026\\Documents\\Work\\chromedriver_2\\chromedriver.exe");
        
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		
//		WebElement e = driver.findElement(By.id("APjFqb"));
		WebElement e = driver.findElement(By.xpath("//textarea[contains(@id,'APjF')]"));
		e.sendKeys("Sele");
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement frm = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[@data-entityname='Selena Gomez']")));
		frm.click();
		
		driver.quit();	

		//Test
		//Now testing the push logic - Trial 2 
	}
}
