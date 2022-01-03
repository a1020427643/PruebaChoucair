package p1;

import static org.junit.Assert.*;
import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.JavascriptExecutor;

@SuppressWarnings("unused")
public class GSTest {
	

	
private WebDriver driver;
	
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
	}

	@Test
	public void testGooglePage() {
		
		
		
		WebElement button = driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a"));
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		button.click();
		
		
		WebElement searchBox = driver.findElement(By.id("email_create"));
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		searchBox.click();
		searchBox.clear();
		searchBox.sendKeys("k2haesfsdddddcore@gmail.com");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		searchBox.submit();
		
		
		WebElement selectRadio = driver.findElement(By.id("uniform-id_gender1"));
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		selectRadio.click();
		
		
		WebElement firstBoxName = driver.findElement(By.id("customer_firstname"));
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		firstBoxName.click();
		firstBoxName.clear();
		firstBoxName.sendKeys("ERIC");
		
		
		WebElement lastBoxName = driver.findElement(By.id("customer_lastname"));
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		lastBoxName.click();
		lastBoxName.clear();
		lastBoxName.sendKeys("ESPINOSA");
		
		WebElement passWord1 = driver.findElement(By.id("passwd"));
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		passWord1.click();
		passWord1.clear();
		passWord1.sendKeys("ibMR6jtnB6Rr$6u");

		WebElement dateOfBirth = driver.findElement(By.id("days"));
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		dateOfBirth.click();
		dateOfBirth.sendKeys("26");
		dateOfBirth.click();
		
		WebElement dateOfBirth2 = driver.findElement(By.id("months"));
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		dateOfBirth2.click();
		dateOfBirth2.sendKeys("may");
		dateOfBirth2.click();
		
		WebElement dateOfBirth3 = driver.findElement(By.id("years"));
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		dateOfBirth3.click();
		dateOfBirth3.sendKeys("1985");
		dateOfBirth3.click();
		
		WebElement checkBox1 = driver.findElement(By.id("newsletter"));
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		checkBox1.click();
		
		
		WebElement checkBox2 = driver.findElement(By.id("uniform-optin"));
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		checkBox2.click();
		
		WebElement company = driver.findElement(By.id("company"));
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		company.click();
		company.clear();
		company.sendKeys("ninguna");
		
		WebElement adress = driver.findElement(By.id("address1"));
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		adress.click();
		adress.clear();
		adress.sendKeys("avenida 39a 62 42");
		
		
		WebElement city = driver.findElement(By.id("city"));
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		city.click();
		city.clear();
		city.sendKeys("BELLO");
		
		WebElement state = driver.findElement(By.id("id_state"));
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		state.click();
		state.sendKeys("Alabama");
		state.click();
		
		WebElement postcode = driver.findElement(By.id("postcode"));
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		postcode.click();
		postcode.clear();
		postcode.sendKeys("05105");
		
		WebElement id_country = driver.findElement(By.id("id_country"));
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		id_country.click();
		id_country.sendKeys("United States");
		id_country.click();
		
		WebElement homePhone = driver.findElement(By.id("phone"));
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		homePhone.click();
		homePhone.clear();
		homePhone.sendKeys("4812498");
		
		WebElement phone_mobile = driver.findElement(By.id("phone_mobile"));
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		phone_mobile.click();
		phone_mobile.clear();
		phone_mobile.sendKeys("+573004302427");
		
		WebElement adressAlias = driver.findElement(By.id("alias"));
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		adressAlias.click();
		adressAlias.clear();
		adressAlias.sendKeys("ADRESSALIAS");
		
	
		WebElement regbutton = driver.findElement(By.id("submitAccount"));
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		regbutton.click();
		
		
	}
	

		
		/*  WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.clear();
		searchBox.sendKeys("quality-stream Introducción a la Automatización de Pruebas de Software");
		searchBox.submit();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		assertEquals("quality-stream Introducción a la Automatización de Pruebas de Software - Google Search",driver.getTitle());
	}
	
	/*@Test void localizadores() {
		 
		By locator = By.id("id_del_elemento");
		
		By locator_name = By.name("name_elemnt");
		
		By locator_className = By.className("clase_elemento");
		
		By locator_tagName = By.tagName("tag");
		
		By locator_linktext = By.linkText("texto_link");
		
		By locator_partialLinkText = By.partialLinkText("parte_texto");
		
		By locator_cssSelector = By.cssSelector("input[name='q']");
		
		By locator_Xpath = By.xpath("//input[@name='q']");
		
		// JavaScript
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		 WebElement searchBox = (WebElement)js.executeScript("return document.getElementsByName('q')[0]");
		
	}*/
	
	@After
	public void tearDown() {
	driver.quit();
	}

}
