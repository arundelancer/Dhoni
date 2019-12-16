package bro;

import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hello {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\eclipse-workspace\\browser\\dev\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.toolsqa.com/automation-practice-table/");
		List<WebElement> b = d.findElements(By.tagName("tr"));
	
			for (int i = 4; i<6; i++) {
				WebElement h = b.get(i);
				String text2 = h.getText();
				System.out.println(text2);
			 
			System.out.println("branch 1 line 1");
			}
		}
		
	
	}


