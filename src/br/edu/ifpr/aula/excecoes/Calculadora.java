package br.edu.ifpr.aula.excecoes;

public class Calculadora {
	public static double  divisao(double dividendo, double divisor) throws DivisaoPorZeroException{
		if(divisor == 0)
			throw new DivisaoPorZeroException("Valor Especial n�o Num�rico (NaN)");
		
		return dividendo / divisor;
	}
}
