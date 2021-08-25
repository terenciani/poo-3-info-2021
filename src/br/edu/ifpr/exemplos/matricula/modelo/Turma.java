package br.edu.ifpr.exemplos.matricula.modelo;

public class Turma {
	private int alunosMatriculados;
	private int numeroMinimo;
	private String nomeTurma;

	public Turma() {
		this.alunosMatriculados = 0;
		this.numeroMinimo = 10;
		this.nomeTurma = "Nome padrão";
	}

	public Turma(int alunosMatriculados, int numeroMinimo, String nomeTurma) {
		this.alunosMatriculados = alunosMatriculados;
		this.numeroMinimo = numeroMinimo;
		this.nomeTurma = nomeTurma;
	}

	public int getAlunosMatriculados() {
		return alunosMatriculados;
	}

	public void setAlunosMatriculados(int alunosMatriculados) {
		this.alunosMatriculados = alunosMatriculados;
	}

	public String getNomeTurma() {
		return nomeTurma;
	}

	public void setNomeTurma(String nomeTurma) {
		this.nomeTurma = nomeTurma;
	}

	public int getNumeroMinimo() {
		return numeroMinimo;
	}

	public void setNumeroMinimo(int numeroMinimo) {
		this.numeroMinimo = numeroMinimo;
	}

}
