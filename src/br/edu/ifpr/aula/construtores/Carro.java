package br.edu.ifpr.aula.construtores;

public class Carro {
	String modelo;
	String cor;
	int portas;
	int quilometragem;
	boolean novo;
	int velocidade;
	
	
	// Carro()
	public Carro() {
		modelo = "Camaro";
		cor = "Amarelo";
	}
	
	// Carro(String, String)
	public Carro(String parametroModelo, String parametroCor) {
		modelo = parametroModelo;
		cor = parametroCor;
	}

	public void acelerar() {
		
	}
}

