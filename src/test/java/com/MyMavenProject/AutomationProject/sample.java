package com.MyMavenProject.AutomationProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class sample {
	WebDriver driver;
	@Test
	public void test1()
	{
		driver=new FirefoxDriver();
LogReports.LogInfo("browser is succesfully launched");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(90,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		LogReports.LogInfo("application is successfully launched"+driver.getTitle());
		driver.findElement(By.id("email")).sendKeys("dattathreya04@gmail.com");
		LogReports.LogInfo("username entered into username field");
		driver.findElement(By.id("pass")).sendKeys("asdfgf");
		LogReports.LogInfo("password entered into password field");
		driver.findElement(By.id("u_0_2")).click();
		
	}

}
