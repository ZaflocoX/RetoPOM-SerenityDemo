package is.demo.serenity.stepDefinitions;

import cucumber.api.java.es.*;
import is.demo.serenity.steps.InicioSteps;
import is.demo.serenity.steps.OrdenSteps;
import is.demo.serenity.steps.PanelPrincipalSteps;
import is.demo.serenity.utils.DatosExcel;
import net.thucydides.core.annotations.Steps;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public class CnombreOrdenStepDefinitions {

    @Steps
    InicioSteps inicioSteps;
    @Steps
    PanelPrincipalSteps panelPrincipalSteps;
    @Steps
    OrdenSteps ordenSteps;
    @Dado("^que el usuario ingresa a la pagina \"([^\"]*)\"$")
    public void queElUsuarioIngresaALaPagina(String vinculo)throws IOException {
        inicioSteps.iniciarNavegador(vinculo);
        ArrayList<Map<String, String>> data = DatosExcel.leerDatosDeHojaDeExcel("src/test/resources/data/DLogin.xlsx", "DatosLogin");
        inicioSteps.ingresarUsuario();
        inicioSteps.ingresarClave();
        inicioSteps.iniciarSesion();

    }


    @Cuando("^visualice la pagina de dashboard$")
    public void visualiceLaPaginaDeDashboard() {
        panelPrincipalSteps.validarPanelPrincipal();

    }

    @Cuando("^de clic sobre el boton de ordenes$")
    public void deClicSobreElBotonDeOrdenes() {

        panelPrincipalSteps.clicOrden();

    }

    @Entonces("^puede seleccionar alguna y aplicar los cambios$")
    public void puedeSeleccionarAlgunaYAplicarLosCambios() {
        ordenSteps.validarVistaOrden();
        ordenSteps.seleccionarOrdenAleatoria();
        ordenSteps.seleccionarEmpleadoAleatorio();
        ordenSteps.guardarCambiosOrden();

    }

}
