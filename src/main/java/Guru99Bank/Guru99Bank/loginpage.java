package Guru99Bank.Guru99Bank;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginpage {

	public static void main(String[] args) {
		
	        System.setProperty("webdriver.chrome.driver", "C:/Users/ACCELERATION ENGG/Desktop/chromedriver.exe"); 
	        WebDriver driver = new ChromeDriver();
	        String applicationURL = "https://demo.guru99.com/V4/";
	       driver.get(applicationURL);
	       
	       String actualTitle = driver.getTitle();
	       System.out.println(actualTitle);
	    }
	}




