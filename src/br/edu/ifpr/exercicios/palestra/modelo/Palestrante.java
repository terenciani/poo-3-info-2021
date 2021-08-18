package br.edu.ifpr.exercicios.palestra.modelo;

public class Palestrante {
	public String nome;
	public String CPF;
	public String endereco;
	public String RG;
	public String dataNascimento;
	public String cidadeNascimento;
	public String estadoNascimento;

	public Palestrante() {
		
	}

	public Palestrante(String nome, String cPF, String endereco, String rG, String dataNascimento,
			String cidadeNascimento, String estadoNascimento) {
		this.nome = nome;
		CPF = cPF;
		this.endereco = endereco;
		RG = rG;
		this.dataNascimento = dataNascimento;
		this.cidadeNascimento = cidadeNascimento;
		this.estadoNascimento = estadoNascimento;
	}

}
