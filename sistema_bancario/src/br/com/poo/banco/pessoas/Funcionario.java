package br.com.poo.banco.pessoas;

public class Funcionario{
	
	private String cargo;
	private String nome;
	private String cpf;
	private double salario;

	@Override
	public String toString() {
		return " [nome =" + nome + ", cpf =" + cpf + "]";
	}

	public Funcionario(String cargo, String nome, String cpf, double salario) {
		super();
		this.cargo = cargo;
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
	}

	public Funcionario() {
		super();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getCpf() {
		return cpf;
	}

	public String getCargo() {
		return cargo;
	}

}
