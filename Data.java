package com.everton.prova_02;
/**
 * Class Data
 * 
 * @author Migoinho - Prova 02 - Henrique
 * 
 */
public class Data {
	private int dia, mes, ano;
	private String mesTexto;
	// === GET's and SET's === //
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getMesTexto() {
		return mesTexto;
	}
	public void setMesTexto(String mesTexto) {
		this.mesTexto = mesTexto;
	}
	// === CONSTRUTOR === //
	public Data() {
		this.setData();
	}
	public Data(String _dataTxT) {
		this.setData(_dataTxT);
	}
	// === METHODO's STATIC's BOOLEAN's === //
	public static boolean isBissexto(int _ano) {
		if(_ano%4 == 0 && _ano%100 != 0) {
			return true;
		}
		return false;
	}//FIM IS BISSEXTO
	public static boolean isDataValida(int _dia, int _mes, int _ano) {
		try {
			if(_ano>1582 && _dia>=0 && _dia<=31 && _mes==1 ||  _mes==3 || _mes==5 || _mes==7 || _mes==8 || _mes==10 || _mes==12) {
				return true;
			}//FIM IF DIAS 31
			if(_ano>1582 && _dia>=0 && _dia<=30 && _mes==4 ||  _mes==6 || _mes==9 || _mes==11) {
				return true;
			}//FIM IF DIAS 30
			if(_ano>1582 && _mes==2) {
				if(_dia>=0 && _dia<=28) {
					return true;
				}
				else if(_dia==29 && Data.isBissexto(_ano)) {
					return true;
				}
			}//FIM FEVEREIRO
		}//FIM TRY
		catch (Exception e) {
			System.out.println(" === Erro - Data invalida === ");
			return false;
		}//FIM CATCH
		return false;
	}//FIM IS DATA VALIDA
	public static boolean isMesTxt(String _mes) {
		int i=0;
		//COMPARA SE O MES EH POR EXTENSO
		if(_mes.charAt(i) >= 'A' && _mes.charAt(i) <= 'Z' || _mes.charAt(i) >= 'a' && _mes.charAt(i) <= 'z') {
			return true;
		}
		return false;
	}
	// === METHODO's === //
	public void setData() {
		this.dia = 01;
		this.mes = 01;
		this.ano = 1900;
		this.setMesTexto();
	}//FIM SET DATA PADRAO
	public void setData(int _dia, int _mes, int _ano) {
		if(Data.isDataValida(_dia, _mes, _ano)) {
			this.dia = _dia;
			this.mes = _mes;
			this.ano = _ano;
			this.setMesTexto();
		}
		else {
			this.setData();
		}
	}//FIM SET DATA COMPLETO
	public void setData(int _mes, int _ano) {
		if(Data.isDataValida(1, _mes, _ano)) {
			this.dia = 1;
			this.mes = _mes;
			this.ano = _ano;
			this.setMesTexto();
		}
		else {
			this.setData();
		}
	}//FIM SET DATA 2 CAMPOS
	public void setData(String _dataTxT) {
		String converteData[] = _dataTxT.split(",| |-|/");
		int tamVetor = converteData.length; //TAMANHO DA DATA
		try {
			if(tamVetor == 3) {
				if(Data.isMesTxt(converteData[1])) {
					this.dia = Integer.parseInt(converteData[0]);
					this.mes = this.converteMes(converteData[1]);
					this.ano = Integer.parseInt(converteData[2]);
					this.setMesTexto();
				}
				else {
					this.dia = Integer.parseInt(converteData[0]);
					this.mes = Integer.parseInt(converteData[1]);
					this.ano = Integer.parseInt(converteData[2]);
					this.setMesTexto();		
				}
			}//FIM IF VETOR 3 POSICOES
			else if(tamVetor == 2) {
				if(Data.isMesTxt(converteData[0])) {
					this.mes = this.converteMes(converteData[0]);
					this.ano = Integer.parseInt(converteData[1]);
					this.setMesTexto();		
				}
				else {
					this.mes = Integer.parseInt(converteData[0]);
					this.ano = Integer.parseInt(converteData[1]);
					this.setMesTexto();	
				}
			}//FIM IF VETOR 2 POSICOES
		}//FIM TRY
		catch (Exception e){
			System.out.println(" === ERRO - Data por extenso invalida ===");
		}
	}//FIM SET DATA POR EXTENSO
	public void setMesTexto() {
		switch(this.getMes()) {
		case 1:
			this.setMesTexto("Janeiro");
			break;
		case 2:
			this.setMesTexto("Fevereiro");
			break;
		case 3:
			this.setMesTexto("Marco");
			break;
		case 4:
			this.setMesTexto("Abril");
			break;
		case 5:
			this.setMesTexto("Maio");
			break;
		case 6:
			this.setMesTexto("Junho");
			break;
		case 7:
			this.setMesTexto("Julho");
			break;
		case 8:
			this.setMesTexto("Agosto");
			break;
		case 9:
			this.setMesTexto("Setembro");
			break;
		case 10:
			this.setMesTexto("Outubro");
			break;
		case 11:
			this.setMesTexto("Novembro");
			break;
		case 12:
			this.setMesTexto("Dezembro");
			break;
		}//FIM SWITCH
	}//FIM SET MES TEXTO
	public int converteMes(String _mes) {
		switch(_mes) {
		// === MAIUSCULO === //
		case "Janeiro":
			return 1;
		case "Fevereiro":
			return 2;
		case "Marco":
			return 3;
		case "Abril":
			return 4;
		case "Maio":
			return 5;
		case "Junho":
			return 6;
		case "Julho":
			return 7;
		case "Agosto":
			return 8;
		case "Setembro":
			return 9;
		case "Outubro":
			return 10;
		case "Novembro":
			return 11;
		case "Dezembro":
			return 12;
			// === MINUSCULO === //
		case "janeiro":
			return 1;
		case "fevereiro":
			return 2;
		case "marco":
			return 3;
		case "abril":
			return 4;
		case "maio":
			return 5;
		case "junho":
			return 6;
		case "julho":
			return 7;
		case "agosto":
			return 8;
		case "setembro":
			return 9;
		case "outubro":
			return 10;
		case "novembro":
			return 11;
		case "dezembro":
			return 12;
		default: break;
		}//FIM SWITCH
		return 0;
	}//FIM CONVERTE MES
	public String toString() {
		StringBuilder dataEscrita = new StringBuilder();
		//ESCRITA NUMERICA
		dataEscrita.append(String.format("%02d", this.getDia()));
		dataEscrita.append("/");
		dataEscrita.append(String.format("%02d", this.getMes()));
		dataEscrita.append("/");
		dataEscrita.append(this.getAno());
		//ESCRITA POR EXTENSO
		dataEscrita.append("\n");
		dataEscrita.append(String.format("%02d",this.getDia()));
		dataEscrita.append(" de ");
		dataEscrita.append(this.getMesTexto());
		dataEscrita.append(" de ");
		dataEscrita.append(this.getAno());
		return dataEscrita.toString();
	}//FIM TO STRING

}//FIM CLASS DATA
