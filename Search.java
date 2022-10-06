package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Search {



    @When("^user enters a \"([^\"]*)\"$")
    public void user_enters_a(String arg1) throws Throwable {
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(arg1);
        driver.findElement(By.id("nav-search-submit-button")).click();

        // Write code here that turns the phrase above into concrete actions

    }

    @Then("^user should able to see related product$")
    public void user_should_able_to_see_related_product() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }


}
