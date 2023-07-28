package AutozoneAutomation.com.autozone;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class AbstractClass {
    WebDriver driver;

    public AbstractClass(WebDriver driver){
        this.driver=driver;
        driver=new EdgeDriver();
    }
}
