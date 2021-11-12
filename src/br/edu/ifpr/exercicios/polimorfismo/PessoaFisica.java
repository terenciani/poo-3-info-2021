package br.edu.ifpr.exercicios.polimorfismo;

public class PessoaFisica extends Pessoa {
	// - cpf: String

	private String rg;

	public final String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

}
