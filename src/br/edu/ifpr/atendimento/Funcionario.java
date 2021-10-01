package br.edu.ifpr.atendimento;

public abstract class Funcionario {
	public final double SALARIO_MINIMO = 1100;
	// protected
	
	
	public double calcularSalario() {
		return SALARIO_MINIMO;
	}
	
	// public abstract double calcularSalario();
}
