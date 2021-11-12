package br.edu.ifpr.aula.assincrona.interfaces;

public class Secretario extends Funcionario implements FuncoesBasicas, FuncoesNormais{
	@Override
	public double calculaSalario() {
		double salarioBase = super.calculaSalario();
		return salarioBase * 3;
	}

	@Override
	public String toString() {
		return "Os dados dos Secret�rio s�o: ";
	}

	@Override
	public void culparEstagiario() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cobrarCliente() {
		System.out.println("Sou secret�rio na empresa XYZ e estou ligando para cobrar sua mensalidade");
	}

}
