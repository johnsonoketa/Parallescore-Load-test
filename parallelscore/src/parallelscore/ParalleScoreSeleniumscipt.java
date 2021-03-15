package parallelscore;

import javax.lang.model.element.NestingKind;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Seleniumscipt {

		
				private static final String BROWSER = "chrome";
				private static final String HOME_PAGE = "http://parallelscore.xyz:5700/home";
				private static WebDriver driver = null;

				public static void main(String[] args) {
					// Choose browser

					// Go to Home Page
					if (BROWSER.equals("chrome")) {
						System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
						driver = new ChromeDriver();
					} else if (BROWSER.equals("firefox")) {
						System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
						driver = new FirefoxDriver();
					} else 

		// Open URL
		System.out.println("Opening URL :" + HOME_PAGE);
		driver.get(HOME_PAGE);

		// sign up scripts		
		driver.findElement(By.xpath("//*[@id=\"main-app-route\"]/div[1]/nav/div[2]/button[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"app-blocking-loader\"]/div/div[2]/form/div[1]/input")).sendKeys("Johnson");
		driver.findElement(By.xpath("//*[@id=\"app-blocking-loader\"]/div/div[2]/form/div[2]/input")).sendKeys("Oketa");
		driver.findElement(By.xpath("//*[@id=\"app-blocking-loader\"]/div/div[2]/form/div[3]/input"))
				.sendKeys("johnsonoketa@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"show_hide_password\"]/input")).sendKeys("Chibunna42!");
		driver.findElement(By.xpath("//*[@id=\"app-blocking-loader\"]/div/div[2]/form/button")).click();

		driver.get("http://parallelscore.xyz:5700/home\\");
		// login page
		driver.findElement(By.xpath("//*[@id=\"main-app-route\"]/div[1]/nav/div[2]/button[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"app-blocking-loader\"]/div/div[2]/form/div[1]/input")).sendKeys("johnsonoketa@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"app-blocking-loader\"]/div/div[2]/form/div[2]/input"))
				.sendKeys("Chibunna42!");
		driver.findElement(By.xpath("//*[@id=\"app-blocking-loader\"]/div/div[2]/form/button")).click();
		
		//interaction  with the web elements
		driver.get("http://parallelscore.xyz:5700/home\\");
		driver.findElement(By.xpath("//*[@id=\"main-app-route\"]/div[1]/nav/div[1]/a[3]")).click();
		driver.findElement(By.xpath("//*[@id=\"main-app-route\"]/div[1]/nav/div[1]/a[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"main-app-route\"]/div[1]/nav/div[1]/a[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"app-landing-page\"]/div[1]/div/div[2]/button")).click();
	
		System.out.println("HOME_PAGE");
	}

}
