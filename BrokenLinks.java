package interviewQuestions;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {
public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Fahmy\\eclipse-workspace\\Selenium10\\ChromeDriver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	String url="https://www.facebook.com/";
	driver.get(url);

// ALL LINKS
	
/*	List<WebElement> allLinks = driver.findElements(By.tagName("a"));
	int size = allLinks.size(); 
	System.out.println(size);
	
	for (WebElement link : allLinks) {
		String attribute = link.getAttribute("href");
		System.out.println(attribute);
	}
	*/
	
//ALL IMAGES
	
/*	List<WebElement> allImages = driver.findElements(By.tagName("img"));
	int s = allImages.size(); 
	System.out.println(s);
	
	for (WebElement image : allImages) {
		String att = image.getAttribute("src");
		System.out.println(att);
	}
	
	*/
	
// BROKEN LINKS
	
	
	List<WebElement> all = driver.findElements(By.tagName("a"));
	for(WebElement link: all) {
		String attribute = link.getAttribute("href");
		
		if (attribute != null) {
			URL u= new URL(attribute);
			URLConnection openConnection = u.openConnection();
			HttpsURLConnection http = (HttpsURLConnection) openConnection;
			int responseCode = http.getResponseCode();
			if(responseCode>=400) {
				System.out.println(attribute);
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	driver.close();
}
}
