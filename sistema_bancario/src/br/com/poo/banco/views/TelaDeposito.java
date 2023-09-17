package br.com.poo.banco.views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.com.poo.banco.contas.Conta;
import br.com.poo.banco.contas.ContaCorrente;
import br.com.poo.banco.enums.ContaEnum;
import br.com.poo.banco.pessoas.Cliente;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;

public class TelaDeposito extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textValor;
	private String[] dados;

	/**
	 * Create the frame.
	 */
	public TelaDeposito(boolean cc, boolean cp, Cliente cliente, Conta contaPoupanca, Conta contaCorrente) {
		setResizable(false);
		setTitle("Depósito");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 930, 630);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(235, 235, 235));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel TextDigiteoValor = new JLabel("Digite o valor que deseja depositar:");
		TextDigiteoValor.setFont(new Font("Lato", Font.BOLD, 20));
		TextDigiteoValor.setBounds(296, 284, 321, 30);
		contentPane.add(TextDigiteoValor);

		textValor = new JTextField();
		textValor.setBounds(296, 325, 321, 25);
		contentPane.add(textValor);
		textValor.setColumns(10);

		JButton btnConfirmar = new JButton("Confirmar");
		btnConfirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String linha;
					BufferedReader reader = new BufferedReader(new FileReader("banco.txt"));
					while ((linha = reader.readLine()) != null) {
						String[] dados = linha.split(";");
						double valorDeposito = Double.parseDouble(textValor.getText());
						Conta contaCorrente = new ContaCorrente();
						contaCorrente.depositar(valorDeposito);
		
						// Atualiza o arquivo txt com o novo saldo
						List<String> linhas = new ArrayList<>();
		
						String numeroConta = dados[2];
						ContaEnum tipoConta = ContaEnum.valueOf(dados[0]); // Converte a string para o Enum
						double saldoConta = Double.parseDouble(dados[6]);
		
						if (tipoConta == ContaEnum.CORRENTE && numeroConta.equals(contaCorrente.getNumeroConta())) {
							saldoConta += valorDeposito;
						}
		
						dados[6] = String.valueOf(saldoConta);
						linhas.add(String.join(";", dados)); // Reconstroi a linha com os valores atualizados
					}
		
					reader.close();
		
					// Agora, escreva as linhas atualizadas de volta no arquivo "banco.txt"
					BufferedWriter writer = new BufferedWriter(new FileWriter("banco.txt"));
					for (String linhaAtualizada : dados) {
						writer.write(linhaAtualizada);
						writer.newLine();
					}
		
					writer.close();
				} catch (IOException e1) {
		
					e1.printStackTrace();
				}
				}
			
		});
		btnConfirmar.setForeground(new Color(255, 255, 255));
		btnConfirmar.setFont(new Font("Lato", Font.BOLD, 14));
		btnConfirmar.setBackground(new Color(233, 65, 69));
		btnConfirmar.setBounds(347, 471, 220, 60);
		contentPane.add(btnConfirmar);

		JLabel TextNovoCadastro = new JLabel("Conta Corrente");
		TextNovoCadastro.setForeground(new Color(255, 255, 255));
		TextNovoCadastro.setBackground(new Color(255, 255, 255));
		TextNovoCadastro.setBounds(401, 161, 112, 30);
		TextNovoCadastro.setFont(new Font("Lato", Font.BOLD, 15));
		contentPane.add(TextNovoCadastro);

		JLabel textLinhaVermelha = new JLabel("__________________________________");
		textLinhaVermelha.setForeground(new Color(198, 43, 26));
		textLinhaVermelha.setFont(new Font("Tahoma", Font.PLAIN, 46));
		textLinhaVermelha.setBackground(UIManager.getColor("Button.background"));
		textLinhaVermelha.setBounds(32, 50, 850, 53);
		contentPane.add(textLinhaVermelha);

		JLabel lblMazeBank = new JLabel("MAZE BANK");
		lblMazeBank.setFont(new Font("Sylfaen", Font.PLAIN, 40));
		lblMazeBank.setBackground(UIManager.getColor("Button.background"));
		lblMazeBank.setBounds(94, 30, 236, 53);
		contentPane.add(lblMazeBank);

		JLabel lblOfPetrpolisCity = new JLabel("OF PETRÓPOLIS CITY");
		lblOfPetrpolisCity.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblOfPetrpolisCity.setBackground(UIManager.getColor("Button.background"));
		lblOfPetrpolisCity.setBounds(96, 62, 150, 16);
		contentPane.add(lblOfPetrpolisCity);

		JLabel TextUsuarioCC = new JLabel(cliente.getNome());
		TextUsuarioCC.setForeground(Color.WHITE);
		TextUsuarioCC.setFont(new Font("Lato", Font.BOLD, 18));
		TextUsuarioCC.setBackground(Color.WHITE);
		TextUsuarioCC.setBounds(37, 133, 180, 30);
		contentPane.add(TextUsuarioCC);

		JLabel lblMzBkLogo = new JLabel("logo");
		lblMzBkLogo.setIcon(new ImageIcon("./imagens maze bank/mazebanklogo.png"));
		lblMzBkLogo.setForeground(new Color(0, 0, 0));
		lblMzBkLogo.setFont(new Font("Tahoma", Font.PLAIN, 5));
		lblMzBkLogo.setBounds(32, 23, 60, 60);
		contentPane.add(lblMzBkLogo);

		JLabel lblChequeEsp = new JLabel();
		lblChequeEsp.setForeground(Color.BLACK);
		lblChequeEsp.setFont(new Font("Lato", Font.BOLD, 15));
		lblChequeEsp.setBackground(Color.WHITE);
		lblChequeEsp.setBounds(706, 64, 192, 30);
		contentPane.add(lblChequeEsp);

		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente sair?", "Confirmação de Saída",
						JOptionPane.YES_NO_OPTION);
				if (resposta == JOptionPane.YES_OPTION) {
					dispose();
					TelaContaCorrente conta = new TelaContaCorrente(cp, cp, cliente, contaCorrente, contaCorrente);
					conta.setLocationRelativeTo(conta);
					conta.setVisible(true);
				}
			}
		});
		btnSair.setForeground(Color.WHITE);
		btnSair.setFont(new Font("Lato", Font.BOLD, 14));
		btnSair.setBackground(new Color(233, 65, 69));
		btnSair.setBounds(760, 145, 100, 30);
		contentPane.add(btnSair);

		JLabel lblNumAge = new JLabel(contaCorrente.getNumAgencia());
		lblNumAge.setForeground(Color.WHITE);
		lblNumAge.setFont(new Font("Lato", Font.BOLD, 13));
		lblNumAge.setBackground(Color.WHITE);
		lblNumAge.setBounds(201, 158, 54, 27);
		contentPane.add(lblNumAge);

		JLabel lblNumConta = new JLabel(contaCorrente.getNumeroConta());
		lblNumConta.setForeground(Color.WHITE);
		lblNumConta.setFont(new Font("Lato", Font.BOLD, 13));
		lblNumConta.setBackground(Color.WHITE);
		lblNumConta.setBounds(80, 158, 66, 27);
		contentPane.add(lblNumConta);

		JLabel lblAgncia = new JLabel("Agência:");
		lblAgncia.setForeground(Color.WHITE);
		lblAgncia.setFont(new Font("Lato", Font.BOLD, 13));
		lblAgncia.setBackground(Color.WHITE);
		lblAgncia.setBounds(149, 158, 54, 27);
		contentPane.add(lblAgncia);

		JLabel lblConta = new JLabel("Conta:");
		lblConta.setForeground(Color.WHITE);
		lblConta.setFont(new Font("Lato", Font.BOLD, 13));
		lblConta.setBackground(Color.WHITE);
		lblConta.setBounds(38, 158, 46, 27);
		contentPane.add(lblConta);

		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("./imagens maze bank/mazebankbarra.png"));
		lblNewLabel.setBounds(32, 127, 850, 60);
		contentPane.add(lblNewLabel);
	}

//	public void realizarDeposito() {
//		try {
//			String linha;
//			BufferedReader reader = new BufferedReader(new FileReader("banco.txt"));
//			while ((linha = reader.readLine()) != null) {
//				String[] dados = linha.split(";");
//				double valorDeposito = Double.parseDouble(textValor.getText());
//				Conta contaCorrente = new ContaCorrente();
//				contaCorrente.depositar(valorDeposito);
//
//				// Atualiza o arquivo txt com o novo saldo
//				List<String> linhas = new ArrayList<>();
//
//				String numeroConta = dados[2];
//				ContaEnum tipoConta = ContaEnum.valueOf(dados[0]); // Converte a string para o Enum
//				double saldoConta = Double.parseDouble(dados[6]);
//
//				if (tipoConta == ContaEnum.CORRENTE && numeroConta.equals(contaCorrente.getNumeroConta())) {
//					saldoConta += valorDeposito;
//				}
//
//				dados[6] = String.valueOf(saldoConta);
//				linhas.add(String.join(";", dados)); // Reconstroi a linha com os valores atualizados
//			}
//
//			reader.close();
//
//			// Agora, escreva as linhas atualizadas de volta no arquivo "banco.txt"
//			BufferedWriter writer = new BufferedWriter(new FileWriter("banco.txt"));
//			for (String linhaAtualizada : dados) {
//				writer.write(linhaAtualizada);
//				writer.newLine();
//			}
//
//			writer.close();
//		} catch (IOException e) {
//
//			e.printStackTrace();
//		}
//	}
}