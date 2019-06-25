package com.everton.prova_02;
/**
 *  Class Lembrete.
 *
 * @author Migoinho - Prova 02 - Henrique
 * 
 */
public class Lembrete extends ItemAgenda{
	private int minutos_alerta;
	private Horario hora_calcular;

	public int getMinutos_alerta() {
		return minutos_alerta;
	}

	public void setMinutos_alerta(int minutos_alerta) {
		this.minutos_alerta = minutos_alerta;
	}

	public Lembrete(int _minutos) {
		this.setMinutos_alerta(_minutos);
	}
	public Lembrete(Horario _horas) {
		this.hora_calcular = _horas;
		this.setMinutos_alerta(this.calcula_minutos());
	}
	public int calcula_minutos() {
		return this.hora_calcular.getMinutos()+(this.hora_calcular.getHoras()/60);
	}
	@Override
	public void reg_Titulo(String _titulo) {
		super.titulo_Item = _titulo;
	}
	@Override
	public void reg_Descricao(String _desc) {
		super.descricao_Item = _desc;
	}
	@Override
	public void reg_Periodo(Periodo _periodo) {
		super.periodo_Item = _periodo;
	}



}
