package com.everton.prova_02;

/**
 *  Class Periodo.
 *
 * @author Migoinho - Prova 02 - Henrique
 * 
 */
public class Periodo {

	private Data data_inicio, data_fim;

	private Horario hora_inicio, hora_fim;

	// === GET's and SET's === //
	public Data getData_inicio() {
		return data_inicio;
	}

	public Data getData_fim() {
		return data_fim;
	}

	public Horario getHora_inicio() {
		return hora_inicio;
	}


	public Horario getHora_fim() {
		return hora_fim;
	}


	public void setData_inicio(Data data_inicio) {
		this.data_inicio = data_inicio;
	}


	public void setData_fim(Data data_fim) {
		this.data_fim = data_fim;
	}

	public void setHora_inicio(Horario hora_inicio) {
		this.hora_inicio = hora_inicio;
	}

	public void setHora_fim(Horario hora_fim) {
		this.hora_fim = hora_fim;
	}

	// === CONSTRUTOR === //
	public Periodo(Data data_inicio, Data data_fim, Horario hora_inicio, Horario hora_fim) {
		super();
		this.data_inicio = data_inicio;
		this.data_fim = data_fim;
		this.hora_inicio = hora_inicio;
		this.hora_fim = hora_fim;
	}
	// === METHODO's STATIC's BOOLEAN's === //

	// === METHODO's === //
	public void setPeriodo(Data _ini, Data _fim, Horario _ini_hr, Horario _fim_hr) throws Exception {
		this.data_inicio = _ini;
		this.data_fim = _fim;
		this.hora_inicio = _ini_hr;
		this.hora_fim = _fim_hr;
		throw new Exception("=== ERRO - Periodo invalido ===");
	}


	public void setPeriodo(int _dia_ini, int _mes_ini, int _ano_ini, int _dia_fim, int _mes_fim, int _ano_fim, int hr_ini, int min_ini, int seg_ini,  int hr_fim, int min_fim, int seg_fim) throws Exception {
		this.data_inicio.setData(_dia_ini, _mes_ini, _ano_ini);
		this.data_fim.setData(_dia_fim, _mes_fim, _ano_fim);
		this.hora_inicio.setHorario(hr_ini, min_ini, seg_ini);
		this.hora_fim.setHorario(hr_fim, min_fim, seg_fim);
		throw new Exception("=== ERRO - Periodo invalido ===");
	}

	public void setPeriodo(int _dia_ini, int _mes_ini, int _ano_ini, int _dia_fim, int _mes_fim, int _ano_fim, int hr_ini, int min_ini,  int hr_fim, int min_fim) throws Exception {
		this.data_inicio.setData(_dia_ini, _mes_ini, _ano_ini);
		this.data_fim.setData(_dia_fim, _mes_fim, _ano_fim);
		this.hora_inicio.setHorario(hr_ini, min_ini);
		this.hora_fim.setHorario(hr_fim, min_fim);
		throw new Exception("=== ERRO - Periodo invalido ===");
	}

	public void setPeriodo(String _data_ini, String _data_fim, String _hr_ini, String _hr_fim) throws Exception {
		this.data_inicio.setData(_data_ini);
		this.data_fim.setData(_data_fim);
		this.hora_inicio.setHorario(_hr_ini);
		this.hora_fim.setHorario(_hr_fim);
		throw new Exception("=== ERRO - Periodo invalido ===");
	}

}
