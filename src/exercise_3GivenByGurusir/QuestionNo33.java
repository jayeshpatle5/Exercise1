package exercise_3GivenByGurusir;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class QuestionNo33 {

	public static void main(String[] args) throws InterruptedException {
		//		33.	Selenium code for login page and how will u verify that the text u hv sent to username field ? 
		//				What will be the output?

		WebDriverManager.firefoxdriver().setup();
//         ChromeOptions options =new ChromeOptions();
//         options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	WebElement username=	driver.findElement(By.name("username"));
	//username.sendKeys("admin");
	
	String value=username.getAttribute("value");
	
	if(value.equals("admin")) {
		System.out.println("text entered");
	}else {
		System.out.println("Text not entered");
	}
	
	Thread.sleep(2000);
	driver.quit();
		//driver.findElement(By.name("password")).sendKeys("password");
		
		

	}

}
