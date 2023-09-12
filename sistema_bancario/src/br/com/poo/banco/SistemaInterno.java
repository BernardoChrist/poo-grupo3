package br.com.poo.banco;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.logging.Level;

import br.com.poo.br.io.LeituraEscrita;
import br.com.poo.banco.contas.Conta;
import br.com.poo.banco.util.Util;

public class SistemaInterno {

	public static void main(String[] args) throws IOException {

		LeituraEscrita.leitor("banco");
		//LeituraEscrita.escritor("banco");

		DecimalFormat df = new DecimalFormat("#");
		Conta c1 = new Conta();
		c1.getTitularConta();
		c1.getSaldoConta();

		// Logger logger = Util.setupLogger();
		Util.customizer();
		Util.setupLogger().log(Level.INFO,
				() -> "Titular: " + c1.getTitularConta() + "\nSaldo: " + df.format(c1.getSaldoConta()));
	}

}