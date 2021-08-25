package br.edu.ifpr.exemplos.matricula.modelo;

public class Curso {
	private String nome;
	
	public Curso() {
		this.nome = "Informática";
	}
	
	public Curso(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
