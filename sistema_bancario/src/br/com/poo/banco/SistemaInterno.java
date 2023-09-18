package br.com.poo.banco;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.logging.Level;

import br.com.poo.banco.contas.Conta;
import br.com.poo.banco.io.LeituraEscrita;
import br.com.poo.banco.util.Util;
import br.com.poo.banco.views.TelaLogin;

public class SistemaInterno {

	public static void main(String[] args) throws IOException {

		LeituraEscrita.leitor("banco");
		//LeituraEscrita.escritor("banco");
		
		TelaLogin telaLogin = new TelaLogin();
		telaLogin.setLocationRelativeTo(telaLogin);
		telaLogin.setVisible(true);
		
	
		
		
		
//		DecimalFormat df = new DecimalFormat("#0,000.00");
//		Conta c1 = new Conta("Corrente", "123456-7", "1234-5","132.456.789-11", 10000.20, "9000-4");
//		//System.out.println("Antes " + c1.getSaldoConta());
//		LeituraEscrita.comprovanteSaque(c1, 50.00);
//		//System.out.println("Depois " + c1.getSaldoConta());
//		
//		// Logger logger = Util.setupLogger();
//		Util.customizer();
//		Util.setupLogger().log(Level.INFO,
//				() -> "Titular: " + c1.getCpfConta() + "\nSaldo: " + df.format(c1.getSaldoConta()));
	
	}

}