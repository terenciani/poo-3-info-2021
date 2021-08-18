package br.edu.ifpr.aula.construtores;

public class Carro {
	String modelo;
	String cor;
	int portas;
	int quilometragem;
	boolean novo;
	int velocidade;
	
	public Carro() {
		modelo = "Camaro";
		cor = "Amarelo";
	}
	public Carro(String parametroModelo, String parametroCor) {
		modelo = parametroModelo;
		cor = parametroCor;
	}

	public void acelerar() {
		
	}
}

