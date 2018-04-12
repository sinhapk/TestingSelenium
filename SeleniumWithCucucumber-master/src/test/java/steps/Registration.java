package steps;

import Base.BaseUtil;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.RegistrationPage;

import java.util.ArrayList;
import java.util.List;

public class Registration extends BaseUtil {

    private  BaseUtil base;

    public Registration(BaseUtil base) {
        this.base = base;
    }

    @Then("^I should see Invalid email address error message$")
    public void iShouldSeeInvalidEmailAddressErrorMessage() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertEquals("Its not displayed", base.Driver.findElement(By.id("create_account_error")).isDisplayed(), false);
    }

    @Given("^I navigate to the home page$")
    public void iNavigateToTheHomePage() throws Throwable {
        System.out.println("Navigate Login Page");
        base.Driver.navigate().to("http://automationpractice.com/index.php?controller=authentication&back=my-account");
        base.Driver.manage().window().maximize();
    }

   /* @And("^I click on signin button$")
    public void iClickOnSigninButton() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        RegistrationPage page = new RegistrationPage(base.Driver);
        page.ClickRegister();
    } */

    @And("^I click on createanaccount button$")
    public void iClickOnCreateanaccountButton() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        RegistrationPage page = new RegistrationPage(base.Driver);
        page.ClickRegister();
    }

    @And("^I enter following to create an account$")
    public void iEnterFollowingToCreateAnAccount(DataTable table) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        List<Register> emails = new ArrayList<Register>();
        emails = table.asList(Register.class);
        RegistrationPage page = new RegistrationPage(base.Driver);
        for (Register email: emails) {
            page.SendEmail(email.emailaddress);
        }
    }

    @And("^I enter the following$")
    public void iEnterTheFollowing(DataTable table) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        List<Register2> datas = new ArrayList<Register2>();
        datas = table.asList(Register2.class);
        Thread.sleep(5000);
        RegistrationPage page = new RegistrationPage(base.Driver);

        for (Register2 data: datas) {
            //page.Register2(data.emailaddress);
            page.ClickGender(data.title.toString());

            page.FillData(data.firstname, data.lastname, data.password, data.addrcompany, data.addraddress, data.addrcity, data.addrzipcode, data.addrmobile, data.addressalias);
        }
    }

    @And("^I select date of birth$")
    public void iSelectDateOfBirth(DataTable table) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        List<List<String>> data2 = table.raw();
        RegistrationPage page = new RegistrationPage(base.Driver);
        page.SelectDateOfBirth(data2.get(1).get(0), data2.get(1).get(1), data2.get(1).get(2) );

    }

    @And("^I click on register button$")
    public void iClickOnRegisterButton() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        RegistrationPage page = new RegistrationPage(base.Driver);
        page.SubmitAccount();
    }

    @Then("^I should see registration is successful$")
    public void iShouldSeeRegistrationIsSuccessful() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertEquals("Its not displayed", base.Driver.findElement(By.className("logout")).isDisplayed(), true);
    }

    @And("^I select country and state$")
    public void iSelectCountryAndState(DataTable table) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        List<List<String>> data3 = table.raw();
        RegistrationPage page = new RegistrationPage(base.Driver);
        page.SelectCountryState(data3.get(1).get(0), data3.get(1).get(1));
    }


    public class Register {
        public String emailaddress;

        public Register(String emailAddress) {
            emailaddress = emailAddress;
        }
    }

    public class Register2 {
        public String title;
        public String firstname;
        public String lastname;
        public String password;
        public String addrcompany;
        public String addraddress;
        public String addrcity;
        public String addrzipcode;
        public String addrmobile;
        public String addressalias;

        public Register2(String Title, String firstName, String lastName, String passWord, String addrCompany, String addrAddress, String addrCity, String addrZipcode, String addrMobile, String addressAlias) {
            title = Title;
            firstname = firstName;
            lastname = lastName;
            password = passWord;
            addrcompany = addrCompany;
            addraddress = addrAddress;
            addrcity = addrCity;
            addrzipcode = addrZipcode;
            addrmobile = addrMobile;
            addressalias = addressAlias;
        }
    }
}
