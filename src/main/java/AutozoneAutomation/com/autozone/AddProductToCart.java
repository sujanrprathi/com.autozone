package AutozoneAutomation.com.autozone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;

public class AddProductToCart extends AbstractClass{
	WebDriver driver;
	String productXpath;
	public AddProductToCart(WebDriver driver){

		super(driver);
		this.driver=driver;


	}

	public void addProduct(String productToAdd)
	{
		productXpath="//div[@class='az_Q5 az_X6b']//ancestor::div[@class='az_uMb']//button[@aria-label='"+productToAdd+"']";
		driver.findElement(By.xpath(productXpath)).click();
		String cart=driver.findElement(By.xpath("//div[text()='"+productToAdd+"']")).getText();
		if(cart.equals(productToAdd))
		{
			System.out.println("Selected Item added to cart successfully");
		}
	}

	}

			



		



