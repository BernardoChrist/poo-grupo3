package br.com.poo.banco.views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;

public class TelaContaCorrente extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaContaCorrente frame = new TelaContaCorrente();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaContaCorrente() {
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
		btnSaqueCP.setForeground(new Color(255, 255, 255));
		btnSaqueCP.setBackground(new Color(233, 65, 69));
		btnSaqueCP.setFont(new Font("Lato", Font.BOLD, 14));
		btnSaqueCP.setBounds(540, 240, 320, 60);
		contentPane.add(btnSaqueCP);
		
		JButton btnTransferenciaCC = new JButton("Tranferencia");
		btnTransferenciaCC.setForeground(new Color(255, 255, 255));
		btnTransferenciaCC.setBackground(new Color(233, 65, 69));
		btnTransferenciaCC.setFont(new Font("Lato", Font.BOLD, 14));
		btnTransferenciaCC.setBounds(54, 340, 320, 60);
		contentPane.add(btnTransferenciaCC);
		
		JButton btnDepositoCC = new JButton("Deposito");
		btnDepositoCC.setForeground(new Color(255, 255, 255));
		btnDepositoCC.setBackground(new Color(233, 65, 69));
		btnDepositoCC.setFont(new Font("Lato", Font.BOLD, 14));
		btnDepositoCC.setBounds(54, 240, 320, 60);
		contentPane.add(btnDepositoCC);
		
		JButton btnConPou = new JButton("Ir para Poupança");
		btnConPou.setEnabled(false);
		btnConPou.setForeground(new Color(255, 255, 255));
		btnConPou.setBackground(new Color(233, 65, 69));
		btnConPou.setFont(new Font("Lato", Font.BOLD, 14));
		btnConPou.setBounds(540, 440, 320, 60);
		contentPane.add(btnConPou);
		
		JButton btnExtrato = new JButton("Extrato");
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
		
		JLabel TextUsuarioCC = new JLabel("(Usuario)");
		TextUsuarioCC.setForeground(Color.WHITE);
		TextUsuarioCC.setFont(new Font("Lato", Font.BOLD, 18));
		TextUsuarioCC.setBackground(Color.WHITE);
		TextUsuarioCC.setBounds(37, 133, 180, 30);
		contentPane.add(TextUsuarioCC);
		
		JLabel lblMzBkLogo = new JLabel("logo");
		lblMzBkLogo.setIcon(new ImageIcon("C:\\mazebanklogo.png"));
		lblMzBkLogo.setForeground(new Color(0, 0, 0));
		lblMzBkLogo.setFont(new Font("Tahoma", Font.PLAIN, 5));
		lblMzBkLogo.setBounds(32, 23, 60, 60);
		contentPane.add(lblMzBkLogo);
		
		JLabel TextSaldoCC = new JLabel("Cheque Esp: R$500,00");
		TextSaldoCC.setForeground(new Color(0, 0, 0));
		TextSaldoCC.setFont(new Font("Lato", Font.BOLD, 15));
		TextSaldoCC.setBackground(Color.WHITE);
		TextSaldoCC.setBounds(707, 71, 211, 30);
		contentPane.add(TextSaldoCC);
		
		JLabel lblChequeEsp = new JLabel("Saldo: R$10.000,00");
		lblChequeEsp.setForeground(Color.BLACK);
		lblChequeEsp.setFont(new Font("Lato", Font.BOLD, 15));
		lblChequeEsp.setBackground(Color.WHITE);
		lblChequeEsp.setBounds(727, 53, 192, 30);
		contentPane.add(lblChequeEsp);
		
		JButton btnSair = new JButton("Sair");
		btnSair.setForeground(Color.WHITE);
		btnSair.setFont(new Font("Lato", Font.BOLD, 14));
		btnSair.setBackground(new Color(233, 65, 69));
		btnSair.setBounds(760, 145, 100, 30);
		contentPane.add(btnSair);
		
		JLabel lblConta = new JLabel("Conta: 123456-7");
		lblConta.setForeground(Color.WHITE);
		lblConta.setFont(new Font("Lato", Font.BOLD, 13));
		lblConta.setBackground(Color.WHITE);
		lblConta.setBounds(38, 155, 165, 30);
		contentPane.add(lblConta);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\mazebankbarra.png"));
		lblNewLabel.setBounds(32, 127, 850, 60);
		contentPane.add(lblNewLabel);
		
	}
}
