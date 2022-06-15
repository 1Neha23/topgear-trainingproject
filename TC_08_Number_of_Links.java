package seleniumTest;

import java.io.FileInputStream;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import jxl.Sheet;
import jxl.Workbook;


public class TC_08_Number_of_Links {

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
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
	    //Using tagname with anchor
	    List<WebElement> links = driver.findElements(By.tagName("a"));
	    System.out.println( links.size());
	    driver.close();

	}

}
