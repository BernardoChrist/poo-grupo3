package br.com.poo.banco.contas;


public class ContaPoupanca extends Conta {

	private double rendimento;
	

	public ContaPoupanca() {
		super();
	}

	public ContaPoupanca(String tipoConta, String titularConta, String senhaConta, 
	int numeroConta, Double saldoConta, String numeroCartao, String cpf) {
		
		super(tipoConta,  titularConta, senhaConta, numeroConta, saldoConta, numeroCartao, cpf);
		
	}
	
	public double getRendimento() {
		return rendimento;
	}
	//
}