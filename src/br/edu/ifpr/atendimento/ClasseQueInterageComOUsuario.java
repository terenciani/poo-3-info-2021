package br.edu.ifpr.atendimento;

public class ClasseQueInterageComOUsuario {
	public static void main(String[] args) {
		System.out.println();
		
		Diretor diretor = new Diretor();
		Engenheiro engenheiro = new Engenheiro();
		Estagiario estagiario = new Estagiario();
		
		diretor.setQtdDeSalariosMinimos(1);
		engenheiro.setJornadaDeTrabalho(20);
		
		System.out.println(diretor.calcularSalario());
		System.out.println(engenheiro.calcularSalario());
		System.out.println(estagiario.calcularSalario());
		
	}
}
