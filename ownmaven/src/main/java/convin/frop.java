package convin;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class frop {
    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        //System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Open the Amazon website
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.amazon.com/");

        // Let the page load
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Locate the dropdown element (example using the search category dropdown)
        WebElement dropdownElement = driver.findElement(By.id("searchDropdownBox"));

        // Create a Select object
        Select dropdown = new Select(dropdownElement);

        // Get all the options from the dropdown
        List<WebElement> options = dropdown.getOptions();

        // Print all values
        System.out.println("All values in the dropdown:");
        for (WebElement option : options) {
            System.out.println(option.getText());
        }

        // Close the browser
        driver.quit();
    }
}

