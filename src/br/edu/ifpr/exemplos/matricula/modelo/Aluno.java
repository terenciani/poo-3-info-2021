package br.edu.ifpr.exemplos.matricula.modelo;

public class Aluno {
	private String nome;
	
	public Aluno() {
		this.nome = "Nome padr�o";
	}
	
	public Aluno (String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
