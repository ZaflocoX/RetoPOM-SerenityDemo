package is.demo.serenity.steps;

import is.demo.serenity.pageObject.OrdenPage;
import is.demo.serenity.utils.EsperaExplicita;
import is.demo.serenity.utils.SeleccionOrden;
import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;


public class OrdenSteps {

    OrdenPage ordenPage = new OrdenPage();

    @Step("validar vista ventana Orden")
    public void validarVistaOrden() {
        EsperaExplicita.esperaCargarPagina(ordenPage.getDriver());

        Assert.assertThat(
                ordenPage.getDriver().
                        findElement(ordenPage.getTxtValidacionOrden()).isDisplayed(),Matchers.is(true)
        );

    }

    @Step("Seleccion aleatoria de orden")
    public void seleccionarOrdenAleatoria(){
        List<WebElement> buscaOrden = ordenPage.getDriver().findElements(ordenPage.getBtnSeleccionarOrden());
        buscaOrden.get(SeleccionOrden.numeroAleatorioEnRango(0,buscaOrden.size())).click();

    }

    @Step("Seleccion de empleado aleatorio")
    public  void seleccionarEmpleadoAleatorio(){
        ordenPage.getDriver().findElement(ordenPage.getDropEmpleados()).click();
        List<WebElement> buscaEmpleados = ordenPage.getDriver().findElements(ordenPage.getLiEmpleados());
        buscaEmpleados.get(SeleccionOrden.numeroAleatorioEnRango(0,buscaEmpleados.size())).click();
    }

    @Step("Aplicar cambios a la orden")
    public void guardarCambiosOrden(){

        ordenPage.getDriver().findElement(ordenPage.getBtnAplicarCambios()).click();
        /*
        Assert.assertTrue(
                ordenPage.getDriver().findElement(ordenPage.getAlertaCambios()).isDisplayed(),Matchers.is(true)

        );


        /*
        Assert.assertThat(
                ordenPage.getDriver().findElement(ordenPage.getAlertaCambios()).isDisplayed(),Matchers.is(true)

            );

         */
    }
}
