package is.demo.serenity.utils;

import net.serenitybdd.core.annotations.findby.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class EsperaExplicita {

    public static void esperarExplicitaClick(WebDriver driver, By elemento){
        WebDriverWait myWaitvar = new WebDriverWait(driver, 30);
        myWaitvar.until(ExpectedConditions.elementToBeClickable(elemento));
    }
    public  void esperaExplicitaTexto(WebDriver driver, By elemento) {
        WebDriverWait myWaitvar = new WebDriverWait(driver, 30);
        myWaitvar.until(ExpectedConditions.visibilityOfElementLocated(elemento));
    }

    public static void esperaCargarPagina(WebDriver driver){
        driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
    }

}
