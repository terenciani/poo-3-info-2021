package br.edu.ifpr.aula.sincrona.polimorfismo;

public class TestaSobrescrita {
	public static void main(String[] args) {
		Animal gato = new Gato();
		Animal cachorro = new Cachorro();
		Animal pato = new Pato();
		Animal hamster = new Hamster();
		
		
		Funcionario marcelo = new Gerente();
		Funcionario luan = new Estagiario();
		Funcionario joao = new Secretario();
		
		
		// int = double
		
		hamster.falar();
		// gato.falar();
		// cachorro.falar();
		// pato.falar();
		
		System.out.println("Sal�rio do Marcelo: R$" + marcelo.calculaSalario());
		System.out.println("Sal�rio do Luan: R$" + luan.calculaSalario());
		System.out.println("Sal�rio do Jo�o: R$" + joao.calculaSalario());
		
		System.out.println(luan.toString());
		System.out.println(joao.toString());
		
		if (marcelo instanceof Object) {
			System.out.println("� inst�ncia de Object");
		} else if (marcelo instanceof Funcionario) {
			System.out.println("� inst�ncia de funcion�rio");
		} else if (marcelo instanceof Gerente) {
			System.out.println("� inst�ncia de gerente");
		} else if (marcelo instanceof Secretario) {
			System.out.println("� inst�ncia de Secret�rio");
		}
	}
}
