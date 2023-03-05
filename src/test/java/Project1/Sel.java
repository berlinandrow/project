package Project1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel {

	@Test
	public void ber() {
	WebDriverManager.chromedriver().setup();
	WebDriver wb = new ChromeDriver();
	wb.get("https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager/5.1.0");
	System.out.println(wb.getTitle());
	wb.close();	
		
	}
		
	
	
}
