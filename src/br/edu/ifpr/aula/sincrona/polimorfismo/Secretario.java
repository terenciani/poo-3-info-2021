package br.edu.ifpr.aula.sincrona.polimorfismo;

public class Secretario extends Funcionario{
	@Override
	public double calculaSalario() {
		double salarioBase = super.calculaSalario();
		return salarioBase * 3;
	}

	@Override
	public String toString() {
		return "Os dados dos Secretário são: ";
	}
	
	
	
}
