package br.edu.ifpr.aula.polimorfismo;

public class TesteDeSom {
	public static void main(String[] args) {
		Animal pato = new Pato();
		Animal cachorro = new Cachorro();
		Animal gato = new Gato();
		/*
		pato.emitirSom();
		cachorro.emitirSom();
		gato.emitirSom();
		*/
		System.out.println(pato instanceof Animal);
		System.out.println(cachorro instanceof Animal);
		System.out.println(gato instanceof Animal);
	}
}
