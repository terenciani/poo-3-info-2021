package br.edu.ifpr.aula.excecoes;

public class TestadoraDeExcecoes {
	public static void main(String[] args) {
		
		try {
			System.out.println(Calculadora.divisao(5, 1));
		} catch (DivisaoPorZeroException excecao) {
			System.out.println(excecao.getMessage());
		} finally {
			System.out.println("Passou");
		}
		System.out.println("Continuou a execução...");

	}
}
