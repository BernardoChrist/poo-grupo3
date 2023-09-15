package br.com.poo.banco.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.text.DecimalFormat;

import br.com.poo.banco.contas.Conta;
import br.com.poo.banco.contas.ContaCorrente;
import br.com.poo.banco.contas.ContaPoupanca;
import br.com.poo.banco.enums.ContaEnum;
import br.com.poo.banco.enums.PessoaEnum;
import br.com.poo.banco.pessoas.Cliente;
import br.com.poo.banco.pessoas.Funcionario;

public class LeituraEscrita {

	static final String PATH_BASICO = "./temp/";
	static final String EXTENSAO = ".txt";

	public static void leitor(String path) throws IOException {
		BufferedReader buffRead = new BufferedReader(new FileReader(PATH_BASICO + path + EXTENSAO));

		String linha = "";

		// System.out.println(linha);
		DecimalFormat df = new DecimalFormat("#0,000.00");

		while (true) {
			linha = buffRead.readLine();
			if (linha != null) {
				String[] dados = linha.split(";");

				// Poupanca;1234;678901-2;67890.12;126.662.292-62;9876-5;
				if (dados[0].equalsIgnoreCase(ContaEnum.POUPANCA.name())) {
					ContaPoupanca cp = new ContaPoupanca(dados[0], dados[1], dados[2], Double.parseDouble(dados[3]),
							dados[4], dados[5]);

					Conta.mapaContas.put(dados[4], cp);
					System.out.println(cp);
				} else if (dados[0].equalsIgnoreCase(ContaEnum.CORRENTE.name())) {
					// Corrente;1234;384791-0;500.00;987.654.321-09;1358-0;54000.0;true;
					ContaCorrente conta = new ContaCorrente(dados[0], dados[1], dados[2], Double.parseDouble(dados[3]),
							dados[4], dados[5], Double.parseDouble(dados[6]), Boolean.parseBoolean(dados[7]));
					Conta.mapaContas.put(dados[4], conta);
				} else if (dados[0].equalsIgnoreCase(PessoaEnum.CLIENTE.name())) {
					// String TIPO_PESSOA, String nome, String cpf, String endereco, String telefone
					Cliente c = new Cliente(dados[0], dados[1], dados[2], dados[3], dados[4]);
					Cliente.mapaClientes.put(dados[2], c);
				} else if (dados[0].equalsIgnoreCase(PessoaEnum.GERENTE.name())) {
<<<<<<< HEAD
					//String cargo, double salario, String numAgencia, String cpf, String nome
					Funcionario f = new Funcionario(dados [0], Double.parseDouble(dados[1]), dados[2], dados[3], dados[4], dados[5];
=======
					// String cargo, double salario, String numAgencia, String cpf, String nome
					
					Funcionario f = new Funcionario(dados[0], Double.parseDouble(dados[1]), dados[2], dados[3],
							dados[4], dados[5]);
>>>>>>> bf2c53c96fb663df12f87049d0a48b3462d18bf3
					Funcionario.mapaFuncionarios.put(dados[3], f);
				} else if (dados[0].equalsIgnoreCase(PessoaEnum.DIRETOR.name())) {
					Funcionario f = new Funcionario(dados[0], Double.parseDouble(dados[1]), dados[2], dados[3],
							dados[4], dados[5]);
					Funcionario.mapaFuncionarios.put(dados[3], f);
				} else if (dados[0].equalsIgnoreCase(PessoaEnum.PRESIDENTE.name())) {
					Funcionario f = new Funcionario(dados[0], Double.parseDouble(dados[1]), dados[2], dados[3],
							dados[4], dados[5]);
					Funcionario.mapaFuncionarios.put(dados[3], f);
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

	// compreovante de saque
	public static void comprovanteSaque(Conta conta, Double valor) throws IOException {

		String path = conta.getTipoConta() + "_" + conta.getCpfConta();
		BufferedWriter buffWrite = new BufferedWriter(new FileWriter(PATH_BASICO + path + EXTENSAO, true));

		String linha = "***************** SAQUE *****************";
		buffWrite.append(linha + "\n");

		linha = "CPF: " + conta.getCpfConta();
		buffWrite.append(linha + "\n");

		linha = "Conta: " + conta.getNumeroConta();
		buffWrite.append(linha + "\n");

		linha = "Valor do Saque: " + valor;
		buffWrite.append(linha + "\n");

		LocalDateTime dataHora = LocalDateTime.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

		linha = "Operação realizada em: " + dtf.format(dataHora);
		buffWrite.append(linha + "\n");

		linha = "***************** FIM SAQUE *****************";
		buffWrite.append(linha + "\n");

		buffWrite.close();

	}

}