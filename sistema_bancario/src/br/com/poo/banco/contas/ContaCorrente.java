 package br.com.poo.banco.contas;



public class ContaCorrente extends Conta {

	private double limiteCredito;
	private boolean chequeEspecial;

	public ContaCorrente() {
		super();
	}
	
	public ContaCorrente(String tipoConta, String senhaConta, String numeroConta, 
	Double saldoConta, String cpfConta, String numAgencia ,Double limiteCredito, boolean chequeEspecial) {
		super(tipoConta, senhaConta, numeroConta, saldoConta, cpfConta, numAgencia);
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
	
	//Método para depositar dinheiro
	public void depositar(double valor) {
		Double txDepositar = 0.10;
		Double valorDeposito;
		double saldoConta = this.getSaldoConta();
		
		valorDeposito = valor - txDepositar;
		
		saldoConta += valorDeposito;
	}
	
	
	// Método para sacar dinheiro
	public boolean sacar(double valor) {
		Double txSacar = 0.10;
		Double valorSaque;
		double saldoConta = this.getSaldoConta();
		
		valorSaque = valor - txSacar;
		

		if (saldoConta >= valorSaque) {
			saldoConta -= valorSaque;
			return true; // Saque bem sucedido

		} else {
			return false; // Saldo não suficiente para sacar
		}
	}
}