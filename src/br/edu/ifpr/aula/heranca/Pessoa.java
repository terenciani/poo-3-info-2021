package br.edu.ifpr.aula.heranca;

public class Pessoa {
	private String nome;
	private String cpf;
	private String dataNascimento;
	private String email;
	private double salarioMinimo;
	
	
	
	public Pessoa(String nome, String cpf, String dataNascimento, String email) {
		this.nome = nome;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public double calculaSalario(double qtdSalarios, Object objeto) {
		double salario = 0;
		
		if(objeto instanceof Professor)
			salario = this.salarioMinimo * qtdSalarios;
		if(objeto instanceof Aluno)
			salario = 0;
		
		return salario;
	}
}
