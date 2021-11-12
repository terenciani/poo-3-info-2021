package br.edu.ifpr.aula.assincrona.interfaces;

public class Estagiario extends Funcionario implements FuncoesBasicas{
	public double calculaSalario() {
		return 0.5 * 1100;
	}

	@Override
	public void cobrarCliente() {
		System.out.println("Sou estagiário na empresa XYZ e vim cobrar sua mensalidade");
	}
}
