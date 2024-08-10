# RetoSeleniumWebDriver

Este proyecto es una prueba automatizada utilizando Selenium WebDriver para interactuar con el sitio de [Parabank](https://parabank.parasoft.com/parabank/index.htm).

## Índice

- [Instrucciones](#instrucciones)
- [Requisitos](#requisitos)
- [Instalación](#instalación)
- [Uso](#uso)
- [Estructura del Proyecto](#estructura-del-proyecto)
- [Ejecución](#ejecución)

## Instrucciones

Sigue los pasos a continuación para ejecutar la prueba automatizada:

1. **Navegar al sitio**: Visita [Parabank](https://parabank.parasoft.com/parabank/index.htm).
2. **Registro**: Haz clic en el enlace "Register".
3. **Completar formulario**: Llena los campos del formulario con información aleatoria.
4. **Enviar formulario**: Haz clic en el botón "Register".
5. **Verificación**: Asegúrate de que aparezca el mensaje de éxito: `"Your account was created successfully. You are now logged in."`
6. **Iniciar sesión**: Regresa al sitio y inicia sesión con la cuenta que acabas de crear.

## Requisitos

- **Maven**: Versión 3.8.
- **Java**: Versión 8.

## Instalación

1. **Clonar el repositorio**:
   ```bash
   git clone https://github.com/miguellazom/RetoSeleniumWebDriver.git
   cd RetoSeleniumWebDriver
   
2.  **Instalar dependencias**:
  
    ```bash
    mvn clean install
    
## Uso

Para ejecutar la prueba, utiliza el siguiente comando:

`mvn test`

## Estructura del Proyecto
    test
    ├── java
    │   ├── runner
    │   │   └── RunnerTest.java  // Clase principal para la ejecución
    │   ├── step
    │   │   └── StepReto.java  // Funcionalidad detallada de los pasos
    │   ├── stepdefinition
    │   │   └── RetoStepDefinition.java  // Definición de pasos con hooks e interfaces
    │   └── webpage
    │       └── parabankPage.java  // Selectores de todos los componentes de la web
    └── resources
    ├── driver
    │   └── chromedriver.exe  // Actualiza el chromedriver según tu versión de Chrome
    └── features
    └── reto.feature  // Feature escrito en lenguaje Gherkin

#### Ejecución
- Ingreso a la web　
![](https://raw.githubusercontent.com/miguellazom/RetoSeleniumWebDriver/main/src/test/resources/assets/Reto1.png)
- Registro
  ![](https://raw.githubusercontent.com/miguellazom/RetoSeleniumWebDriver/main/src/test/resources/assets/Reto2.png)
- Reingreso con la cuenta creada
  ![](https://raw.githubusercontent.com/miguellazom/RetoSeleniumWebDriver/main/src/test/resources/assets/Reto3.png)
- Construcción exitosa
  ![](https://raw.githubusercontent.com/miguellazom/RetoSeleniumWebDriver/main/src/test/resources/assets/ejecucion.png)
