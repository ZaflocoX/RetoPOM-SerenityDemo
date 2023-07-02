package is.demo.serenity.steps;

import is.demo.serenity.pageObject.InicioPage;
import is.demo.serenity.utils.DatosExcel;
import net.thucydides.core.annotations.Step;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public class InicioSteps {

    InicioPage inicioPage = new InicioPage();

    @Step("Usuario ingresa a la pagina")
    public void iniciarNavegador(String vinculo){
        inicioPage.openUrl(vinculo);
    }

    @Step("Se agregan las credencial de usuario")
    public void ingresarUsuario()throws IOException {

        ArrayList<Map<String, String>> data = DatosExcel.leerDatosDeHojaDeExcel("src/test/resources/data/DLogin.xlsx", "DatosLogin");

        inicioPage.getDriver().findElement(inicioPage.getTxtUsuario()).clear();
        inicioPage.getDriver().findElement(inicioPage.getTxtUsuario()).sendKeys(data.get(0).get("Usuario"));

    }
    @Step("Se agregan las credencial de clave")
    public void ingresarClave()throws IOException{
        ArrayList<Map<String, String>> datac = DatosExcel.leerDatosDeHojaDeExcel("src/test/resources/data/DLogin.xlsx", "DatosLogin");

        inicioPage.getDriver().findElement(inicioPage.getTxtClave()).clear();
        inicioPage.getDriver().findElement(inicioPage.getTxtClave()).sendKeys(datac.get(0).get("Contraseña"));

    }

    @Step("clic en el boton de login")
    public void iniciarSesion()
    {
        inicioPage.getDriver().findElement(inicioPage.getBtnLogin()).click();
    }
}
