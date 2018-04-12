package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {

    public RegistrationPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.NAME, using = "email_create")
    public WebElement txtUserName;

    @FindBy(how = How.NAME, using = "SubmitCreate")
    public WebElement btnRegister;

    @FindBy(how = How.ID, using = "id_gender1")
    public WebElement btnGender;

    @FindBy(how = How.ID, using = "customer_firstname")
    public WebElement txtFirstName;

    @FindBy(how = How.ID, using = "customer_lastname")
    public WebElement txtLastName;

    @FindBy(how = How.ID, using = "passwd")
    public WebElement txtPasswd;

    @FindBy(how = How.ID, using = "company")
    public WebElement txtCompany;

    @FindBy(how = How.ID, using = "address1")
    public WebElement txtAddress1;

    @FindBy(how = How.ID, using = "city")
    public WebElement txtCity;

    @FindBy(how = How.ID, using = "postcode")
    public WebElement txtPostcode;

    @FindBy(how = How.ID, using = "phone_mobile")
    public WebElement txtPhonemobile;

    @FindBy(how = How.ID, using = "alias")
    public WebElement txtAlias;

    @FindBy(how = How.ID, using = "days")
    public WebElement selectDays;

    @FindBy(how = How.ID, using = "months")
    public WebElement selectMonths;

    @FindBy(how = How.ID, using = "years")
    public WebElement selectYears;

    @FindBy(how = How.ID, using = "id_country")
    public WebElement selectCountry;

    @FindBy(how = How.ID, using = "id_state")
    public WebElement selectState;

    @FindBy(how = How.ID, using = "submitAccount")
    public WebElement btnSubmitAccount;


    public void SendEmail(String userName)
    {
        txtUserName.sendKeys(userName);

    }

    public void FillData(String firstName, String lastName, String passWord, String addrCompany, String addrAddress, String addrCity, String addrZipcode, String addrMobile, String addressAlias){

        txtFirstName.sendKeys(firstName);
        txtLastName.sendKeys(lastName);
        txtPasswd.sendKeys(passWord);
        txtCompany.sendKeys(addrCompany);
        txtAddress1.sendKeys(addrAddress);
        txtCity.sendKeys(addrCity);
        txtPostcode.sendKeys(addrZipcode);
        txtPhonemobile.sendKeys(addrMobile);
        txtAlias.sendKeys(addressAlias);


    }

    public void SelectDateOfBirth(String days, String months, String years){
        Select dropdownDays = new Select(selectDays);
        dropdownDays.selectByValue(days);
        Select dropdownMonths = new Select(selectMonths);
        dropdownMonths.selectByValue(months);
        Select dropdownYears = new Select(selectYears);
        dropdownYears.selectByValue(years);

    }

    public void SelectCountryState(String country, String state){
        Select dropdownCountry = new Select(selectCountry);
        //selectCountry.click();
        dropdownCountry.selectByValue("21");

        Select dropdownState = new Select(selectState);
        //selectState.click();
        dropdownState.selectByValue("5");
    }

    public void ClickRegister()
    {
        btnRegister.click();
    }

    public void SubmitAccount()
    {
        btnSubmitAccount.click();
    }

    public void ClickGender(String title){
        if(title.equals("Mr")){
            //System.out.println("Clicked");
            btnGender.click();
        }

    }


}
