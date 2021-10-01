package br.edu.ifpr.aula.heranca.teste;

import br.edu.ifpr.aula.heranca.Moto;

public class TesteHeranca {
	public static void main(String[] args) {

		Moto ninja = new Moto(20000, 2021, 170, "IFP4R21", 123212323, 150);

		System.out.println(ninja.getPreco());
		System.out.println(ninja.getAnoFabricacao());
		System.out.println(ninja.getPeso());

		System.out.println(ninja.getPlaca());
		System.out.println(ninja.getRenavam());

		System.out.println(ninja.getCilindradas());
	}
}
