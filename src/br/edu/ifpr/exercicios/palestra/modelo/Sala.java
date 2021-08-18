package br.edu.ifpr.exercicios.palestra.modelo;

public class Sala {
	public int capacidade; // esta (this)
	public String nome;
	public String local;

	public Sala() { // Construtor padrão
		this.capacidade = 40;
	}

	public Sala(int capacidade, String nome, String local) {
		this.capacidade = capacidade;
		this.nome = nome;
		this.local = local;
	}

	public Sala(String nome, String local) {
		this.capacidade = 40;
		this.nome = nome;
		this.local = local;
	}

}
