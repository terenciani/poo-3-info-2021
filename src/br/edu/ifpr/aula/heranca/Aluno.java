package br.edu.ifpr.aula.heranca;

public class Aluno extends Pessoa {
	private int ra; // diferente

	public Aluno(String nome, String dataNascimento, String email, String cpf, int ra) {
		super(nome, dataNascimento, email, cpf);
		this.ra = ra;
	}

	public int getRa() {
		return ra;
	}

	public void setRa(int ra) {
		this.ra = ra;
	}
}
