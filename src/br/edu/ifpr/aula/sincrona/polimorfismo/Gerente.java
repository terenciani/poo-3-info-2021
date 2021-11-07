package br.edu.ifpr.aula.sincrona.polimorfismo;

public class Gerente extends Funcionario{
	public double calculaSalario() {
		return 10 * 1100;
	}
	
	public double getComissao() {
		return 50;
	}
	
}
