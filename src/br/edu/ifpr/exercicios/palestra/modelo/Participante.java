package br.edu.ifpr.exercicios.palestra.modelo;

public class Participante {
	public String nome;
	public String email;
	public String CPF;

	public Participante() {
		this.nome = "Nome padr�o";
		this.email = "E-mail padr�o";
		this.CPF = "CPF padr�o";
	}
	
	public Participante(String nome, String email, String CPF) {
		this.nome = nome;
		this.email = email;
		this.CPF = CPF;
	}
}
