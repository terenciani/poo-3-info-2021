package br.edu.ifpr.conexao;

public class Aluno {
	private int idAluno;
	private String nome;
	
	public Aluno() {}
	
	public Aluno(int idAluno, String nome) {
		this.idAluno = idAluno;
		this.nome = nome;
	}
	
	public int getIdAluno() {
		return idAluno;
	}
	public void setIdAluno(int idAluno) {
		this.idAluno = idAluno;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}
