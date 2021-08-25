package br.edu.ifpr.exercicios.palestra.modelo;

public class Participante {
	private String nome;
	private String email;
	private String CPF;

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

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

}
