package br.com.poo.banco.contas;

public class Conta {

	private String titularConta;
	private String senhaConta;
	private int numeroConta;
	private double saldoConta;
	private String numeroCartao;
	
	public Conta(String titularConta, String senhaConta, int numeroConta, double saldoConta, String numeroCartao) {
		super();
		this.titularConta = titularConta;
		this.senhaConta = senhaConta;
		this.numeroConta = numeroConta;
		this.saldoConta = saldoConta;
		this.numeroCartao = numeroCartao;
	}

	public Conta() {
		super();
	}

	@Override
	public String toString() {
		return "Conta [titularConta=" + titularConta + ", senhaConta=" + senhaConta + ", numeroCartao=" + numeroCartao
				+ "]";
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

	public double getSaldoConta() {
		return saldoConta;
	}

	public String getNumeroCartao() {
		return numeroCartao;
	}
}
