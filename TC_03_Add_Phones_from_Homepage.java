package seleniumTest;

import java.io.FileInputStream;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import jxl.Sheet;
import jxl.Workbook;

public class TC_03_Add_Phones_from_Homepage {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost/opencart/");
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a")).click();
		FileInputStream f1 = new FileInputStream("C:\\Users\\user\\Desktop\\openCart.xls");
	    Workbook w = Workbook.getWorkbook(f1);
	    Sheet s = w.getSheet(0);
	    String email = s.getCell(0, 0).getContents();
	    String pass = s.getCell(1, 0).getContents();
		driver.findElement(By.name("email")).sendKeys(email);
		driver.findElement(By.name("password")).sendKeys(pass);
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();
		driver.findElement(By.xpath("//*[@id=\"account-account\"]/ul/li[1]/a/i")).click();
		driver.findElement(By.xpath("//*[@id=\"slideshow0\"]/div/div[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/ul[1]/li[1]/a")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div/button[2]")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div/button[2]")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div/button[2]")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div/button[2]")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div/button[2]")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div/button[2]")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/button")).click();
		driver.findElement(By.xpath("//*[@id=\"button-cart\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[4]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"accordion\"]/div[2]/div[1]/h4/a")).click();
		driver.findElement(By.xpath("//*[@id=\"input-country\"]")).click();
		new Select(driver.findElement(By.name("country_id"))).selectByValue("99");
		new Select(driver.findElement(By.name("zone_id"))).selectByValue("1505");
		driver.findElement(By.name("postcode")).sendKeys("208001");
		driver.findElement(By.xpath("//*[@id=\"button-quote\"]")).click();
		driver.findElement(By.name("shipping_method")).click();
		driver.findElement(By.xpath("//*[@id=\"button-shipping\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"accordion\"]/div[1]/div[1]/h4/a")).click();
		driver.findElement(By.name("coupon")).sendKeys("amazon4345");
		driver.findElement(By.xpath("//*[@id=\"button-coupon\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div[2]/a")).click();
		//checking out
		driver.findElement(By.xpath("//*[@id=\"accordion\"]/div[2]/div[1]/h4/a")).click();
		driver.findElement(By.name("firstname")).sendKeys("");
		driver.findElement(By.name("lastname")).sendKeys("");
		driver.findElement(By.name("address_1")).sendKeys("");
		driver.findElement(By.name("city")).sendKeys("");
		driver.findElement(By.name("postcode")).sendKeys("");
		new Select(driver.findElement(By.name("country_id"))).selectByValue("99");
		new Select(driver.findElement(By.name("zone_id"))).selectByValue("");
		driver.findElement(By.xpath("//*[@id=\"button-payment-address\"]")).click();
		// error on selecting state and country in checkout
		

	}

}
