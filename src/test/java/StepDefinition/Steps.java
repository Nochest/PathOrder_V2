package StepDefinition;

import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;		
import cucumber.api.java.en.Then;		
import cucumber.api.java.en.When;
	

public class Steps {
	
	WebDriver driver;
	@Given("^The user goes to the Order section and presses new order$")				
    public void open_chrome_and_app() throws Throwable							
    {		
       	System.setProperty("webdriver.chrome.driver","C://CucumberSelenium/chromedriver.exe");
       	driver = new ChromeDriver();
       	driver.manage().window().maximize();
       	driver.get("http://localhost:4200/ordenesDespacho");
       	
       	driver.findElement(By.name("Nueva OrdenDespacho")).click();
    }		

    @When("^Input all the atributes for the creation of an order$")					
    public void enter_Information() throws Throwable 							
    {		
      	driver.findElement(By.name("numeroOrden")).sendKeys("CS01 number");
      	driver.findElement(By.name("prioridad")).sendKeys("CS01 prio");
      	driver.findElement(By.name("origen")).sendKeys("CS01 ori");
      	driver.findElement(By.name("cantidadBultos")).sendKeys("69");
      	driver.findElement(By.name("observacion")).sendKeys("CS01 ob");

    }		

    @Then("^Save the order with a random channel$")					
    public void save_info() throws Throwable 							
    {    		
       	driver.findElement(By.name("Aceptar")).click();
    }		

}
