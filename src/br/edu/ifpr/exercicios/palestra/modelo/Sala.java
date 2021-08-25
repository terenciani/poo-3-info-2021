package br.edu.ifpr.exercicios.palestra.modelo;

public class Sala {
	private int capacidade; // esta (this)
	private String nome;
	private String local;

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

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

}
