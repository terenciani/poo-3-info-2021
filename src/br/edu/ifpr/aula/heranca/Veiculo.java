package br.edu.ifpr.aula.heranca;

public class Veiculo {
	private double preco;
	private int anoFabricacao;
	private double peso;

	
	public Veiculo() {
		// construtor padrão - pode ser omitido, pois é gerado implicitamente
	}

	public Veiculo(double preco, int anoFabricacao, double peso) {
		this.preco = preco;
		this.anoFabricacao = anoFabricacao;
		this.peso = peso;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getAnoFabricacao() {
		return anoFabricacao;
	}

	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

}
