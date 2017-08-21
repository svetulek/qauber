package HomeworkLevel2Class6;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class timeouts
{	
	public static void main(String[] args) throws InterruptedException {
		
			System.setProperty("webdriver.gecko.driver", "./geckodriver 2");
			FirefoxDriver wb = new FirefoxDriver();
			WebDriverWait wait = new WebDriverWait(wb, 15);
			wb.get("http://qabidder.net/testwave/#/page/login");
			
		
			//Thread.sleep(2000);
			WebElement usernameTextBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("exampleInputEmail1")));//wb.findElement(By.id("exampleInputEmail1"));
			usernameTextBox.sendKeys("svetulek777@gmail.com");
			WebElement passwordTextBox = wb.findElement(By.id("exampleInputPassword1"));
			passwordTextBox.sendKeys("Password");
			wb.findElement(By.name("login.loginForm")).submit();
			//Thread.sleep(5000);
			WebElement reports = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("html/body/div[2]/aside[1]/div/nav/ul/li[4]/a/span")));
			//WebElement reports = wb.findElement(By.xpath ("html/body/div[2]/aside[1]/div/nav/ul/li[4]/a/span"));
			reports.click();
			//Thread.sleep(10000);
			WebElement InfoTab = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("html/body/div[2]/section/div/div/form/div[1]/div[2]/ol/li[2]/h4/div")));
			InfoTab.click();
			//Thread.sleep(10000);
			WebElement LastName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("html/body/div[2]/section/div/div/form/div[1]/div[2]/div[3]/fieldset/div[2]/div[1]/div/div/input")));
			LastName.sendKeys("Smith");
			WebElement FirstName = wb.findElement(By.xpath("html/body/div[2]/section/div/div/form/div[1]/div[2]/div[3]/fieldset/div[2]/div[2]/div/div/input"));
			FirstName.sendKeys("Simon");
		
		    WebElement GMembership = wb.findElementByXPath("html/body/div[2]/section/div/div/form/div[1]/div[2]/ol/li[5]/h4/div");
			GMembership.click();
			//Thread.sleep(10000);
			WebElement LocationofStop = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("locationOfStop")));
			LocationofStop.sendKeys("San Jose");
					
			WebElement Preview = wb.findElementByXPath("html/body/div[2]/section/div[1]/div/form/div[1]/div[2]/ol/li[8]/h4/div");     
			Preview.click();
					
			WebElement Publish = wb.findElementByXPath("html/body/div[2]/section/div[1]/div/form/div[2]/button[1]");
			Publish.click();
			
			//Thread.sleep(10000);
			WebElement Popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='ngdialog1']/div[2]/div/div/button[1]")));				
			Popup.click();
}
}


