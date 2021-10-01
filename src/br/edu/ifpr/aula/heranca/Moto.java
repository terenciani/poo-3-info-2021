package br.edu.ifpr.aula.heranca;

public class Moto extends VeiculoTerrestre {
	private int cilindradas;

	public Moto() {
		// construtor padrão - pode ser omitido, pois é gerado implicitamente
	}

	public Moto(double preco, int anoFabricacao, double peso, String placa, int renavam, int cilindradas) {
		super(preco, anoFabricacao, peso, placa, renavam);
		this.cilindradas = cilindradas;
	}

	public int getCilindradas() {
		return cilindradas;
	}

	public void setCilindradas(int cilindradas) {
		this.cilindradas = cilindradas;
	}

}
