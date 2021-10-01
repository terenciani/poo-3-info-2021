package br.edu.ifpr.aula.heranca;

public class VeiculoTerrestre extends Veiculo {
	private String placa;
	private int renavam;

	public VeiculoTerrestre() {
		// construtor padrão - pode ser omitido, pois é gerado implicitamente
	}

	public VeiculoTerrestre(double preco, int anoFabricacao, double peso, String placa, int renavam) {
		super(preco, anoFabricacao, peso);
		this.placa = placa;
		this.renavam = renavam;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getRenavam() {
		return renavam;
	}

	public void setRenavam(int renavam) {
		this.renavam = renavam;
	}

}
