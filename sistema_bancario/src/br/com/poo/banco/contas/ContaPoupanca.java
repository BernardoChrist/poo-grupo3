package br.com.poo.banco.contas;


public class ContaPoupanca extends Conta {

	private double rendimento;
	

	public ContaPoupanca() {
		super();
	}

	public ContaPoupanca(String tipoConta, String senhaConta, 
	String numeroConta, Double saldoConta, String cpfConta) {
		
		
		super(tipoConta, senhaConta, numeroConta, saldoConta, cpfConta);
		
		if (Double saldoConta == 0) {
			saldoConta + 10
		}
	
	}
	
	
	public double getRendimento() {
		return rendimento;
	}
	
}