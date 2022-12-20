package org.sdet40pratice;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLinkes {

	@Test()
	public void brokenlink() throws IOException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver dri = new ChromeDriver();
		dri.manage().window().maximize();
		dri.get("https://www.ajio.com/");
		List<WebElement> links = dri.findElements(By.xpath("//a"));
		List<String> brokenlinks = new ArrayList<>();
		String url=null;
	
		for( WebElement link:links)
		{
			  url=link.getAttribute("href");
		
		   URL ur =new URL(url);
		 URLConnection urlconnection = ur.openConnection();
		 HttpURLConnection httpurlconnection = (HttpURLConnection)urlconnection;
		int statuscode = httpurlconnection.getResponseCode();
		String responcemes = httpurlconnection.getResponseMessage();
		if(statuscode!=200)
		{
			brokenlinks.add(url+"----------"+statuscode+"-----------"+responcemes);
		}
		
	}
	System.out.println(brokenlinks);
}
}
