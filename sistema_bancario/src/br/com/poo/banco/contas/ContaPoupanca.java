package br.com.poo.banco.contas;


public class ContaPoupanca extends Conta {

	private double rendimento;
	

	public ContaPoupanca() {
		super();
	}

	public ContaPoupanca(String tipoConta, String senhaConta, 
	String numeroConta, Double saldoConta, String cpfConta) {
		
		
		super(tipoConta, senhaConta, numeroConta, saldoConta, cpfConta);
	
	}
	
	
	public double getRendimento() {
		return rendimento;
	}
	

	//método de calcular o rendimento - com a taxa de 1% ao mês
	public double calcularRendimento(double valor, double qntdMes) {
		Double txRendimento = 0.01;
		Double valorRendimento;
		
		valorRendimento = txRendimento * valor * qntdMes;
		
		return valorRendimento;
	}
	
	//método de rendimento para render direto da conta
	public void rendimentoCalculado() {
		double rendimento = getSaldoConta() * 0.01;
		double saldoConta = this.getSaldoConta();
		
		saldoConta += rendimento;
	}

}