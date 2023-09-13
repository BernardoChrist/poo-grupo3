 package br.com.poo.banco.contas;



public class ContaCorrente extends Conta {

	private double limiteCredito;
	private boolean chequeEspecial;

	public ContaCorrente() {
		super();
	}

	public ContaCorrente(String tipoConta, String senhaConta, String numeroConta, 
	Double saldoConta, String cpfconta, Double limiteCredito, boolean chequeEspecial) {
	//	super(tipoConta, senhaConta, numeroConta, saldoConta, cpfConta);*
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