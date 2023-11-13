package actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import helper.AppiumDriverHelper;
import suport.Constantes;

public class ActionsBase {

	public static WebDriverWait wait = new WebDriverWait(AppiumDriverHelper.getDriver(), Constantes.TIMEOUT);

	public static void esperarElementoEstarVisivel(WebElement elemento) {
		wait.until(ExpectedConditions.visibilityOf(elemento));
	}
}
