package br.edu.ifpr.exercicios.polimorfismo;

import java.util.Scanner;

public class TestaPessoa {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		//Funcionario funcionario = new Funcionario();
		
		Pessoa pessoa = new Pessoa();
		
		System.out.println("Digite o nome da pessoa");
		pessoa.setNome(teclado.nextLine());
	
		Funcionario funcionario = (Funcionario) pessoa;
		
		//System.out.println("Digite o nome do funcion�rio");
		funcionario.setNome(pessoa.getNome());
		
		System.out.println("Digite o RG do funcion�rio");
		funcionario.setRg(teclado.nextLine());
		
		System.out.println("Digite o n�mero do cart�o funcional do funcion�rio");
		funcionario.setCartao(teclado.nextLine());
		
		qualClasseEuPertenco(funcionario);
		
		System.out.println();
		
		verificaInstancia(funcionario);
		
	}
	public static void qualClasseEuPertenco(Object objeto) {
		System.out.println(objeto.getClass());
		System.out.println(objeto.getClass().getSimpleName());
	}
	public static void verificaInstancia(Object objeto) {
		
		if(objeto instanceof Pessoa) {
			System.out.println("� inst�ncia de pessoa");
		} else {
			System.out.println("N�o � inst�ncia de pessoa");
		}
		
		if(objeto instanceof PessoaFisica) {
			System.out.println("� inst�ncia de pessoa f�sica");
		} else {
			System.out.println("N�o � inst�ncia de pessoa f�sica");
		}
		
		if(objeto instanceof PessoaJuridica) {
			System.out.println("� inst�ncia de pessoa jur�dica");
		} else {
			System.out.println("N�o � inst�ncia de pessoa jur�dica");
		}
		
		if(objeto instanceof Funcionario) {
			System.out.println("� inst�ncia de funcion�rio");
		} else {
			System.out.println("N�o � inst�ncia de funcion�rio");
		}
	}
}
