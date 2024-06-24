package broadwayinfosys;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class Broadway  extends BasicSetup{
	@BeforeClass
	public void messageBeforeClass(){
		System.out.println("Always display this message before class");
	}
	
	
	@BeforeMethod
	public void messageBeforeTestCases() {
		System.out.println("Always display this message before method");
	}
	
	
	@Test(priority=1)//Test case for landing page
	public static void landingPage()  {
		
		driver.manage().window().maximize(); 
	    WebElement searchBar=driver.findElement(By.id("search"));
	    String query="QA Training";
	    searchBar.sendKeys(query);
	    
	    searchBar.submit();
	    
		
	}

	@Test(priority=2)//Test Case for Reserve Page 
	public static void courseResults() {
		
		
		driver.manage().window().maximize(); 
	   
	    driver.findElement(By.xpath("//a[@class='navbar-brand']")).click();
	    }
	
	@Test(priority=3)
	public static void HoverTest() {
		driver.manage().window().maximize(); 
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,500)");
		customWait(2000);
		 WebElement hoverElement=driver.findElement(By.xpath("//a[@class='hovered']"));
		    Actions actions=new Actions(driver);
		    actions.moveToElement(hoverElement).perform();
		   

	}
	
	
	private static void customWait(int i) {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(2000);
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
	}


	@AfterMethod //Display message after each method
	public void messageAfterMethod(){
		System.out.println("Always display this message after method");
	}
	
	@AfterClass //Display message after class
	public void messageAfterClass() {
		System.out.println("Always display this message after class");
	}
	
	
		

}
