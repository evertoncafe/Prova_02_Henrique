package com.everton.prova_02;
/**
 *  Class Horario.
 *
 * @author Migoinho - Prova 02 - Henrique
 * 
 */
public class Horario {


	private int horas, minutos, segundos;
	// === GET's and SET's === //
	public int getHoras() {
		return horas;
	}

	public int getMinutos() {
		return minutos;
	}
	public int getSegundos() {
		return segundos;
	}
	public void setHoras(int horas) {
		this.horas = horas;
	}
	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}
	public void setSegundos(int segundos) {
		this.segundos = segundos;
	}
	// === CONSTRUTOR === //
	public Horario() {
		this.setHorario();
	}
	public Horario(int horas, int minutos, int segundos) {
		this.horas = horas;
		this.minutos = minutos;
		this.segundos = segundos;
	}
	public Horario(String _horarioTxt) {
		this.setHorario(_horarioTxt);
	}
	// === METHODO's STATIC's BOOLEAN's === //

	// === METHODO's === //
	public void setHorario() {
		this.horas = 00;
		this.minutos = 00;
		this.segundos = 00;
	}
	public void setHorario(String _horarioTxt) {
		String horario_texto[] = _horarioTxt.split(" |:|-");
		int tamVetor = horario_texto.length;
		try {
			if(tamVetor == 3) {
				this.horas = Integer.parseInt(horario_texto[0]);
				this.minutos = Integer.parseInt(horario_texto[1]);
				this.segundos = Integer.parseInt(horario_texto[2]);
			}
			else if(tamVetor == 2) {
				this.horas = Integer.parseInt(horario_texto[0]);
				this.minutos = Integer.parseInt(horario_texto[1]);
			}
		}//FIM TRY
		catch (Exception e) {
			System.out.println(" === ERRO - Horario nao reconhecido ===");
		}
	}
	public void setHorario(int hr, int min, int seg) {
		this.horas = hr;
		this.minutos = min;
		this.segundos = seg;
	}
	public void setHorario(int hr, int min) {
		this.horas = hr;
		this.minutos = min;
		this.segundos = 00;
	}

	public String toString() {
		StringBuilder horatxt = new StringBuilder();
		horatxt.append(String.format("%02d", this.getHoras()));
		horatxt.append(":");
		horatxt.append(String.format("%02d", this.getMinutos()));
		horatxt.append(":");
		horatxt.append(String.format("%02d", this.getSegundos()));
		return horatxt.toString();
	}
}//FIM CLASS HORARIO
