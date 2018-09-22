package flipkart1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart1 {
	public static String driverPath = ("C:\\eclipse work space\\chrome");
	 public static WebDriver driver;

	public static void main(String[] args)throws InterruptedException {
		System.out.println("launching chrome");
		System.setProperty("webdriver.chrome.driver","C:\\eclipse work space\\flipkart\\exefiles\\chromedriver.exe");
		driver=new ChromeDriver();
driver.get("https://www.flipkart.com/");
driver.manage().window().maximize();
driver.findElement(By.xpath("//*[@id=\"container\"]/div/header/div[1]/div/div/div/div[3]/div[1]/div/a"));

driver.switchTo().activeElement();

        driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys("9640524893");
    

      
driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")).sendKeys("fliprevanth");

driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[3]/button")).click();
	}

}


