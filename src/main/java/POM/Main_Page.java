package POM;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Main_Page {

	public WebDriver driver;
	JavascriptExecutor a;
	Select s;

	@FindBy(xpath = "//a[@class='logo']/.//img[@alt='Tendable Logo']")
	private WebElement home_page;

	@FindBy(xpath = "//img[@id='close-top-banner']")
	private WebElement close_top_banner;

	@FindBy(xpath = "//a[text()='Our Story']")
	private WebElement our_story;

	@FindBy(xpath = "//div[@class='button-links-panel']/.//a[text()='Request A Demo']")
	private WebElement request_a_demo_btn;

	@FindBy(xpath = "//a[@class='button  is-active']")
	private WebElement reqest_demo_active;

	@FindBy(xpath = "//a[text()='Our Solution']")
	private WebElement Our_Solution;

	@FindBy(xpath = "//a[text()='Why Tendable?']")
	private WebElement why_Tendable;

	@FindBy(xpath = "//div[@class='button-links-panel']/.//a[text()='Contact Us']")
	private WebElement contact_us;

	@FindBy(xpath = "//button[@data-target='.toggle-163701']/..//button[text()='Contact']")
	private WebElement contact;

	@FindBy(xpath = "//form[@id='contactMarketingPipedrive-163701']/..//input[@name='fullName']")
	private WebElement entername;

	@FindBy(xpath = "//form[@id='contactMarketingPipedrive-163701']/..//input[@name='organisationName']")
	private WebElement organisation;

	@FindBy(xpath = "//form[@id='contactMarketingPipedrive-163701']/..//input[@name='cellPhone']")
	private WebElement phoneno;

	@FindBy(xpath = "//form[@id='contactMarketingPipedrive-163701']/..//input[@name='email']")
	private WebElement email;

	@FindBy(xpath = "//form[@id='contactMarketingPipedrive-163701']/.//Select[@id='form-input-jobRole']")
	private WebElement selectrole;

	@FindBy(xpath = "//form[@id='contactMarketingPipedrive-163701']//input[@name='consentAgreed']")
	private WebElement agreebtn;

	@FindBy(xpath = "//form[@id='contactMarketingPipedrive-163701']/.//button[@class='button']")
	private WebElement submitbtn;

	@FindBy(xpath = "//div[@class='ff-form-errors']")
	private WebElement capture_error;

	@FindBy(xpath = "//li[text()='This field is required']")
	private WebElement capture_message_error;

	public Main_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public void home_Page() throws Throwable {

		close_top_banner.click();

		System.out.println("Home Page Test");

		Thread.sleep(2000);

		request_a_demo_btn.click();

		if (reqest_demo_active.isEnabled()) {
			System.out.println("Request a demo button is active on home");
		} else {
			System.out.println("Request a demo button is not active on home");
		}

	}

	public void our_story() throws Throwable {

		Thread.sleep(2000);

		our_story.click();

		request_a_demo_btn.click();

		if (reqest_demo_active.isEnabled()) {
			System.out.println("Request a demo button is active on our_story");
		} else {
			System.out.println("Request a demo button is not active on our_story");
		}

	}

	public void our_solution() throws Throwable {

		Thread.sleep(2000);

		Our_Solution.click();

		request_a_demo_btn.click();

		if (reqest_demo_active.isEnabled()) {
			System.out.println("Request a demo button is active on our_solution");
		} else {
			System.out.println("Request a demo button is not active on our_solution");
		}

	}

	public void why_tendal() throws Throwable {
		Thread.sleep(2000);

		why_Tendable.click();

		System.out.println(" on Why Tendable Page ");

		request_a_demo_btn.click();

		if (reqest_demo_active.isEnabled()) {
			System.out.println("Request a demo button is active on why_tendal");
		} else {
			System.out.println("Request a demo button is not active on why_tendal");
		}

		home_page.click();

	}

	public void test_contact_us() throws Throwable {
		Thread.sleep(3000);

		contact_us.click();

		Thread.sleep(2000);

		contact.click();

		entername.sendKeys(" Narendra Modi Sarkar ");

		Thread.sleep(2000);

		organisation.sendKeys(" BJP and Bharat Sarkar ");

		Thread.sleep(2000);

		phoneno.sendKeys("9101010101");

		Thread.sleep(2000);

		email.sendKeys("Narendra.Modi@IndianGOV.com");

		Thread.sleep(2000);

		s = new Select(selectrole);
		s.selectByVisibleText("Frontline worker");

		Thread.sleep(3000);

		agreebtn.click();

		submitbtn.click();

		String error = capture_error.getText();

		String msgerror = capture_message_error.getText();

		if (msgerror.equalsIgnoreCase("This field is required")) {
			System.out.println("Test case is pass displayed error is:- " + msgerror);
		} else {
			System.out.println("Test case is fails");
		}

		if (error.equalsIgnoreCase("Sorry, there was an error submitting the form. Please try again.")) {
			System.out.println("our Test ccase is passed displayed error is:- " + error);
		} else {
			System.out.println("our test case Fails");
		}

	}
}
