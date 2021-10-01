package br.edu.ifpr.aula.heranca;

public class VeiculoAquatico extends Veiculo {
	private int numeroDeRegistro;

	public VeiculoAquatico() {
		// construtor padr�o - pode ser omitido, pois � gerado implicitamente
	}

	public VeiculoAquatico(int numeroDeRegistro) {
		super();
		this.numeroDeRegistro = numeroDeRegistro;
	}

	public int getNumeroDeRegistro() {
		return numeroDeRegistro;
	}

	public void setNumeroDeRegistro(int numeroDeRegistro) {
		this.numeroDeRegistro = numeroDeRegistro;
	}

}
