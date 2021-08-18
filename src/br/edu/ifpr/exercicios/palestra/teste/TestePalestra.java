package br.edu.ifpr.exercicios.palestra.teste;

import java.util.Scanner;

import br.edu.ifpr.exercicios.palestra.modelo.Palestra;
import br.edu.ifpr.exercicios.palestra.modelo.Sala;

public class TestePalestra {
	public static void main(String[] args) {
		 // instanciação com o construtor padrão
		Sala objetoSala = new Sala();
		
		Scanner scan = new Scanner(System.in);
		
		
		
		// instanciação com o construtor personalizado		
		Sala salaPersonalizada = new Sala();
		
		Palestra palestra = new Palestra();

		
		// instanciação com o construtor personalizado		
		Sala salaPersonalizadaDois = new Sala("3INFO", "SALA04");
		
		System.out.println(objetoSala.capacidade);
	}
}
