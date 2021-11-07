package br.edu.ifpr.aula.interfaces;

public class TesteInterface{

	public static void main(String[] args) {
		FuncoesBasicas cobrador = new Estagiario();
		FuncoesNormais gestor = new Gerente();
		FuncoesBasicas secretario = new Secretario();
		
		cobrador.cobrarCliente();
		secretario.cobrarCliente();
		gestor.culparEstagiario();
		
		/*System.out.println(cobrador instanceof Funcionario);
		System.out.println(cobrador instanceof Estagiario);
		System.out.println(cobrador instanceof FuncoesBasicas);
		System.out.println(cobrador instanceof FuncoesNormais);*/
	}
}
