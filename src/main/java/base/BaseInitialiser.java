package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.Scenario;

public class BaseInitialiser {

	public static WebDriver driver;
	public static Scenario scenario;
	
	public BaseInitialiser() {
		
		WebDriver driver = new ChromeDriver();
	}
}
