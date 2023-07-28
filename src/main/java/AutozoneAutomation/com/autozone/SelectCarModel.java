package AutozoneAutomation.com.autozone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;

public class SelectCarModel extends AbstractClass{
	WebDriver driver;
	public SelectCarModel(WebDriver driver){

		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);

	}

	@FindBy(xpath = "//input[@name='year']")
	WebElement modelYear;

	@FindBy(xpath ="//input[@name='make']")
	WebElement modelMake;

	@FindBy(xpath ="//input[@name='model']")
	WebElement modelModel;

	@FindBy(xpath ="//input[@name='engine']")
	WebElement modelEngine;

	@FindBy(xpath = "//div[@class='az_Q5 az_X6b']//h3")
	ArrayList<WebElement> displayedResults;

	public void addCarDetails(String carYear, String carMake, String carModel, String carEngine)
	{
		modelYear.click();
		modelYear.sendKeys(carYear);
		modelMake.click();
		modelMake.sendKeys(carMake);
		modelModel.click();
		modelModel.sendKeys(carModel);
		modelEngine.click();
	}

	public ArrayList<String> getResults(){
		ArrayList<String> resultSet=new ArrayList<>();
		for(WebElement w:displayedResults)
		{
			resultSet.add(w.getText());

		}
		return resultSet;
	}

	}

			



		



