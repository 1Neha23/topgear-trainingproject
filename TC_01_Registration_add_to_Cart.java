package seleniumTest;
// Registration and cart 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
// 
public class TC_01_Registration_add_to_Cart {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost/opencart/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a/span[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[1]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("firstname")).sendKeys("Neha");
		driver.findElement(By.name("lastname")).sendKeys("yadav");
		driver.findElement(By.name("email")).sendKeys("neha4554@gmail.com");
		driver.findElement(By.name("telephone")).sendKeys("1234567899");
		driver.findElement(By.name("password")).sendKeys("neha@wipro");
		driver.findElement(By.name("confirm")).sendKeys("neha@wipro");
		driver.findElement(By.name("agree")).click();
		driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"content\"]/p[4]/a")).click();
		driver.findElement(By.name("enquiry")).sendKeys("\"This is to Change of Address/Phone number");
		driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input")).click();
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"slideshow0\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/ul[2]/li[2]/a")).click();
		driver.findElement(By.name("text")).sendKeys("Product is fine and can be updated with more feature in future");
		new Select(driver.findElement(By.name("rating"))).selectByValue("5");
		driver.findElement(By.xpath("//*[@id=\"button-review\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div[1]/button[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"product-product\"]/div[1]/a[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"form-currency\"]/div/button")).click();
		driver.findElement(By.xpath("//*[@id=\"form-currency\"]/div/ul/li[2]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"form-currency\"]/div/button")).click();
		driver.findElement(By.xpath("//*[@id=\"form-currency\"]/div/ul/li[1]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"form-currency\"]/div/button")).click();
		driver.findElement(By.xpath("//*[@id=\"form-currency\"]/div/ul/li[3]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/table/tbody/tr/td[6]/button/i")).click();
		driver.findElement(By.xpath("//*[@id=\"account-wishlist\"]/div[1]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"account-wishlist\"]/ul/li[3]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/table/tbody/tr/td[6]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/a")).click();
		driver.findElement(By.xpath("//*[@id=\"column-right\"]/div/a[13]")).click();
		driver.close();
		
		
		
		
		
		
		
		
		

	}

}
