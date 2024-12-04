package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.TestInstance;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;


public class BaseTest {

    protected WebDriver driver;

    @BeforeMethod
    public void openBrowser() {
        // WebDriver başlatma
        driver = new ChromeDriver();
        driver.get("https://www.amazon.com.tr");
        //  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  // Elementleri beklemek için
        driver.manage().window().maximize();  // Tarayıcıyı tam ekran yap








    }

//    @AfterMethod
//    public void tearDown() {
//        if (driver != null) {
//            driver.quit();  // Test tamamlandığında tarayıcıyı kapat
//        }
//    }



}