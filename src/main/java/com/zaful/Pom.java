package com.zaful;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Pom extends Base_class{

	@FindBy(xpath = "//a[contains(@class,'form')]")
	public static WebElement text;
	@FindBy(className = "input")
	public static WebElement text1;
	@FindBy(xpath = "//a[contains(@id,'show')]//i")
	public static WebElement search;
}
