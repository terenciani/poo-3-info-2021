package br.edu.ifpr.exercicios.polimorfismo;

public class Livro {
	private String titulo;
	private String autores;
	private String editora;
	private String formato;
	private double precoMedio;

	// gerar os métodos getters e setters
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutores() {
		return autores;
	}

	public void setAutores(String autores) {
		this.autores = autores;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	
	public String getFormato() {
		return formato;
	}

	public void setFormato(String formato) {
		this.formato = formato;
	}

	public double getPrecoMedio() {
		return precoMedio;
	}

	public void setPrecoMedio(double precoMedio) {
		this.precoMedio = precoMedio;
	}

	public double getValorEbook() {
		double desconto = this.precoMedio * 0.45;
		return this.precoMedio - desconto;
	}
	
	public double getValorCapaSimples() {
		double acrescimo = this.precoMedio * 0.30;
		return this.precoMedio + acrescimo;
	}
	
	public double getValorCapaColecionador() {
		double acrescimo = this.precoMedio * 0.80;
		return this.precoMedio + acrescimo;
	}

	public void apresentarPrecoDoLivro(double precoEbook) {
		System.out.println("O valor deste livro no formato E-book é R$ " + precoEbook);
	}

	public void apresentarPrecoDoLivro(double precoEbook, double precoCapaSimples) {
		System.out.println("O valor deste livro no formato E-book é R$ " + precoEbook);
		System.out.println("O valor deste livro no formato Capa Simples é R$ " + precoCapaSimples);
	}

	public void apresentarPrecoDoLivro(double precoEbook, double precoCapaSimples, double precoCapaColecionador) {
		System.out.println("O valor deste livro no formato E-book é R$ " + precoEbook);
		System.out.println("O valor deste livro no formato Capa Simples é R$ " + precoCapaSimples);
		System.out.println("O valor deste livro no formato Colecionador é R$ " + precoCapaColecionador);
	}
}
