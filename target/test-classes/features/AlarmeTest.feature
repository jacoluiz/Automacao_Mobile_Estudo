#language: pt

Funcionalidade: Alarme
Como usuario do sistema de relogio
Usuario deseja gerenciar os alarme
Para que seja alertado nos horarios escolhido

Cenário: Adicionar novo alarme
	Dado que o usuario esteja na aba de alarmes
	Quando usuario clicar no botão +
	E selecionar o horario do alarme como 1 hora e 20 minutos
	E selecionar PM
	E clicar em OK
	Então um novo alarme deve ser criado
	
