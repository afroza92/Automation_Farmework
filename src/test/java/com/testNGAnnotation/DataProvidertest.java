package com.testNGAnnotation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProvidertest {

	WebDriver driver;

	@DataProvider(name="Authentication")
	public static Object[][]credentials(){
		return new Object[][] {{"afrozaakter355@gmail.com","Akter172886" },
		                      {"afrozaakter355@gmail.com","Akter172886"},
		                      {"afrozaakter355@gmail.com","Akter172886"},  //data provider connect properly it will run
		                      {"xyz12345@gmail.com","xxx0989"}};  //data provider not connect properly this will fail
		                      
		
	}

	@Test(dataProvider="Authentication")
		public void getLogin(String Username, String Password) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("https://magento.softwaretestingboard.com/customer/account/login/referer/aHR0cHM6Ly9tYWdlbnRvLnNvZnR3YXJldGVzdGluZ2JvYXJkLmNvbS8%2C/");
			driver.manage().window().maximize();
			driver.findElement(By.id("email")).sendKeys(Username);
			driver.findElement(By.id("pass")).sendKeys(Password);
			driver.findElement(By.id("send2")).click();

		}
}
