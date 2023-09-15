package br.com.poo.banco.pessoas;

import java.util.HashMap;
import java.util.Map;

public class Funcionario{
	
	private String cargo;
	private String nome;
	private String cpf;
	private double salario;
	private String numAgencia;

	@Override
	public String toString() {
		return " [nome =" + nome + ", cpf =" + cpf + "]";
	}
	
	public static Map<String, Funcionario> mapaFuncionarios = new HashMap<>();

	public Funcionario(String cargo, double salario, String numAgencia, String cpf, String nome) {
		super();
		this.cargo = cargo;
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
		this.numAgencia = numAgencia;
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
