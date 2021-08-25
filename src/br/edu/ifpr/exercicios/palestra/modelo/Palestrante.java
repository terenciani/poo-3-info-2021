package br.edu.ifpr.exercicios.palestra.modelo;

public class Palestrante {
	private String nome;
	private String CPF;
	private String endereco;
	private String RG;
	private String dataNascimento;
	private String cidadeNascimento;
	private String estadoNascimento;

	public Palestrante() {

	}

	public Palestrante(String nome, String cPF, String endereco, String rG, String dataNascimento,
			String cidadeNascimento, String estadoNascimento) {
		this.nome = nome;
		CPF = cPF;
		this.endereco = endereco;
		RG = rG;
		this.dataNascimento = dataNascimento;
		this.cidadeNascimento = cidadeNascimento;
		this.estadoNascimento = estadoNascimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getRG() {
		return RG;
	}

	public void setRG(String rG) {
		RG = rG;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getCidadeNascimento() {
		return cidadeNascimento;
	}

	public void setCidadeNascimento(String cidadeNascimento) {
		this.cidadeNascimento = cidadeNascimento;
	}

	public String getEstadoNascimento() {
		return estadoNascimento;
	}

	public void setEstadoNascimento(String estadoNascimento) {
		this.estadoNascimento = estadoNascimento;
	}

}
