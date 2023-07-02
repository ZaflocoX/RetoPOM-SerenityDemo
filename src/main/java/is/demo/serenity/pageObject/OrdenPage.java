package is.demo.serenity.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;


public class OrdenPage extends PageObject {
    By txtValidacionOrden = By.xpath("//*[@class='slick-pg-stat']");
    By btnSeleccionarOrden = By.xpath("//a[contains(@class,\"s-EditLink s-Demo-Northwind-OrderLink\")]");

    By dropEmpleados = By.xpath("//div[@id='s2id_Serenity_Demo_Northwind_OrderDialog15_EmployeeID']");

    By liEmpleados = By.xpath("//ul[@id='select2-results-9']/li");
    By btnAplicarCambios = By.xpath("//div[@title='Apply Changes']");

    By alertaCambios = By.xpath("//div[@class='show toast toast-success']");
    public By getTxtValidacionOrden() {
        return txtValidacionOrden;
    }

    public By getBtnSeleccionarOrden() {
        return btnSeleccionarOrden;
    }

    public By getDropEmpleados() {
        return dropEmpleados;
    }

    public By getLiEmpleados() {
        return liEmpleados;
    }

    public By getBtnAplicarCambios() {
        return btnAplicarCambios;
    }

    public By getAlertaCambios() {
        return alertaCambios;
    }
}
