package is.demo.serenity.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class InicioPage extends PageObject {

    By txtUsuario = By.id("LoginPanel0_Username");
    By txtClave = By.id("LoginPanel0_Password");
    By btnLogin = By.id("LoginPanel0_LoginButton");



    public By getTxtUsuario() {
        return txtUsuario;
    }

    public By getTxtClave() {
        return txtClave;
    }

    public By getBtnLogin() {
        return btnLogin;
    }
}
