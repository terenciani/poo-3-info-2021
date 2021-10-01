package br.edu.ifpr.atendimento;

public class Diretor extends Funcionario{
	private int qtdDeSalariosMinimos;
	
	/*
	 * public double getSalario() {
		return calcularSalario(this.qtdDeSalariosMinimos);
	}
	*/

	
	@Override
	public double calcularSalario() {
		return (this.qtdDeSalariosMinimos * SALARIO_MINIMO) + (this.qtdDeSalariosMinimos * SALARIO_MINIMO * 0.1);
	}

	public int getQtdDeSalariosMinimos() {
		return qtdDeSalariosMinimos;
	}

	public void setQtdDeSalariosMinimos(int qtdDeSalariosMinimos) {
		this.qtdDeSalariosMinimos = qtdDeSalariosMinimos;
	}
}
