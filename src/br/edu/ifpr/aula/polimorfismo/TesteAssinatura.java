package br.edu.ifpr.aula.polimorfismo;

import java.util.Scanner;

public class TesteAssinatura {
	public static void main(String[] args) {
		Assinatura ass = new Assinatura();
		
		int x = 10;
		
		double y = 4.5;
		
		float z = 6;
		
		
		ass.soma(y, y);
		ass.soma(x, x);
		
	}
}
