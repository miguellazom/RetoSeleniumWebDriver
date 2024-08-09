package step;

import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import webpage.parabankPage;
import de.svenjacobs.loremipsum.LoremIpsum;
import java.util.Random;

public class StepReto {
    @Steps
    parabankPage pageBank;
    private WebDriver driver;
    private LoremIpsum loremIpsum= new LoremIpsum();
    Random rand = new Random();
    private String username;
    private String password;
    public void inicializacionDriver(){
        System.setProperty("webdriver.chrome.driver","src/test/resources/driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void quitDriver(){
        driver.quit();
    }
    public void irWeb(String url){
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void registrarse(){
        pageBank.getRegisterLink(driver).click();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        pageBank.getFirstName(driver).sendKeys(loremIpsum.getWords(2));
        pageBank.getLastName(driver).sendKeys(loremIpsum.getWords(2));
        pageBank.getAddress(driver).sendKeys(loremIpsum.getWords(3));
        pageBank.getCity(driver).sendKeys(loremIpsum.getWords(1));
        pageBank.getState(driver).sendKeys(loremIpsum.getWords(1));
        pageBank.getZip(driver).sendKeys(rand.nextInt(100000)+"");
        pageBank.getPhone(driver).sendKeys(rand.nextInt(1000000000)+"");
        pageBank.getSsn(driver).sendKeys(rand.nextInt(1000)+"-"+rand.nextInt(100)+"-"+rand.nextInt(10000));
        this.username = loremIpsum.getWords(1)+rand.nextInt(1000);
        this.password = loremIpsum.getWords(1)+rand.nextInt(1000);
        pageBank.getRegUsername(driver).sendKeys(username);
        pageBank.getRegPassword(driver).sendKeys(password);
        pageBank.getConfPassword(driver).sendKeys(password);
        pageBank.getRegisterButton(driver).click();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    public void validoRegistroExitoso(){
        Assert.assertTrue(pageBank.getMensajeExito(driver).isEnabled());
        Assert.assertEquals("Your account was created successfully. You are now logged in.", pageBank.getMensajeExito(driver).getText());
    }

    public void logIn(){
        pageBank.getLogOut(driver).click();
        irWeb("https://parabank.parasoft.com/parabank/index.htm");
        pageBank.getLogInUsername(driver).sendKeys(this.username);
        pageBank.getLogInPassword(driver).sendKeys(this.password);
        pageBank.getLogIn(driver).click();
        Assert.assertEquals("ParaBank | Accounts Overview",driver.getTitle());
    }
}
