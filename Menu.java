package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Menu {

    public WebDriver driver;

     WebDriverManager.chromedriver().setup();


    @Given("^User on the Amazon homepage$")
    public void user_on_the_Amazon_homepage() throws Throwable {
        driver.get("https://www.amazon.co.uk/");
        driver.manage().window().maximize();
        driver.findElement(By.id("sp-cc-accept")).click();


    }


    @Then("^should be able to see all item in menu bar$")
    public void should_be_able_to_see_all_item_in_menu_bar() throws Throwable {

       String A= driver.findElement(By.xpath("//div[@id='nav-xshop-container']")).getText();
        System.out.println(A);


    }
}
