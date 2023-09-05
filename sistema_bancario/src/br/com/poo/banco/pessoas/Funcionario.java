package br.com.poo.banco.pessoas;

public class Funcionario {

	private String nomeFuncionario;
	private String cpf;
	private String dataNascimento;
	private double salario;

	@Override
	public String toString() {
		return "Funcionario [nomeFuncionario=" + nomeFuncionario + ", cpf=" + cpf + ", dataNascimento=" + dataNascimento
				+ "]";
	}

	public Funcionario(String nomeFuncionario, String cpf, String dataNascimento, double salario) {
		super();
		this.nomeFuncionario = nomeFuncionario;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
		this.salario = salario;
	}

	public Funcionario() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getNomeFuncionario() {
		return nomeFuncionario;
	}

	public void setNomeFuncionario(String nomeFuncionario) {
		this.nomeFuncionario = nomeFuncionario;
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

	public String getDataNascimento() {
		return dataNascimento;
	}

}
