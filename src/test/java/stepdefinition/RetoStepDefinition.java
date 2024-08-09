package stepdefinition;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.WebDriver;
import step.StepReto;

public class RetoStepDefinition
{
    @Steps
    StepReto stepReto;
    private WebDriver driver;

    @Before
    public void setUp(){
        stepReto.inicializacionDriver();
    }

    @After
    public void takeDown(){
        stepReto.quitDriver();
    }

    @Dado("^que me encuentro en la página web \"([^\"]*)\"$")
    public void que_me_encuentro_en_la_página_web(String url) {
       stepReto.irWeb(url);
    }

    @Dado("^me registro en la misma$")
    public void me_registro_en_la_misma() {
        stepReto.registrarse();
    }

    @Cuando("^se despliega el mensaje de registro exitoso$")
    public void se_despliega_el_mensaje_de_registro_exitoso() {
        stepReto.validoRegistroExitoso();
    }

    @Entonces("^inicio sesión con la cuenta creada$")
    public void inicio_sesión_con_la_cuenta_creada() {
        stepReto.logIn();
    }
}
