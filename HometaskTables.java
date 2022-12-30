package Hometask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HometaskTables {

	public static void main(String[] args) {
		// Create a new instance of Chrome driver
		WebDriver driver = new ChromeDriver();
						
		driver.manage().window().maximize();
					
		driver.navigate().to("https://www.w3schools.com/html/html_tables.asp");
		
		//First loop returns all the row if the table
		for (int i=2;i<=7;i++)
		for (int j=1;j<=3;j++){
			
			String sValue = null;
			sValue = driver.findElement(By.xpath("//*[@id=\"customers\"]/tbody/tr["+i+"]/td["+j+"]")).getText();
			System.out.println("The value of the row " + i + " and column " + j + " is: " +sValue);
		}
				
		
driver.quit();

}
}
