package br.edu.ifpr.exercicios.palestra.modelo;

public class Palestra {
	private String tema;
	private String diaHora;
	private boolean exigeFrequencia;

	public Palestra() {
	}

	public Palestra(String tema, String diaHora, boolean exigeFrequencia) {
		this.tema = tema;
		this.diaHora = diaHora;
		this.exigeFrequencia = exigeFrequencia;
	}

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}

	public String getDiaHora() {
		return diaHora;
	}

	public void setDiaHora(String diaHora) {
		this.diaHora = diaHora;
	}

	public boolean isExigeFrequencia() {
		return exigeFrequencia;
	}

	public void setExigeFrequencia(boolean exigeFrequencia) {
		this.exigeFrequencia = exigeFrequencia;
	}

}
