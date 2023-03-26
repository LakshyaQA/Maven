package PackMaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Demo {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions ops;
        ops = new ChromeOptions();
        ops.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.chrome.driver", "G:/selinium/chromedriver_win32/chromedriver.exe/");
        WebDriver driver = new ChromeDriver(ops);
        driver.manage().window().maximize();
        driver.get("https://facebook.com");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        Thread.sleep(3000);
        driver.close();

    }
}
