package CucumCasestudy;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login {
	
     WebDriver driver;
     @Given("^users open homepage1$")
 	public void userOpenTestMeApp() {
 		System.setProperty("webdriver.chrome.driver", "C:\\Drive2\\chromedriver_win32\\chromedriver.exe");
 		driver = new ChromeDriver();
 		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
 		driver.manage().window().maximize();
 		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
 	}

	@When("^user click on SignIn1$")
	public void enterCredentials(DataTable dt) {
		
		driver.findElement(By.xpath("//a[@href='login.htm']")).click();
		List<String> cred = dt.asList(String.class);
		driver.findElement(By.id("userName")).sendKeys(cred.get(0));
		driver.findElement(By.id("password")).sendKeys(cred.get(1));
		driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]")).click();
		
	}
	@When("^user search for a product$")
	public void searchProduct(DataTable dt) {
		List<String> crd=dt.asList(String.class);
	driver.findElement(By.id("myInput")).sendKeys(crd.get(0));
	driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
	}
	@Then("^user add to cart$")
	public void add() {
	driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")).click();
	}
}