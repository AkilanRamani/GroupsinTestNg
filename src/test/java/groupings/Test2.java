package groupings;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Test2 {
	
	@Test
	public void geekforgeeks() throws InterruptedException { 
	
		ChromeDriver driver = new ChromeDriver(); 
		SoftAssert softAssert = new SoftAssert(); 
		driver.manage().window().maximize(); 
		driver.get("https://www.geeksforgeeks.org/"); 
		String actualRersult=driver.getTitle(); 
	
		String expectedResult="GeeksforGeeks "; 
		
		softAssert.assertEquals(actualRersult,expectedResult,"Title is not Matching"); 
		Thread.sleep(2000); 
		driver.findElement(By.linkText("Java")).click(); 
		Thread.sleep(2000); 
		softAssert.assertAll(); 
		driver.close(); 
				
	} 
}

