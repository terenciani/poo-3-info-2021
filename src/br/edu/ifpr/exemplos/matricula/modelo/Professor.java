package br.edu.ifpr.exemplos.matricula.modelo;

public class Professor {
	private String nome;

	public Professor() {
		this.nome = "Professor padr�o";
	}

	public Professor(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
