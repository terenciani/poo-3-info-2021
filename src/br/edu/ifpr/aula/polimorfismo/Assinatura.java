package br.edu.ifpr.aula.polimorfismo;

public class Assinatura {
	
	public double soma(double a, double b) {
		System.out.println("Método que soma dois doubles");
		return (int)(a + b);
	}
	
	public double soma(double a, int b) {
		System.out.println("Método que soma dois doubles");
		return (a + b);
	}

	public double soma(int a, int b) {
		System.out.println("Método que soma dois ints");
		return a + b;
	}

	public double soma(float a, float b) {
		return a + b;
	}

	public double soma(float a, int b) {
		return a + b;
	}
}
