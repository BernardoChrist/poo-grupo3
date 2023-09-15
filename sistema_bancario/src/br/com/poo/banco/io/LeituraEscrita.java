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
import br.com.poo.banco.contas.ContaPoupanca;
import br.com.poo.banco.enums.ContaEnum;
import br.com.poo.banco.pessoas.Cliente;
import br.com.poo.banco.pessoas.Funcionario;

public class LeituraEscrita {

	static final String PATH_BASICO = "./temp/";
	static final String EXTENSAO = ".txt";

	public static void leitor(String path) throws IOException {
		BufferedReader buffRead = new BufferedReader(new FileReader(PATH_BASICO + path + EXTENSAO));

		String linha = "";

		
	//	System.out.println(linha);
		DecimalFormat df = new DecimalFormat("#0,000.00");
		
		while (true) {
			linha = buffRead.readLine();
			if (linha != null) {
				String[] dados = linha.split(";");

				// Corrente String numConta, String cpf, double saldo, double chequeEspecial
				// Poupança String numConta, String cpf, double saldo
				if (dados[0].equalsIgnoreCase(ContaEnum.POUPANCA.name())) {
					ContaPoupanca cp = new ContaPoupanca(dados[0],
							dados[1], dados[2], (dados[3]), Double.parseDouble(dados[4]));

					Conta.mapaContas.put(dados[2], cp);
					System.out.println(cp);
				} else if (dados[0].equalsIgnoreCase("CORRENTE")) {
					//String tipoConta, String numeroConta, String numAgencia, String cpfConta, Double saldoConta, String senhaConta
					Conta conta = new Conta(dados[0], dados[1], dados[2], dados[3], Double.parseDouble(dados[4]),
							dados[5]);
					Conta.mapaContas.put(dados[1], conta);
				} else if (dados[0].equalsIgnoreCase("CLIENTE")) {
					//String TIPO_PESSOA, String nome, String cpf, String endereco, String telefone, Integer senha
					Cliente c = new Cliente(dados [0], dados[1], dados[2], dados[3],dados[4] ,Integer.parseInt(dados[5]));
					Cliente.mapaClientes.put(dados [2], c);
				} else if (dados[0].equalsIgnoreCase("GERENTE")) {
					//String cargo, double salario, String numAgencia, String cpf, String nome
					Funcionario f = new Funcionario(dados [0], Double.parseDouble(dados[1]), dados[2], dados[3], dados[4]);
					Funcionario.mapaFuncionarios.put(dados[2], f);
				} else if (dados[0].equalsIgnoreCase("DIRETOR")) {
					Funcionario f = new Funcionario(dados [0], Double.parseDouble(dados[1]), dados[2], dados[3], dados[4]);
					Funcionario.mapaFuncionarios.put(dados[2], f);
				} else if (dados[0].equalsIgnoreCase("PRESIDENTE")) {
					Funcionario f = new Funcionario(dados [0], Double.parseDouble(dados[1]), dados[2], dados[3], dados[4]);
					Funcionario.mapaFuncionarios.put(dados[2], f);
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
	
	//compreovante de saque
	public static void comprovanteSaque(Conta conta, Double valor) throws IOException {
		
		String path = conta.getTipoConta() + "_" +conta.getCpfConta() ;
		BufferedWriter buffWrite = new BufferedWriter (new FileWriter(PATH_BASICO + path + EXTENSAO, true));
		
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