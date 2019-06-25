package com.everton.prova_02;

/**
 *  Class ItemAgenda.
 *
 * @author Migoinho - Prova 02 - Henrique
 * 
 */
public abstract class ItemAgenda {

	public String titulo_Item;

	public String descricao_Item;

	public Periodo periodo_Item;

	public abstract void reg_Titulo(String _titulo);

	public abstract void reg_Descricao(String _desc);

	public abstract void reg_Periodo(Periodo _periodo);

}
