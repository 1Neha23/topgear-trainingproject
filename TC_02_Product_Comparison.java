package seleniumTest;

import java.io.FileInputStream;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import jxl.Sheet;
import jxl.Workbook;

public class TC_02_Product_Comparison {

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
	    String search = s.getCell(2, 0).getContents();
		driver.findElement(By.name("email")).sendKeys(Email);
		driver.findElement(By.name("password")).sendKeys(Pass);
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();
		driver.findElement(By.name("search")).sendKeys(search);
		driver.findElement(By.xpath("//*[@id=\"search\"]/span/button/i")).click();
		new Select(driver.findElement(By.name("category_id"))).selectByValue("28");
		driver.findElement(By.name("sub_category")).click();
		driver.findElement(By.xpath("//*[@id=\"button-search\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[6]/a")).click();
		new Select(driver.findElement(By.xpath("//*[@id=\"input-sort\"]"))).selectByValue("Price (High > Low)");
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[1]/div/div[2]/div[2]/button[3]")).click();
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[2]/div/div[2]/div[2]/button[3]")).click();
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[3]/div/div[2]/div[2]/button[3]")).click();
		driver.findElement(By.xpath("//*[@id=\"compare-total\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"content\"]/table/tbody[1]/tr[1]/td[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"button-cart\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"product-product\"]/div[1]/a[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div[2]/a")).click();
		//on check out it is error
		
		
		
				
	}

}
