package Project1;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.bouncycastle.crypto.util.PublicKeyFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.deser.Deserializers.Base;
import com.zaful.Base_class;
import com.zaful.Pom;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel extends Pom{

 String data[]= {"shoe","shirt","pant"
		
	};
 @DataProvider(name = "test data")
 public String[] datas() {
	 return data;
 }

@BeforeMethod
	public   void ber() {
	set_up();
 
	 
	wb.get("https://www.zaful.com/");

	System.out.println(wb.getTitle());
	System.out.println("hello world");
	}
	@BeforeMethod	
	public  void coupon_close() {
	WebElement close = wb.findElement(By.xpath("//a[contains(@class,'close ')]"));
	close.click();
	
	}
	@Test(dataProvider = "test data")
	public void search(String name) {
		
		wb.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		PageFactory.initElements(wb, Pom.class);
JavascriptExecutor js = (JavascriptExecutor) wb;
Pom.text.click();
Pom.text1.sendKeys(name);
Actions ac = new Actions(wb);
ac.click(search).build().perform();


//Pom.search.click();

	}
	@AfterMethod
	public void close() {
		wb.close();
	}
	
}
