package seleniumTest;

import java.io.FileInputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import jxl.Sheet;
import jxl.Workbook;

public class TC_05_Gift_Voucher {

	public static void main(String[] args) throws Throwable {
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
	    String Rname = s.getCell(3, 0).getContents();
	    String Rmail = s.getCell(4, 0).getContents();
	    String Enquiry = s.getCell(5, 0).getContents();
	    String Phone = s.getCell(6, 0).getContents();
	    String Fname = s.getCell(0, 1).getContents();
	    String Lname = s.getCell(1, 1).getContents();
	    String Address = s.getCell(2, 1).getContents();
	    String city = s.getCell(3, 1).getContents();
	    String postcode = s.getCell(4, 1).getContents();
	    
	    driver.findElement(By.name("email")).sendKeys(Email);
		driver.findElement(By.name("password")).sendKeys(Pass);
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();
		driver.findElement(By.xpath("/html/body/footer/div/div/div[3]/ul/li[2]/a")).click();
		driver.findElement(By.name("to_name")).sendKeys(Rname);
		driver.findElement(By.name("to_email")).sendKeys(Rmail);
		driver.findElement(By.name("voucher_theme_id")).click();
		driver.findElement(By.xpath("//*[@id=\"content\"]/form/div[8]/div/input[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"content\"]/form/div[8]/div/input[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/a")).click();
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div[1]/a")).click();
		driver.findElement(By.xpath("/html/body/footer/div/div/div[2]/ul/li[1]/a")).click();
		driver.findElement(By.name("enquiry")).sendKeys(Enquiry);
		driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input")).click();
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/a")).click();
		driver.findElement(By.xpath("/html/body/footer/div/div/div[4]/ul/li[3]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/a")).click();
		driver.findElement(By.xpath("//*[@id=\"content\"]/ul[1]/li[1]/a")).click();
		driver.findElement(By.name("telephone")).clear();
		driver.findElement(By.name("telephone")).sendKeys(Phone);
		driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div[2]/input")).click();
		driver.findElement(By.xpath("//*[@id=\"content\"]/ul[2]/li[4]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/a")).click();
		driver.findElement(By.xpath("//*[@id=\"content\"]/ul[1]/li[3]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("firstname")).sendKeys(Fname);
		driver.findElement(By.name("lastname")).sendKeys(Lname);
		driver.findElement(By.name("address_1")).sendKeys(Address);
		driver.findElement(By.name("city")).sendKeys(city);
		driver.findElement(By.name("postcode")).sendKeys(postcode);
		
		new Select(driver.findElement(By.name("country_id"))).selectByValue("99");
		new Select(driver.findElement(By.name("zone_id"))).selectByValue("1505");
		new Select(driver.findElement(By.name("default"))).selectByValue("1");
		driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div[2]/input")).click();
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[5]/a")).click();
		driver.close();
		
		
		
		

	}

}
