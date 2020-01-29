package CucumCasestudy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class stepDefinition {
	public static WebDriver driver;

	@Given("^user open TestMeApp$")
	public void userOpenTestMeApp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Drive2\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@When("^user click SignUp$")
	public void userClick() {
		driver.findElement(By.linkText("SignUp")).click();
	}

	@When("^user name as \"([^\"]*)\"$")
	public void enterUsername(String uname) {
		driver.findElement(By.id("userName")).sendKeys(uname);

	}

	@When("^enter first name as \"([^\"]*)\"$")
	public void enterFname(String Fname) {
		driver.findElement(By.id("firstName")).sendKeys(Fname);
	}

	@When("^enter last name as \"([^\"]*)\"$")
	public void enterLname(String Lname) {
		driver.findElement(By.id("lastName")).sendKeys(Lname);
	}

	@When("^enter password as \"([^\"]*)\"$")
	public void enterPwd(String pwd) {
		driver.findElement(By.id("password")).sendKeys(pwd);
	}

	@When("^enter confirm password as \"([^\"]*)\"$")
	public void enterCPwd(String Cpwd) {
		driver.findElement(By.id("pass_confirmation")).sendKeys(Cpwd);
	}

	@When("^select gender as \"([^\"]*)\"$")
	public void enterGen(String gen) {
		if (gen.equalsIgnoreCase("male")) {
			driver.findElement(By.xpath("//input[@value='Male']")).click();
		} else if (gen.equalsIgnoreCase("female"))
			driver.findElement(By.xpath("//input[@value='Female']")).click();

	}

	@When("^enter email as \"([^\"]*)\"$")
	public void enterMail(String email) {
		driver.findElement(By.id("emailAddress")).sendKeys(email);
	}

	@When("^enter mobile number as \"([^\"]*)\"$")
	public void enterNum(String num) {
		driver.findElement(By.id("mobileNumber")).sendKeys(num);
	}

	@When("^enter DOB as \"([^\"]*)\"$")
	public void enterDOB(String dob) {
		driver.findElement(By.id("dob")).sendKeys(dob);
	}

	@When("^enter Address as \"([^\"]*)\"$")
	public void enterADD(String add) {
		driver.findElement(By.id("address")).sendKeys(add);
	}

	@When("^enter security question as \"([^\"]*)\"$")
	public void enterQUES(String que) {
		driver.findElement(By.id("securityQuestion")).sendKeys(que);
	}

	@When("^enter answer as \"([^\"]*)\"$")
	public void enterANSW(String ans) {
		driver.findElement(By.id("answer")).sendKeys(ans);
	}

	@When("^user click on Register")
	public void registerClick() {
		driver.findElement(By.name("Submit")).click();
	}
}