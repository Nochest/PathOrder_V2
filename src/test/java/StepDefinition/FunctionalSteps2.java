package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FunctionalSteps2 {
	WebDriver driver;
	@Given("^Go to the shipment layout and enter in a new register$")				
    public void open_chrome_and_app() throws Throwable							
    {		
       	System.setProperty("webdriver.chrome.driver","C://CucumberSelenium/chromedriver.exe");
       	driver = new ChromeDriver();
       	driver.manage().window().maximize();
       	driver.get("http://localhost:4200/mercaderias");
       	
       	driver.findElement(By.name("nueva Mercaderia")).click();
    }		

    @When("^Someone enter all the information of a shipment including their type$")					
    public void enter_Information() throws Throwable 							
    {		
      	driver.findElement(By.name("descripcion")).sendKeys("dinamita y otros");
      	driver.findElement(By.name("tipo")).sendKeys("Explosivos");
      	driver.findElement(By.name("paraDesastre")).sendKeys("1");
    }
    
    @And("^Send the information to verify if it can be created$")
    public void verification() throws Throwable
    {
    	driver.findElement(By.name("btnCreate")).click();
    }
    
    @Then("^The shipments is created$")					
    public void save_info() throws Throwable 							
    {    	
       	driver.findElement(By.name("closeAdd")).click();
       	driver.get("http://localhost:4200/mercaderias");
    }	
    

    @And("^There is an error in the channel asignment$")
    public void errorInRegister()throws Throwable
    {
       	driver.get("http://localhost:4200/canales");
       	driver.findElement(By.name("rojo")).click();
       	driver.findElement(By.name("list of red")).click();
    }
    
    @Then("^Save the order with a random channel$")
    public void reenterInfotmation() throws Throwable
    {      	
    	driver.findElement(By.name("descripcion")).sendKeys("dinamita y otros");
    	driver.findElement(By.name("tipo")).sendKeys("Explosivos");
    	driver.findElement(By.name("paraDesastre")).sendKeys("1");
    	driver.findElement(By.name("btnCreate")).click();
    }

}
