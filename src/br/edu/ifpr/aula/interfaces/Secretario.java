package br.edu.ifpr.aula.interfaces;

public class Secretario extends Funcionario implements FuncoesBasicas, FuncoesNormais {
	@Override
	public double calculaSalario() {
		double salarioBase = super.calculaSalario();
		return salarioBase * 3;
	}

	@Override
	public void culparEstagiario() {
		// TODO Auto-generated method stub
	}

	@Override
	public void cobrarCliente() {
		System.out.println("Sou secretário na empresa XYZ estou ligando para cobrar sua mensalidade");
	}
}
