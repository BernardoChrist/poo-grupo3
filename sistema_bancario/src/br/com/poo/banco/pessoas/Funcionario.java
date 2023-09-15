package br.com.poo.banco.pessoas;

import java.util.HashMap;
import java.util.Map;

public class Funcionario{
	
	private String cargo;
	private String nome;
	private String cpf;
	private double salario;
	private String numAgencia;
	private String senha;

	
	
	@Override
	public String toString() {
		return "Funcionario [cargo=" + cargo + ", nome=" + nome + ", cpf=" + cpf + ", salario=" + salario
				+ ", numAgencia=" + numAgencia + ", senha=" + senha + "]";
	}

	public static Map<String, Funcionario> mapaFuncionarios = new HashMap<>();

	public Funcionario(String cargo, double salario, String numAgencia, String cpf, String nome, String senha) {
		super();
		this.cargo = cargo;
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
		this.numAgencia = numAgencia;
		this.senha = senha;
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
	
	public String getSenha() {
		return senha;
	}

}
