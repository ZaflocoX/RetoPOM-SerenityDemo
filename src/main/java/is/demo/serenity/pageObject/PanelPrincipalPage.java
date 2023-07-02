package is.demo.serenity.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class PanelPrincipalPage extends PageObject {

    By spLogo = By.xpath("//span[@class='s-sidebar-band-title']");
    By btnMoreinfoOrder = By.xpath("//a[@href='/Northwind/Order?shippingState=0']");
    public By getSpLogo() {
        return spLogo;
    }

    public By getBtnMoreinfoOrder() {
        return btnMoreinfoOrder;
    }
}
