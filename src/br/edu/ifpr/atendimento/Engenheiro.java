package br.edu.ifpr.atendimento;

public class Engenheiro extends Funcionario {
	private int jornadaDeTrabalho;

	public int getJornadaDeTrabalho() {
		return jornadaDeTrabalho;
	}

	public void setJornadaDeTrabalho(int jornadaDeTrabalho) {
		this.jornadaDeTrabalho = jornadaDeTrabalho;
	}

	@Override
	public double calcularSalario() {
		if (this.jornadaDeTrabalho <= 20)
			return SALARIO_MINIMO;
		else {
			return SALARIO_MINIMO * 2;
		}

	}

}
