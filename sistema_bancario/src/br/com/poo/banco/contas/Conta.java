package br.com.poo.banco.contas;

import java.util.HashMap;
import java.util.Map;

public class Conta {
	
	private String tipoConta;
	private String senhaConta;
	private String numeroConta;
	private Double saldoConta;
	private String cpfConta;
	
	public Conta(String tipoConta, String numeroConta, String cpfConta, Double saldoConta, String senhaConta) {
		
		this.tipoConta = tipoConta;
		this.senhaConta = senhaConta;
		this.numeroConta = numeroConta;
		this.saldoConta = saldoConta;
		this.cpfConta = cpfConta;
		
	}
	
	// Método para sacar dinheiro
	public boolean sacar(double valor) {
		if (saldoConta >= valor) {
			saldoConta -= valor;
			return true; // Saque bem-sucedido
		} else {
			return false; // Saldo insuficiente
		}
	}
	
	// Método para depositar dinheiro
	public void depositar(double valor) {
		saldoConta += valor;
	}

	public String getTipoConta() {
		return tipoConta;
	}

	public String getSenhaConta() {
		return senhaConta;
	}

	public String getNumeroConta() {
		return numeroConta;
	}

	public Double getSaldoConta() {
		return saldoConta;
	}

	public String getCpfConta() {
		return cpfConta;
	}

	public static Map<String, Conta> getMapaContas() {
		return mapaContas;
	}


	public static Map<String, Conta> mapaContas = new HashMap<>();

	public Conta() {
		
	}
    
    @Override
	public String toString() {
    	return "Conta [numConta=" + numeroConta + ", cpf=" + cpfConta + ", saldo=" + saldoConta + "]\n";
	}
}
