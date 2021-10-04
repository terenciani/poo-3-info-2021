package br.edu.ifpr.aula.heranca;

public class TestaHeranca {
	public static void main(String[] args) {
		Aluno aluno = new Aluno("Ana", "04/10/2000", "ana@email.com", "111.111.111-11", 201512345);
		Professor professor = new Professor("Marcelo", "04/10/2000", "ana@email.com", "111.111.111-11", "201512345");

		double salario = professor.calculaSalario(0.5, professor);

		if (professor instanceof Object)
			System.out.println("É instancia da Object");
		if (professor instanceof Pessoa)
			System.out.println("É instancia da Pessoa");
		if (professor instanceof Professor)
			System.out.println("É instancia da Professor");

	}
}
