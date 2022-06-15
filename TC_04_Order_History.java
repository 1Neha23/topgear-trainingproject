package seleniumTest;

import java.io.FileInputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import jxl.Sheet;
import jxl.Workbook;

public class TC_04_Order_History {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost/opencart/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a/span[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a")).click();
		FileInputStream f1 = new FileInputStream("C:\\Users\\user\\Desktop\\openCart.xls");
	    Workbook w = Workbook.getWorkbook(f1);
	    Sheet s = w.getSheet(0);
	    String Email = s.getCell(0,0).getContents();
	    String Pass = s.getCell(1, 0).getContents();
	    driver.findElement(By.name("email")).sendKeys(Email);
		driver.findElement(By.name("password")).sendKeys(Pass);
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();
		driver.findElement(By.xpath("//*[@id=\"account-account\"]/ul/li[1]/a/i")).click();
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[1]/div/div[1]/a/img")).click();
		driver.findElement(By.xpath("//*[@id=\"button-cart\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"product-product\"]/div[1]/a[2]")).click();
		driver.findElement(By.name("quantity[877075]")).clear();
		driver.findElement(By.name("quantity[877075]")).sendKeys("3");
		driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/table/tbody/tr/td[4]/div/span/button[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div[2]/a")).click();
		// error in checkout the product

	}

}
