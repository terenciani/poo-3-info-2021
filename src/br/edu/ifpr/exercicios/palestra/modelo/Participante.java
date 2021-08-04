package br.edu.ifpr.exercicios.palestra.modelo;

public class Participante {
	public String nome;
	public String email;
	public String CPF;

	public Participante() {
		this.nome = "Nome padrão";
		this.email = "E-mail padrão";
		this.CPF = "CPF padrão";
	}
	
	public Participante(String nome, String email, String CPF) {
		this.nome = nome;
		this.email = email;
		this.CPF = CPF;
	}
}
