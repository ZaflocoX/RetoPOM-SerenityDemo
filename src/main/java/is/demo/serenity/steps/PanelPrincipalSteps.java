package is.demo.serenity.steps;

import is.demo.serenity.pageObject.PanelPrincipalPage;
import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;
import org.junit.Assert;

public class PanelPrincipalSteps {
    PanelPrincipalPage panelPrincipalPage = new PanelPrincipalPage();
    @Step("visualiza el panel principal")
    public void validarPanelPrincipal(){
      Assert.assertThat(
              panelPrincipalPage.getDriver().findElement(panelPrincipalPage.getSpLogo()).isDisplayed(),
              Matchers.is(true)
      );

    }

    @Step("clic al boton de ordenes")
    public void clicOrden(){
        panelPrincipalPage.getDriver().findElement(panelPrincipalPage.getBtnMoreinfoOrder()).click();
    }
}
