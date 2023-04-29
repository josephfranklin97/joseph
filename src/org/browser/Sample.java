package org.browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {

	public static void main(String[] args) {

		System.setProperty("webdriver.chromedriver",
				"C:\\Users\\Joseph Franklin\\eclipse-workspace\\BrowserLaunch\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.navigate().to("https://www.flipkart.com/");
		driver.navigate().to("https://www.amazon.in/");
		driver.navigate().to("https://www.facebook.com/");

		driver.navigate().refresh();

		driver.quit();

	}

}
