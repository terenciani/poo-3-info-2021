package br.edu.ifpr.exemplos.matricula.modelo;

public class Disciplina {
	private String nome;  // <----- este = this
	private int cargaHoraria;
	
	public Disciplina() {
		this.nome = "Nome padrão";
		this.cargaHoraria = 80;
	}

	public Disciplina(String nome, int cargaHoraria) {
		this.nome = nome;
		this.cargaHoraria = cargaHoraria;
	}
	
	public String acessarNome() {
		return  this.nome;
	}
}
