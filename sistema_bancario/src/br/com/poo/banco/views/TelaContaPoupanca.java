package br.com.poo.banco.views;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

public class TelaContaPoupanca extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaContaPoupanca frame = new TelaContaPoupanca();
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
	public TelaContaPoupanca() {
		setResizable(false);
		setTitle("Conta Poupança");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 930, 630);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(235, 235, 235));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnSaqueCP = new JButton("Saque");
		btnSaqueCP.setBackground(new Color(233, 65, 69));
		btnSaqueCP.setForeground(new Color(255, 255, 255));
		btnSaqueCP.setFont(new Font("Lato", Font.BOLD, 14));
		btnSaqueCP.setBounds(540, 240, 320, 60);
		contentPane.add(btnSaqueCP);
		
		JButton btnTransCP = new JButton("Tranferencia");
		btnTransCP.setBackground(new Color(233, 65, 69));
		btnTransCP.setForeground(new Color(255, 255, 255));
		btnTransCP.setFont(new Font("Lato", Font.BOLD, 14));
		btnTransCP.setBounds(54, 340, 320, 60);
		contentPane.add(btnTransCP);
		
		JButton btnDepoCP = new JButton("Deposito");
		btnDepoCP.setBackground(new Color(233, 65, 69));
		btnDepoCP.setForeground(new Color(255, 255, 255));
		btnDepoCP.setFont(new Font("Lato", Font.BOLD, 14));
		btnDepoCP.setBounds(54, 240, 320, 60);
		contentPane.add(btnDepoCP);
		
		JButton btnContaCorrente = new JButton("Ir para Corrente");
		btnContaCorrente.setBackground(new Color(233, 65, 69));
		btnContaCorrente.setForeground(new Color(255, 255, 255));
		btnContaCorrente.setFont(new Font("Lato", Font.BOLD, 14));
		btnContaCorrente.setBounds(540, 440, 320, 60);
		contentPane.add(btnContaCorrente);
		
		JButton btnExtRend = new JButton("Extrato");
		btnExtRend.setBackground(new Color(233, 65, 69));
		btnExtRend.setForeground(new Color(255, 255, 255));
		btnExtRend.setFont(new Font("Lato", Font.BOLD, 14));
		btnExtRend.setBounds(54, 440, 320, 60);
		contentPane.add(btnExtRend);
		
		JButton btnSegVida = new JButton("Seg. de Vida");
		btnSegVida.setBackground(new Color(233, 65, 69));
		btnSegVida.setForeground(new Color(255, 255, 255));
		btnSegVida.setFont(new Font("Lato", Font.BOLD, 14));
		btnSegVida.setBounds(540, 340, 320, 60);
		contentPane.add(btnSegVida);
		
		JLabel TextContaCorrente = new JLabel("Conta Poupança");
		TextContaCorrente.setForeground(new Color(255, 255, 255));
		TextContaCorrente.setBackground(new Color(255, 255, 255));
		TextContaCorrente.setBounds(401, 161, 112, 30);
		TextContaCorrente.setFont(new Font("Lato", Font.BOLD, 15));
		contentPane.add(TextContaCorrente);

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
		
		JLabel TextUsuarioCP = new JLabel("(Usuario)");
		TextUsuarioCP.setForeground(Color.WHITE);
		TextUsuarioCP.setFont(new Font("Lato", Font.BOLD, 18));
		TextUsuarioCP.setBackground(Color.WHITE);
		TextUsuarioCP.setBounds(37, 133, 179, 30);
		contentPane.add(TextUsuarioCP);
		
		JLabel lblMzBkLogo = new JLabel("logo");
		lblMzBkLogo.setIcon(new ImageIcon("C:\\mazebanklogo.png"));
		lblMzBkLogo.setForeground(new Color(0, 0, 0));
		lblMzBkLogo.setFont(new Font("Tahoma", Font.PLAIN, 5));
		lblMzBkLogo.setBounds(32, 23, 60, 60);
		contentPane.add(lblMzBkLogo);
		
		JLabel TextSaldoCP = new JLabel("Saldo: R$10.000,00");
		TextSaldoCP.setForeground(new Color(0, 0, 0));
		TextSaldoCP.setFont(new Font("Lato", Font.BOLD, 15));
		TextSaldoCP.setBackground(Color.WHITE);
		TextSaldoCP.setBounds(706, 64, 256, 30);
		contentPane.add(TextSaldoCP);
		
		JButton btnSair_1 = new JButton("Sair");
		btnSair_1.setForeground(Color.WHITE);
		btnSair_1.setFont(new Font("Lato", Font.BOLD, 14));
		btnSair_1.setBackground(new Color(233, 65, 69));
		btnSair_1.setBounds(760, 145, 100, 30);
		contentPane.add(btnSair_1);
		
		JLabel lblNumAge = new JLabel("1234-5");
		lblNumAge.setForeground(Color.WHITE);
		lblNumAge.setFont(new Font("Lato", Font.BOLD, 13));
		lblNumAge.setBackground(Color.WHITE);
		lblNumAge.setBounds(201, 158, 54, 27);
		contentPane.add(lblNumAge);
		
		JLabel lblNumConta = new JLabel("321654-7");
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
		lblNewLabel.setIcon(new ImageIcon("C:\\mazebankbarra.png"));
		lblNewLabel.setBounds(32, 127, 850, 60);
		contentPane.add(lblNewLabel);
	}
}
