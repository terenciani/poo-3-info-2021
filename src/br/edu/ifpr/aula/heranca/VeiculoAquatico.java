package br.edu.ifpr.aula.heranca;

public class VeiculoAquatico extends Veiculo {
	private int numeroDeRegistro;

	public VeiculoAquatico() {
		// construtor padrão - pode ser omitido, pois é gerado implicitamente
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
