package com.everton.prova_02;

public class Evento extends ItemAgenda {
	private String local_evento;
	
	public String getLocal_evento() {
		return local_evento;
	}

	public void setLocal_evento(String local_evento) {
		this.local_evento = local_evento;
	}

	public Evento(String _local, String _titulo, String _desc, Periodo _periodo) {
		this.setLocal(_local);
		this.reg_Titulo(_titulo);
		this.reg_Descricao(_desc);
		this.reg_Periodo(_periodo);
	}
	public void setLocal(String _local) {
		this.local_evento = _local;
	}
	
	/**
	 * Reg titulo.
	 */
	@Override
	public void reg_Titulo(String _titulo) {
		super.titulo_Item = _titulo;
	}

	/**
	 * Reg descricao.
	 */
	@Override
	public void reg_Descricao(String _desc) {
		super.descricao_Item = _desc;
	}

	/**
	 * Reg periodo.
	 */
	@Override
	public void reg_Periodo(Periodo _periodo) {
		super.periodo_Item = _periodo;
	}

}
