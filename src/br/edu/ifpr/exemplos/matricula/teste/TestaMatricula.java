package br.edu.ifpr.exemplos.matricula.teste;

import br.edu.ifpr.exemplos.matricula.modelo.Aluno;

public class TestaMatricula {

	public static void main(String[] args) {
		Aluno objetoAluno = new Aluno();
		
		objetoAluno.setNome("Ariel para Monitor!");
		
		System.out.println("O nome do aluno é: " + objetoAluno.getNome());
		
	}

}
