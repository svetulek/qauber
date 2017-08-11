package HomeworkLevel2Class4;



	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.firefox.FirefoxDriver;

	public class gmail {
		public static void main(String[] args) throws InterruptedException {
			
				System.setProperty("webdriver.gecko.driver", "./geckodriver 2");
			
				FirefoxDriver wb = new FirefoxDriver();
				wb.get("https://accounts.google.com/signin");
				Thread.sleep(2000);
				WebElement emailorPhone = wb.findElement(By.name("identifier"));
				emailorPhone.click();
		        emailorPhone.sendKeys("svetulek777@gmail.com");
		        WebElement nextButton = wb.findElement(By.xpath(".//*[@id='identifierNext']/content"));
				nextButton.click();
				Thread.sleep(2000);
				WebElement password = wb.findElement(By.name("password"));
				password.click();
				password.sendKeys("password");
				WebElement nextButton1= wb.findElement(By.xpath(".//*[@id='passwordNext']/content/span"));
				nextButton1.click();
				System.out.println("Your password is incorrect. Please try again");
				
				// I don't have additional gmail or test account, so I did it with incorrect password.
		}
	}
	