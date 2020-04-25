package utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateChrome {

    public WebDriver createChrome() {

        String sistema = System.getProperty("os.name");

        if (sistema.equals("Linux")) {
            System.setProperty("webdriver.chrome.driver", "lib/chromedriver");
        } else {
            System.setProperty("webdriver.chrome.driver", "lib/chromedriver.exe");
        }

        WebDriver navigator = new ChromeDriver();
        navigator.manage().window().maximize();
        navigator.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        return navigator;

    }

}

