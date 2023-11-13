package screen;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import helper.AppiumDriverHelper;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import suport.Constantes;

public class ScreenBase {

	public void validarPresencaDeElemento(String xpath) {
		new WebDriverWait(AppiumDriverHelper.getDriver(), Constantes.TIMEOUT)
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
	}

	public void mostrarTeclado() {
		AppiumDriverHelper.getDriver().hideKeyboard();
	}

	public void swipeVertical() {
		Dimension size = AppiumDriverHelper.getDriver().manage().window().getSize();
		int starty = (int) (size.height * 0.5);
		int endy = (int) (size.height * 0.2);
		int startx = (int) (size.width / 2);
		int endx = (int) (size.width / 2);

		new TouchAction(AppiumDriverHelper.getDriver()).press(PointOption.point(startx, starty))
				.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2))).moveTo(PointOption.point(endx, endy))
				.release().perform();

	}

	public void swipeHorizontal() {
		Dimension size = AppiumDriverHelper.getDriver().manage().window().getSize();
		int starty = (int) (size.height / 2);
		int endy = (int) (size.height / 2);
		int startx = (int) (size.width * 0.5);
		int endx = (int) (size.width * 0.2);

		new TouchAction(AppiumDriverHelper.getDriver()).press(PointOption.point(startx, starty))
				.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2))).moveTo(PointOption.point(endx, endy))
				.release().perform();
	}

}
