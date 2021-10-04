package br.edu.ifpr.aula.heranca;

public class Professor extends Pessoa {
	private String siape; // diferente

	public Professor(String nome, String dataNascimento, String email, String cpf, String siape) {
		super(nome, dataNascimento, email, cpf);
		this.siape = siape;
	}
	
	public String getSiape() {
		return siape;
	}

	public void setSiape(String siape) {
		this.siape = siape;
	}
}
