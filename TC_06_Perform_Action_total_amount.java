package seleniumTest;

import java.io.FileInputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import jxl.Sheet;
import jxl.Workbook;

public class TC_06_Perform_Action_total_amount {
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
		driver.findElement(By.name("search")).sendKeys("canon");
		driver.findElement(By.xpath("//*[@id=\"search\"]/span/button")).click();
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div/div/div[1]/a")).click();
		new Select(driver.findElement(By.name("option[226]"))).selectByValue("15");
		driver.findElement(By.xpath("//*[@id=\"button-cart\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[4]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div[1]/a")).click();
		Thread.sleep(2000);
		driver.close();
	}
}
