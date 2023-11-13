package screen;

import org.openqa.selenium.WebElement;

import io.appium.java_client.pagefactory.AndroidFindBy;

public class AlarmeScreen extends ScreenBase {

	public void validarPaginaCarregada() {
		validarPresencaDeElemento(
				"//android.widget.TextView[@resource-id='com.google.android.deskclock:id/action_bar_title']");
	}

	@AndroidFindBy(xpath = "//android.widget.Button[@content-desc='Add alarm']")
	private WebElement btnNovoAlarme;

	@AndroidFindBy(accessibility =  "1 o'clock")
	private WebElement btnHoraUm;

	@AndroidFindBy(accessibility = "20 minutes")
	private WebElement btnMinutoVinte;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.google.android.deskclock:id/action_bar_title']")
	private WebElement txtTituloDaPagina;

	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.google.android.deskclock:id/material_timepicker_ok_button']")
	private WebElement btnOk;

	@AndroidFindBy(xpath = "//android.widget.CompoundButton[@resource-id='com.google.android.deskclock:id/material_clock_period_pm_button']")
	private WebElement btnPM;

	@AndroidFindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Alarm\"]")
	private WebElement btnAlarme;

	public WebElement getBtnNovoAlarme() {
		return btnNovoAlarme;
	}

	public WebElement getBtnHoraUm() {
		return btnHoraUm;
	}

	public WebElement getBtnMinutoVinte() {
		return btnMinutoVinte;
	}

	public WebElement getTxtTituloDaPagina() {
		return txtTituloDaPagina;
	}

	public WebElement getBtnOk() {
		return btnOk;
	}

	public WebElement getBtnPM() {
		return btnPM;
	}

	public WebElement getBtnAlarme() {
		return btnAlarme;
	}

}
