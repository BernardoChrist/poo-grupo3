package br.com.poo.banco.views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class TelaDeposito extends JFrame {

	private JPanel contentPane;
	private JTextField textValor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaDeposito frame = new TelaDeposito();
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
	public TelaDeposito() {
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
		
		JLabel lblChequeEsp = new JLabel("Saldo: R$10.000,00");
		lblChequeEsp.setForeground(Color.BLACK);
		lblChequeEsp.setFont(new Font("Lato", Font.BOLD, 15));
		lblChequeEsp.setBackground(Color.WHITE);
		lblChequeEsp.setBounds(706, 64, 192, 30);
		contentPane.add(lblChequeEsp);
		
		JButton btnSair = new JButton("Sair");
		btnSair.setForeground(Color.WHITE);
		btnSair.setFont(new Font("Lato", Font.BOLD, 14));
		btnSair.setBackground(new Color(233, 65, 69));
		btnSair.setBounds(760, 145, 100, 30);
		contentPane.add(btnSair);
		
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
