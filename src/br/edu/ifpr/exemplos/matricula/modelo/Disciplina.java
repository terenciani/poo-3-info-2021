package br.edu.ifpr.exemplos.matricula.modelo;

public class Disciplina {
	private String nome; // <----- este = this
	private int cargaHoraria;

	public Disciplina() {
		this.nome = "Nome padrão";
		this.cargaHoraria = 80;
	}

	public Disciplina(String nome, int cargaHoraria) {
		this.nome = nome;
		this.cargaHoraria = cargaHoraria;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

}
