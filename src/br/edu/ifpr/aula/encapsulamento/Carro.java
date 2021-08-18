package br.edu.ifpr.aula.encapsulamento;

public class Carro {
	String modelo;
	String cor;
	int portas;
	int quilometragem;
	boolean novo;
	int velocidade;

	// continua

	public Carro() {
		this.modelo = "Camaro";
		this.cor = "Amarelo";
	}

	public Carro(String modelo, String cor) {
		this.modelo = modelo;
		this.cor = cor;
	}

	public void acelerar() {
		this.velocidade = this.velocidade + 10;
	}
}
