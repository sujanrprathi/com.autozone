import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class InitialTest {
    public static void main(String[] args){
        EdgeOptions edgeOptions=new EdgeOptions();
        edgeOptions.addArguments("-inprivate");
        WebDriver driver=new EdgeDriver(edgeOptions);
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://www.autozone.com/");
        driver.manage().window().maximize();

        //Sign in
        driver.findElement(By.xpath("//div[text()='Sign In']")).click();
        driver.findElement(By.xpath("//a[text()='Sign In']")).click();

        //Popup Iframe
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        //WebElement popup=driver.findElement(By.xpath("//button[@aria-label='close jebbit questionnaire']"));
        By by=By.xpath("//button[@aria-label='close jebbit questionnaire']");
        wait.until(ExpectedConditions.presenceOfElementLocated(by));
        driver.findElement(By.xpath("//button[@aria-label='close jebbit questionnaire']")).click();

        //Back to Sign in
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("prut201969@gmail.com");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Sujatha@123");
        driver.findElement(By.xpath("//span[text()='Sign In']")).click();




    }
}
