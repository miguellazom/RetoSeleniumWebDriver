### Reto
##### Instrucciones
- Navega al sitio https://parabank.parasoft.com/parabank/index.htm
- Da click en el link de "Register"
- Llena los campos de formulario con información aleatoria
- Da click en el botón "Register"
- Valida que se despliega el mensaje de éxito: "Your account was created successfully. You are now logged in."
- Navega de nuevo al sitio https://parabank.parasoft.com/parabank/index.htm
- Inicia sesión con la cuenta que se acaba de crear.

##### Requiere
- Maven 3.8
- Java 8

#### Uso
`mvn test`

# RetoSeleniumWebDriver
### Esquema de archivo
    test
    ├──java
    │   ├── runner
    │   │   └──  RunnerTest.java(clase de ejecución)
    │   ├── step
    │   │   └──StepReto.java (el detalle de la funcionalidad)
    │   ├── stepdefinition
    │   │   └── RetoStepDefinition.java(clase con hooks e interfaces)
    │   └── webpage
    │       └── parabankPage.java(selectores de todos los componentes de la web)
    └── resources
        ├── driver
        │   └──  chromedriver.exe(actualizar el chromedriver que utilice)
        └── features
            └──reto.feature (el feature escrito en lenguaje gherkin )
#### Ejecución
- Ingreso a la web　
![](https://raw.githubusercontent.com/miguellazom/RetoSeleniumWebDriver/main/src/test/resources/assets/Reto1.png)
- Me registro
  ![](https://raw.githubusercontent.com/miguellazom/RetoSeleniumWebDriver/main/src/test/resources/assets/Reto2.png)
- Reingreso con la cuenta creada
  ![](https://raw.githubusercontent.com/miguellazom/RetoSeleniumWebDriver/main/src/test/resources/assets/Reto3.png)
- Construcción correcta
  ![](https://raw.githubusercontent.com/miguellazom/RetoSeleniumWebDriver/main/src/test/resources/assets/ejecucion.png)
