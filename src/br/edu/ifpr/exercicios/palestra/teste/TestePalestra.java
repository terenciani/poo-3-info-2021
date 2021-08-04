package br.edu.ifpr.exercicios.palestra.teste;

import br.edu.ifpr.exercicios.palestra.modelo.Sala;

public class TestePalestra {
	public static void main(String[] args) {
		 // instanciação com o construtor padrão
		Sala objetoSala = new Sala();
		
		// instanciação com o construtor personalizado		
		Sala salaPersonalizada = new Sala();
		
		
		// instanciação com o construtor personalizado		
		Sala salaPersonalizadaDois = new Sala("3INFO", "SALA04");
		
		System.out.println(objetoSala.capacidade);
	}
}
