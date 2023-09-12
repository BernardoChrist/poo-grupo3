package br.com.poo.br.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import br.com.poo.banco.contas.Conta;
import br.com.poo.banco.contas.ContaPoupanca;

public class LeituraEscrita {

	static final String PATH_BASICO = "./temp/";
	static final String EXTENSAO = ".txt";

	public static void leitor(String path) throws IOException {
		BufferedReader buffRead = new BufferedReader(new FileReader(PATH_BASICO + path + EXTENSAO));

		String linha = "";

		while (true) {
			linha = buffRead.readLine();
			if (linha != null) {
				String[] dados = linha.split(";");

				// Corrente String numConta, String cpf, double saldo, double chequeEspecial
				// Poupança String numConta, String cpf, double saldo
				if (dados[0].equalsIgnoreCase("POUPANCA")) {
					ContaPoupanca cp = new ContaPoupanca(dados[0], dados[1], dados[2], 0, Double.parseDouble(dados[3]),
							linha, linha);

					Conta.mapaContas.put(dados[2], cp);
				} else if (dados[0].equalsIgnoreCase("CORRENTE")) {

				} else if (dados[0].equalsIgnoreCase("CLIENTE")) {

				} else if (dados[0].equalsIgnoreCase("GERENTE")) {

				} else if (dados[0].equalsIgnoreCase("DIRETOR")) {

				} else if (dados[0].equalsIgnoreCase("PRESIDENTE")) {

				}
			} else {
				break;
			}
		}
		System.out.println(Conta.mapaContas);
		buffRead.close();

	}

	public static void escritor(String path) throws IOException {
		String dados;
		Scanner sc = new Scanner(System.in);

		BufferedWriter buffWriter = new BufferedWriter(new FileWriter(PATH_BASICO + path + EXTENSAO, true));

		System.out.println("Escreva algo:");
		dados = sc.nextLine();
		buffWriter.append(dados + "\n");
		sc.close();
		buffWriter.close();

	}
}