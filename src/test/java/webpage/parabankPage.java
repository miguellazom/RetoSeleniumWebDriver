package webpage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class parabankPage {
    By registerLink = By.xpath("//*[@id=\"loginPanel\"]/p[2]/a");
    By firstName = By.id("customer.firstName");
    By lastName = By.id("customer.lastName");
    By address = By.id("customer.address.street");
    By city = By.id("customer.address.city");
    By state = By.id("customer.address.state");
    By zip = By.id("customer.address.zipCode");
    By phone = By.id("customer.phoneNumber");
    By ssn = By.id("customer.ssn");
    By regUsername = By.id("customer.username");
    By regPassword = By.id("customer.password");
    By confPassword = By.id("repeatedPassword");
    By registerButton = By.xpath("//*[@id=\"customerForm\"]/table/tbody/tr[13]/td[2]/input");
    By mensajeExito = By.xpath("//*[@id=\"rightPanel\"]/p");
    By logOut = By.xpath("//*[@id=\"leftPanel\"]/ul/li[8]/a");
    By logInUsername = By.name("username");
    By logInPassword = By.name("password");
    By logIn = By.xpath("//*[@id=\"loginPanel\"]/form/div[3]/input");
    public WebElement getRegisterLink(WebDriver driver) {
        WebElement RegisterLink = driver.findElement(registerLink);
        return RegisterLink;
    }
    public WebElement getFirstName(WebDriver driver) {
        WebElement FirstName = driver.findElement(firstName);
        return FirstName;
    }

    public WebElement getLastName(WebDriver driver) {
        WebElement LastName = driver.findElement(lastName);
        return LastName;
    }

    public WebElement getAddress(WebDriver driver) {
        WebElement Address = driver.findElement(address);
        return Address;
    }

    public WebElement getCity(WebDriver driver) {
        WebElement City = driver.findElement(city);
        return City;
    }

    public WebElement getState(WebDriver driver) {
        WebElement State = driver.findElement(state);
        return State;
    }

    public WebElement getZip(WebDriver driver) {
        WebElement Zip = driver.findElement(zip);
        return Zip;
    }

    public WebElement getPhone(WebDriver driver) {
        WebElement Phone = driver.findElement(phone);
        return Phone;
    }

    public WebElement getSsn(WebDriver driver) {
        WebElement Ssn = driver.findElement(ssn);
        return Ssn;
    }

    public WebElement getRegUsername(WebDriver driver) {
        WebElement RegUsername = driver.findElement(regUsername);
        return RegUsername;
    }

    public WebElement getRegPassword(WebDriver driver) {
        WebElement RegPassword = driver.findElement(regPassword);
        return RegPassword;
    }

    public WebElement getConfPassword(WebDriver driver) {
        WebElement ConfPassword = driver.findElement(confPassword);
        return ConfPassword;
    }

    public WebElement getRegisterButton(WebDriver driver) {
        WebElement RegisterButton = driver.findElement(registerButton);
        return RegisterButton;
    }

    public WebElement getMensajeExito(WebDriver driver) {
        WebElement MensajeExito = driver.findElement(mensajeExito);
        return MensajeExito;
    }

    public WebElement getLogOut(WebDriver driver) {
        WebElement LogOut = driver.findElement(logOut);
        return LogOut;
    }

    public WebElement getLogInUsername(WebDriver driver) {
        WebElement LogInUsername = driver.findElement(logInUsername);
        return LogInUsername;
    }

    public WebElement getLogInPassword(WebDriver driver) {
        WebElement LogInPassword = driver.findElement(logInPassword);
        return LogInPassword;
    }

    public WebElement getLogIn(WebDriver driver) {
        WebElement LogIn = driver.findElement(logIn);
        return LogIn;
    }
}
