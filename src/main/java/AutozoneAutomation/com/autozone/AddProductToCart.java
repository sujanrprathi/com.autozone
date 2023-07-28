package AutozoneAutomation.com.autozone;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;

public class AddProductToCart extends AbstractClass{
	WebDriver driver;
	public AddProductToCart(WebDriver driver){

		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);

	}

	@FindBy(xpath = "//div[@class='az_Q5 az_X6b']//ancestor::div[@class='az_uMb']//button[@aria-label='Add Duralast Battery BCI Group Size 49 850 CCA H8-DL TO CART ']")
	WebElement selectProduct;
	
	}

			



		



