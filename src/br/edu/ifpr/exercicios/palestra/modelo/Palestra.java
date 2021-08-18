package br.edu.ifpr.exercicios.palestra.modelo;

public class Palestra {
	 public 	String tema;
	 private 	String diaHora;
				boolean exigeFrequencia;

	public Palestra() {
	}

	public Palestra(String tema, String diaHora, boolean exigeFrequencia) {
		this.tema = tema;
		this.diaHora = diaHora;
		this.exigeFrequencia = exigeFrequencia;
	}
}
