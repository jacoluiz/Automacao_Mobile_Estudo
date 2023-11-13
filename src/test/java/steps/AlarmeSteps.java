package steps;

import actions.AlarmeActions;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class AlarmeSteps {

	@Dado("que o usuario esteja na aba de alarmes")
	public void que_o_usuario_esteja_na_aba_de_alarmes() {
		AlarmeActions.clicarAbaAlarme();
		AlarmeActions.validarPagina();
	}

	@Quando("usuario clicar no botão +")
	public void usuario_clicar_no_botão() {
		AlarmeActions.clicarBotaoNovoAlarme();
	}

	@Quando("selecionar o horario do alarme como 1 hora e 20 minutos")
	public void selecionar_o_horario_do_alarme_como_hora_e_minutos() {
		AlarmeActions.selecionarHorarioPadrao();
	}

	@Quando("selecionar PM")
	public void selecionar_pm() {
		AlarmeActions.selecionarPM();
	}

	@Quando("clicar em OK")
	public void clicar_em_ok() {
		AlarmeActions.clicarBotaoOk();
	}

	@Então("um novo alarme deve ser criado")
	public void um_novo_alarme_deve_ser_criado() {

	}

}
