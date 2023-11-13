package actions;

import screen.AlarmeScreen;
import screen.MasterScreenFactory;

public class AlarmeActions extends ActionsBase{

	public static AlarmeScreen alarmeScreen() {
		return MasterScreenFactory.getPage(AlarmeScreen.class);
	}

	public static void clicarAbaAlarme() {
		alarmeScreen().getBtnAlarme().click();
	}

	public static void validarPagina() {
		alarmeScreen().validarPaginaCarregada();
	}

	public static void clicarBotaoNovoAlarme() {
		alarmeScreen().getBtnNovoAlarme().click();
	}

	public static void selecionarHorarioPadrao() {
		alarmeScreen().getBtnHoraUm().click();
		alarmeScreen().getBtnMinutoVinte().click();
	}

	public static void clicarBotaoOk() {
		alarmeScreen().getBtnOk().click();
	}

	public static void selecionarPM() {
		if (!alarmeScreen().getBtnPM().isSelected()) {
			alarmeScreen().getBtnPM().clear();
		}
	}
}
