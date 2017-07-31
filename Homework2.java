package homework6;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Homework2 {
	public static void main(String[] args) throws InterruptedException {
		
			System.setProperty("webdriver.gecko.driver", "./geckodriver 2");
			
			FirefoxDriver wb = new FirefoxDriver();
			wb.get("http://qabidder.net/testwave/#/page/login");
			Thread.sleep(2000);
			WebElement usernameTextBox = wb.findElement(By.id("exampleInputEmail1"));
			usernameTextBox.sendKeys("svetulek777@gmail.com");
			WebElement passwordTextBox = wb.findElement(By.id("exampleInputPassword1"));
			passwordTextBox.sendKeys("Password");
			WebElement loginButton = wb.findElement(By.tagName("button"));
			loginButton.click();
			Thread.sleep(15000);
			
			WebElement reports = wb.findElement(By.xpath ("html/body/div[2]/aside[1]/div/nav/ul/li[4]/a/span"));
			reports.click();
			
			Thread.sleep(10000);
			WebElement InfoTab = wb.findElement(By.xpath("html/body/div[2]/section/div/div/form/div[1]/div[2]/ol/li[2]/h4/div"));
			InfoTab.click();
			Thread.sleep(10000);
			WebElement LastName = wb.findElement(By.xpath("html/body/div[2]/section/div/div/form/div[1]/div[2]/div[3]/fieldset/div[2]/div[1]/div/div/input"));
					LastName.sendKeys("Smith");
			WebElement FirstName = wb.findElement(By.xpath("html/body/div[2]/section/div/div/form/div[1]/div[2]/div[3]/fieldset/div[2]/div[2]/div/div/input"));
					FirstName.sendKeys("Simon");
		
		    WebElement GMembership = wb.findElementByXPath("html/body/div[2]/section/div/div/form/div[1]/div[2]/ol/li[5]/h4/div");
					GMembership.click();
					Thread.sleep(10000);
					
			//WebElement LocationofStop = wb.findElement(By.xpath("html/body/div[2]/section/div/div/form/div[1]/div[2]/div[6]/fieldset[2]/div[2]/div/div/div/input"));
				//	LocationofStop.sendKeys("San Jose");
					WebElement LocationofStop = wb.findElement(By.name("locationOfStop"));
					LocationofStop.sendKeys("San Jose");
					
			WebElement Preview = wb.findElementByXPath("html/body/div[2]/section/div[1]/div/form/div[1]/div[2]/ol/li[8]/h4/div");     
			Preview.click();
					
			WebElement Publish = wb.findElementByXPath("html/body/div[2]/section/div[1]/div/form/div[2]/button[1]");
			Publish.click();
			
			Thread.sleep(10000);
			WebElement Popup = wb.findElement(By.xpath(".//*[@id='ngdialog1']/div[2]/div/div/button[1]"));				
			Popup.click();
}
}


