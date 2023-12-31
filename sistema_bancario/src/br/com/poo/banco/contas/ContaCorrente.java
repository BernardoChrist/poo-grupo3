 package br.com.poo.banco.contas;



public class ContaCorrente extends Conta {

	private Double limiteCredito;
	private Double chequeEspecial;

	public ContaCorrente() {
		super();
	}
	//Corrente;1234;384791-0;500.00;987.654.321-09;1358-0;54000.0;true;
	public ContaCorrente(String tipoConta, String senhaConta, String numeroConta, 
			double limiteCredito, String cpfConta, String numAgencia , double saldoConta, boolean chequeEspecial) {
		super(tipoConta, numeroConta, numAgencia, cpfConta, saldoConta, senhaConta);
		this.limiteCredito = limiteCredito;
	
	}
	
	public double getLimiteCredito() {
		return limiteCredito;
	}

	public void setLimiteCredito(double limiteCredito) {
		this.limiteCredito = limiteCredito;
	}
	
	//Método para depositar dinheiro
	public void depositar(double valor) {
		Double txDepositar = 0.10;
		
		
		valor -= txDepositar;
		
		Double saldoConta = this.getSaldoConta();
		
		super.depositar(valor);
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