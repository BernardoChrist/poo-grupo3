 package br.com.poo.banco.contas;



public class ContaCorrente extends Conta {

	private double limiteCredito;
	private boolean chequeEspecial;

	public ContaCorrente() {
		super();
	}

	public ContaCorrente(String tipoConta, String titularConta, String senhaConta, int numeroConta, 
	Double saldoConta, String numeroCartao, String cpf, Double limiteCredito, boolean chequeEspecial) {
		super(tipoConta, titularConta, senhaConta, numeroConta, saldoConta, numeroCartao, cpf);
		this.limiteCredito = limiteCredito;
		this.chequeEspecial = chequeEspecial;
	}

	public double getLimiteCredito() {
		return limiteCredito;
	}

	public void setLimiteCredito(double limiteCredito) {
		this.limiteCredito = limiteCredito;
	}

	public boolean isChequeEspecial() {
		return chequeEspecial;
	}
	
}