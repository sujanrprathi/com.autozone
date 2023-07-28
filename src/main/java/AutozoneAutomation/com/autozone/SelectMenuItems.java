package AutozoneAutomation.com.autozone;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;

public class SelectMenuItems extends AbstractClass{
    WebDriver driver;
    ArrayList<WebElement> menuListItems;
    public SelectMenuItems(WebDriver driver){

        super(driver);
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@aria-label='Privacy']//button")
    WebElement cookiesPopUp;

    @FindBy(xpath = "//button[@id='hamburgerMenuBtn']//div[text()='Menu']")
    WebElement menuButton;

    @FindBy(xpath = "//div[@class='az_bEb  az_QEb']//li")
    ArrayList<WebElement> menuList;

    @FindBy(xpath = "//h1")
    WebElement pageHeading;

    public void selectMenuItem(String menuItem) throws InterruptedException {

        menuButton.click();
        Thread.sleep(3000);
        for (WebElement w : menuList) {
            if (menuItem.equals(w.getText())) {
                w.click();
                Thread.sleep(2000);
                String output=pageHeading.getText();
                System.out.println(output+" Section is opened");//validation point
            }
        }

    }

}
