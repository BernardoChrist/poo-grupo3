package br.com.poo.banco.pessoas;

public class Diretor extends Funcionario {
	
	public Diretor(String cargo, double salario, String numAgencia, String cpf, String nome, String senha) {
		super(cargo, salario, numAgencia, cpf, nome, senha);
		// TODO Auto-generated constructor stub
	}
	private int senha;
	private String atributosExclusivos;
}
