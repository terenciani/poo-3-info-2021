package br.edu.ifpr.exercicios.palestra.teste;

import java.util.Scanner;

import br.edu.ifpr.exercicios.palestra.modelo.Palestra;
import br.edu.ifpr.exercicios.palestra.modelo.Sala;

public class TestePalestra {
	public static void main(String[] args) {
		 // instancia��o com o construtor padr�o
		Sala objetoSala = new Sala();
		
		Scanner scan = new Scanner(System.in);
		
		
		
		// instancia��o com o construtor personalizado		
		Sala salaPersonalizada = new Sala();
		
		Palestra palestra = new Palestra();

		
		// instancia��o com o construtor personalizado		
		Sala salaPersonalizadaDois = new Sala("3INFO", "SALA04");
		
		System.out.println(objetoSala.capacidade);
	}
}
