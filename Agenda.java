package com.everton.prova_02;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;
/**
 *  Class Agenda.
 *
 * @author Migoinho - Prova 02 - Henrique
 * 
 */
public class Agenda implements Serializable{

	private static final long serialVersionUID = 1L;
	private List<ItemAgenda> colecao_itens_agenda;

	Agenda(){
		colecao_itens_agenda = new LinkedList<ItemAgenda>();
	}

	public void insere_item(ItemAgenda _iten) {
		this.colecao_itens_agenda.add(_iten);
	}
	public void insere_item(String _titulo, String _desc, Periodo _periodo) {


	}
}
