package leviProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class leviAutomate {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sneha.saha1\\Downloads\\chromedriver_win32\\chromedriver.exe\\");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.levistrauss.com/");
		driver.findElement(By.id("navItem1"));
		driver.findElement(By.xpath("//body/div[@id='megaMenu1']/div[1]/div[1]/div[2]/div[1]/a[1]"));
		
		

	}

}
