package br.edu.ifpr.aula.encapsulamento;

public class TesteCarro {	
	public static void main(String[] args) {
		
		Carro carro = new Carro(); // instancia��o
		
		carro.modelo 		= "Camaro";
		carro.cor 			= "Amarelo";
		carro.portas 		= 2;
		carro.quilometragem = 200;
		carro.novo			= true;
		carro.velocidade 	= 0;
		// continua
		
		
		System.out.println("Veloc�metro: " + carro.velocidade);  // 0
		carro.acelerar();
		
		System.out.println("Veloc�metro: " + carro.velocidade); // 10
		carro.acelerar();
		
		System.out.println("Veloc�metro: " + carro.velocidade); // 20
		carro.acelerar();
		
		System.out.println("Veloc�metro: " + carro.velocidade); // 30
		carro.acelerar();
		
		System.out.println("Veloc�metro: " + carro.velocidade); // 40
		
	}
}
