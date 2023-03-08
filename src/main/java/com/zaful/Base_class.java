package com.zaful;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_class {
public WebDriver wb;

	public void set_up() {
	 WebDriverManager.chromedriver().setup();
	 wb = new ChromeDriver();
	
		wb.manage().window().maximize();
	}
}
