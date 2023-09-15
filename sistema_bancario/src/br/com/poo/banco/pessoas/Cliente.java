package br.com.poo.banco.pessoas;

import java.util.HashMap;
import java.util.Map;

public class Cliente {

	private final String TIPO_PESSOA = "Cliente";
	private String nome;
	private String cpf;
	private Integer senha;
	private String endereco;
	private String telefone;

	
	public static Map<String, Cliente> mapaClientes = new HashMap<>();
	
	public Cliente() {
		super();
	}
	
	public Cliente(String TIPO_PESSOA, String nome, String cpf, String endereco, String telefone, Integer senha) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.senha = senha;
		this.endereco = endereco;
		this.telefone = telefone;
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

	public Integer getSenha() {
		return senha;
	}

	public String getEndereco() {
		return endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public String getTIPO_PESSOA() {
		return TIPO_PESSOA;
	}
}
