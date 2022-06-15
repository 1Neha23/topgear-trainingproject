package seleniumTest;

import java.io.FileInputStream;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import jxl.Sheet;
import jxl.Workbook;

public class TC_07_Add_Product_FromCategory {

	public static void main(String[] args) throws Throwable {
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
		driver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[6]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[1]/div/div[2]/div[2]/button[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[2]/div/div[2]/div[2]/button[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[3]/div/div[2]/div[2]/button[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[4]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div[2]/a")).click();
		// on check out stuck on billing details
		

	}

}
