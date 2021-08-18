package br.edu.ifpr.exemplos.matricula.modelo;

public class Turma {
	int alunosMatriculados;
	int numeroMinimo;
	String nomeTurma;

	public Turma() {
		this.alunosMatriculados = 0;
		this.numeroMinimo = 10;
		this.nomeTurma = "Nome padr�o";
	}

	public Turma(int alunosMatriculados, int numeroMinimo, String nomeTurma) {
		this.alunosMatriculados = alunosMatriculados;
		this.numeroMinimo = numeroMinimo;
		this.nomeTurma = nomeTurma;
	}
}
