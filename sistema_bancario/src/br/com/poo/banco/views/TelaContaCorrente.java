package br.com.poo.banco.views;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

import br.com.poo.banco.contas.Conta;
import br.com.poo.banco.pessoas.Cliente;

public class TelaContaCorrente extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;


	/**
	 * Create the frame.
	 */
	public TelaContaCorrente(boolean cc, boolean cp, Cliente cliente, Conta contaPoupanca, Conta contaCorrente) {
		setResizable(false);
		setTitle("Conta Corrente");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 930, 630);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(235, 235, 235));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnSaqueCP = new JButton("Saque");
		btnSaqueCP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				TelaSaque saque = new TelaSaque(cp, cp, cliente, contaCorrente, contaCorrente);
				saque.setVisible(true);
			}
		});
		btnSaqueCP.setForeground(new Color(255, 255, 255));
		btnSaqueCP.setBackground(new Color(233, 65, 69));
		btnSaqueCP.setFont(new Font("Lato", Font.BOLD, 14));
		btnSaqueCP.setBounds(540, 240, 320, 60);
		contentPane.add(btnSaqueCP);
		
		JButton btnTransferenciaCC = new JButton("Transferência");
		btnTransferenciaCC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				TelaTransferencia transf = new TelaTransferencia(cp, cp, cliente, contaCorrente, contaCorrente);
				transf.setVisible(true);
			}
		});
		btnTransferenciaCC.setForeground(new Color(255, 255, 255));
		btnTransferenciaCC.setBackground(new Color(233, 65, 69));
		btnTransferenciaCC.setFont(new Font("Lato", Font.BOLD, 14));
		btnTransferenciaCC.setBounds(54, 340, 320, 60);
		contentPane.add(btnTransferenciaCC);
		
		JButton btnDepositoCC = new JButton("Depósito");
		btnDepositoCC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				TelaDeposito deposito = new TelaDeposito(cp, cp, cliente, contaCorrente, contaCorrente);
				deposito.setVisible(true);
			}
		});
		btnDepositoCC.setForeground(new Color(255, 255, 255));
		btnDepositoCC.setBackground(new Color(233, 65, 69));
		btnDepositoCC.setFont(new Font("Lato", Font.BOLD, 14));
		btnDepositoCC.setBounds(54, 240, 320, 60);
		contentPane.add(btnDepositoCC);
		
		JButton btnConPou = new JButton("Ir para Poupança");
		btnConPou.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				TelaContaPoupanca tcp = new TelaContaPoupanca(cp, cp, cliente, contaCorrente);
				tcp.setVisible(true);
			}
		});
		btnConPou.setForeground(new Color(255, 255, 255));
		btnConPou.setBackground(new Color(233, 65, 69));
		btnConPou.setFont(new Font("Lato", Font.BOLD, 14));
		btnConPou.setBounds(540, 440, 320, 60);
		contentPane.add(btnConPou);
		
		JButton btnExtrato = new JButton("Extrato");
		btnExtrato.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				TelaExtratoCC extrato = new TelaExtratoCC(cp, cp, cliente, contaCorrente, contaCorrente);
				extrato.setVisible(true);
			}
		});
		btnExtrato.setForeground(new Color(255, 255, 255));
		btnExtrato.setBackground(new Color(233, 65, 69));
		btnExtrato.setFont(new Font("Lato", Font.BOLD, 14));
		btnExtrato.setBounds(54, 440, 320, 60);
		contentPane.add(btnExtrato);
		
		JButton btnSegVida = new JButton("Seg. de Vida");
		btnSegVida.setForeground(new Color(255, 255, 255));
		btnSegVida.setBackground(new Color(233, 65, 69));
		btnSegVida.setFont(new Font("Lato", Font.BOLD, 14));
		btnSegVida.setBounds(540, 340, 320, 60);
		contentPane.add(btnSegVida);
		
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
		
		JLabel lblChequeEsp = new JLabel("Saldo: R$" + contaCorrente.getSaldoConta());
		lblChequeEsp.setForeground(Color.BLACK);
		lblChequeEsp.setFont(new Font("Lato", Font.BOLD, 15));
		lblChequeEsp.setBackground(Color.WHITE);
		lblChequeEsp.setBounds(727, 53, 192, 30);
		contentPane.add(lblChequeEsp);
		
		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente sair?", "Confirmação de Saída", JOptionPane.YES_NO_OPTION);
                if (resposta == JOptionPane.YES_OPTION) {
						dispose();
						TelaLogin login = new TelaLogin();
						login.setVisible(true);
						}
		}});
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
}
