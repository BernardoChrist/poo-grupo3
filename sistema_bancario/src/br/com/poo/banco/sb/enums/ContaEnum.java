package br.com.poo.banco.sb.enums;

public enum ContaEnum {
	CORRENTE("Corrente", 1),
	POUPANCA("Poupança", 2);
	
	private String TipoConta;
	private int id;
	
	ContaEnum(String TipoConta,int id)	{
		
	}
}
