package br.com.poo.banco.contas;

import java.util.HashMap;
import java.util.Map;

public class Conta {

	private String tipoConta;
	private String titularConta;
	private String senhaConta;
	private int numeroConta;
	private Double saldoConta;
	private String numeroCartao;
	private String cpf;

	public static Map<String, Conta> mapaContas = new HashMap<>();

	public Conta(String tipoConta, String titularConta, String senhaConta, int numeroConta, Double saldoConta,
			String numeroCartao, String cpf) {
		super();
		this.tipoConta = tipoConta;
		this.titularConta = titularConta;
		this.senhaConta = senhaConta;
		this.numeroConta = numeroConta;
		this.saldoConta = saldoConta;
		this.numeroCartao = numeroCartao;
		this.cpf = cpf;
	}

	public Conta() {
		super();
	}

	@Override
	public String toString() {
		return "Conta [titularConta=" + titularConta + ", senhaConta=" + senhaConta + ", numeroCartao=" + numeroCartao
				+ "]";
	}

	public String getCpf() {
		return cpf;
	}

	public String getTitularConta() {
		return titularConta;
	}

	public void setTitularConta(String titularConta) {
		this.titularConta = titularConta;
	}

	public String getSenhaConta() {
		return senhaConta;
	}

	public void setSenhaConta(String senhaConta) {
		this.senhaConta = senhaConta;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public Double getSaldoConta() {
		return saldoConta;
	}

	public String getNumeroCartao() {
		return numeroCartao;
	}

	public String getTipoConta() {
		return tipoConta;
	}
}
