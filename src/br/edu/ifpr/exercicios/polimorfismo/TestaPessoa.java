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
		
		//System.out.println("Digite o nome do funcionário");
		funcionario.setNome(pessoa.getNome());
		
		System.out.println("Digite o RG do funcionário");
		funcionario.setRg(teclado.nextLine());
		
		System.out.println("Digite o número do cartão funcional do funcionário");
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
			System.out.println("É instância de pessoa");
		} else {
			System.out.println("Não é instância de pessoa");
		}
		
		if(objeto instanceof PessoaFisica) {
			System.out.println("É instância de pessoa física");
		} else {
			System.out.println("Não é instância de pessoa física");
		}
		
		if(objeto instanceof PessoaJuridica) {
			System.out.println("É instância de pessoa jurídica");
		} else {
			System.out.println("Não é instância de pessoa jurídica");
		}
		
		if(objeto instanceof Funcionario) {
			System.out.println("É instância de funcionário");
		} else {
			System.out.println("Não é instância de funcionário");
		}
	}
}
