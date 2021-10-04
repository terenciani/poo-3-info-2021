package br.edu.ifpr.aula.heranca;

import java.util.Scanner;

public class TestaCPF {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		long cpf = 0;
		
		System.out.println("Digite o CPF");
		cpf = teclado.nextLong();
		
		System.out.println("CPF digitado: " + cpf);
		
	}
}
