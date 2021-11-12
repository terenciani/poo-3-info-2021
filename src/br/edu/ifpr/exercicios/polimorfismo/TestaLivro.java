package br.edu.ifpr.exercicios.polimorfismo;

import java.util.Scanner;

public class TestaLivro {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Livro livro = new Livro();
		
		System.out.println("Digite o título do livro");
		livro.setTitulo(teclado.nextLine());
		
		System.out.println("Digite o nome dos autores do livro");
		livro.setAutores(teclado.nextLine());
		
		System.out.println("Digite a editora do livro");
		livro.setEditora(teclado.nextLine());
		
		System.out.println("Digite o formato do livro (E-book, Capa Simples, Capa Colecionador)");
		livro.setFormato(teclado.nextLine());
		
		System.out.println("Digite o preço médio do livro");
		livro.setPrecoMedio(teclado.nextDouble());
		
		double precoEbook = livro.getValorEbook();
		double precoCapaSimples = livro.getValorCapaSimples();
		double precoCapaColecionador = livro.getValorCapaColecionador();
		
		livro.apresentarPrecoDoLivro(precoEbook);
		livro.apresentarPrecoDoLivro(precoEbook, precoCapaSimples);
		livro.apresentarPrecoDoLivro(precoEbook, precoCapaSimples, precoCapaColecionador);
	}
}
