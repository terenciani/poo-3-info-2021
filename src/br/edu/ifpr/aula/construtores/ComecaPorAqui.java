package br.edu.ifpr.aula.construtores;
import java.util.Scanner;

public class ComecaPorAqui {	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		Carro objetoUm = new Carro(); // instancia��o
		
		objetoUm.modelo = "Camaro";
		objetoUm.cor 	= "Amarelo";
		objetoUm.portas 	= 2;
		objetoUm.quilometragem = 200;
		objetoUm.novo	= true;
		
		System.out.println("Veloc�metro: " + objetoUm.velocidade);  // 0
		objetoUm.acelerar();
		
		System.out.println("Veloc�metro: " + objetoUm.velocidade); // 10
		objetoUm.acelerar();
		
		System.out.println("Veloc�metro: " + objetoUm.velocidade); // 20
		objetoUm.acelerar();
		
		System.out.println("Veloc�metro: " + objetoUm.velocidade); // 30
		objetoUm.acelerar();
		
		System.out.println("Veloc�metro: " + objetoUm.velocidade); // 40
		
	}
}
