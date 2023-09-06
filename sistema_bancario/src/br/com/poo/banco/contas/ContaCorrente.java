package br.com.poo.banco.contas;



public class ContaCorrente extends Conta {

	private double limiteCredito;
	private boolean chequeEspecial;

	public ContaCorrente() {
		super();
	}

	public ContaCorrente(double limiteCredito, boolean chequeEspecial) {
		super();
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