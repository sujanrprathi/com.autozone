package AutozoneAutomation.com.autozone;

import java.time.Duration;
import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class InitialScript {
	
	@Test
	public void webSiteTest() throws InterruptedException {

		WebDriver driver;
		EdgeOptions edgeOptions=new EdgeOptions();
		edgeOptions.setCapability("ms:inPrivate", true);
		driver=new EdgeDriver(edgeOptions);
		SelectMenuItems selectMenuItems=new SelectMenuItems(driver);



		driver.get("https://www.autozone.com");
		//driver.manage().wait(2000);
		driver.manage().window().maximize();

		//Menu item select


		ArrayList<WebElement> menuList = (ArrayList<WebElement>) driver.findElements(By.xpath("//div[@class='az_bEb  az_QEb']//li"));
		String s = "Batteries";
		String compare="Duralast Battery BCI Group Size 49 850 CCA H8-DL";
		for (WebElement w : menuList) {
			//Select battery section	


			if (s.equals(w.getText())) {
				w.click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//h1[text()='Car Battery']")).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//button[@aria-label='close jebbit questionnaire']")).click();
				//driver.findElement(By.xpath("//div[@class='az_Vb az_Ecb az_Icb']//div[text()='add vehicle']")).click();
				driver.findElement(By.xpath("//input[@name='year']")).click();

				driver.findElement(By.xpath("//input[@name='year']")).sendKeys("2021");
				driver.findElement(By.xpath("//input[@name='make']")).click();
				driver.findElement(By.xpath("//input[@name='make']")).sendKeys("Audi");
				driver.findElement(By.xpath("//input[@name='model']")).click();
				driver.findElement(By.xpath("//input[@name='model']")).sendKeys("A5 Quattro Premium");
				driver.findElement(By.xpath("//input[@name='engine']")).click();

				Thread.sleep(3000);
				//System.out.println(driver.findElement(By.xpath("//div[@class='az_Q5 az_N5']")).getText());


				ArrayList<WebElement> resultList = (ArrayList<WebElement>) driver.findElements(By.xpath("//div[@class='az_Q5 az_X6b']//h3"));

				for (WebElement e : resultList) {

					String Result=e.getText();
					System.out.println(Result);

					if(Result.equals(compare))
					{
						driver.findElement(By.xpath("//div[@class='az_Q5 az_X6b']//ancestor::div[@class='az_uMb']//button[@aria-label='Add Duralast Battery BCI Group Size 49 850 CCA H8-DL TO CART ']")).click();
					}
				}

				break;
				//driver.findElement(By.xpath("//button[@aria-label='close jebbit questionnaire']")).click();
			}
			else System.out.println("Matching element not found");
		}
		Thread.sleep(3000);
		String cart=driver.findElement(By.xpath("//div[text()='Duralast Battery BCI Group Size 49 850 CCA H8-DL']")).getText();
		if(cart.equals(compare))
		{
			System.out.println("Selected Item added to cart successfully");
		}
		driver.quit();
	}

			
	}


		



