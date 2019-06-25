package com.everton.prova_02;

/**
 *  Class Meta.
 *
 * @author Migoinho - Prova 02 - Henrique
 * 
 */
public class Meta extends ItemAgenda {


	private String prioridade_da_meta;

	public String getMeta() {
		return prioridade_da_meta;
	}
	public Meta(String _meta, String _titulo, String _desc, Periodo _periodo) {
		this.setMeta(_meta);
		this.reg_Titulo(_titulo);
		this.reg_Descricao(_desc);
		this.reg_Periodo(_periodo);
	}

	public void setMeta(String meta) {
		this.prioridade_da_meta = meta;
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
