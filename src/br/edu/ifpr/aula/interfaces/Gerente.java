package br.edu.ifpr.aula.interfaces;

public class Gerente extends Funcionario implements FuncoesNormais{
	public double calculaSalario() {
		return 10 * 1100;
	}
	
	public double getComissao() {
		return 50;
	}

	@Override
	public void culparEstagiario() {
		System.out.println("Nosso funcion�rio ainda est� aprendendo, isso n�o ir� se repetir.");
	}
}
