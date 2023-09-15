package br.com.poo.banco.views;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class TelaTransferencia extends JFrame {

	private JPanel contentPane;
	private JTextField txtValor;
	private JTextField txtNumAgeDes;
	private JTextField texNumConDes;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaTransferencia frame = new TelaTransferencia();
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
	public TelaTransferencia() {
		setResizable(false);
		setTitle("Transferir");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 930, 630);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(235, 235, 235));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		txtValor = new JTextField();
		txtValor.setColumns(10);
		txtValor.setBounds(314, 354, 286, 20);
		contentPane.add(txtValor);

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

		JButton ConfirmarButton = new JButton("Confirmar");
		ConfirmarButton.setForeground(new Color(255, 255, 255));
		ConfirmarButton.setBackground(new Color(233, 65, 69));
		ConfirmarButton.setFont(new Font("Lato", Font.BOLD, 14));
		ConfirmarButton.setBounds(347, 495, 220, 60);
		contentPane.add(ConfirmarButton);

		JLabel TextNumeroConta = new JLabel("Número da conta:");
		TextNumeroConta.setFont(new Font("Lato", Font.BOLD, 14));
		TextNumeroConta.setBounds(399, 241, 115, 20);
		contentPane.add(TextNumeroConta);

		txtNumAgeDes = new JTextField();
		txtNumAgeDes.setBounds(314, 309, 286, 20);
		contentPane.add(txtNumAgeDes);
		txtNumAgeDes.setColumns(10);

		JLabel TextNovoCadastro = new JLabel("Transferência");
		TextNovoCadastro.setForeground(new Color(255, 255, 255));
		TextNovoCadastro.setBackground(new Color(255, 255, 255));
		TextNovoCadastro.setBounds(410, 161, 94, 30);
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
		lblMzBkLogo.setIcon(new ImageIcon(
				"./imagens maze bank/mazebanklogo.png"));
		lblMzBkLogo.setForeground(new Color(0, 0, 0));
		lblMzBkLogo.setFont(new Font("Tahoma", Font.PLAIN, 5));
		lblMzBkLogo.setBounds(32, 23, 60, 60);
		contentPane.add(lblMzBkLogo);

		JLabel lblChequeEsp = new JLabel("Saldo: R$10.000,00");
		lblChequeEsp.setForeground(Color.BLACK);
		lblChequeEsp.setFont(new Font("Lato", Font.BOLD, 15));
		lblChequeEsp.setBackground(Color.WHITE);
		lblChequeEsp.setBounds(704, 64, 192, 30);
		contentPane.add(lblChequeEsp);

		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
<<<<<<< HEAD
				dispose();
				TelaLogin log = new TelaLogin();
				log.setVisible(true);
				log.setLocationRelativeTo(log);
=======
				int resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente sair?", "Confirmação de Saída",
						JOptionPane.YES_NO_OPTION);
				if (resposta == JOptionPane.YES_OPTION) {
//						dispose();
//						TelaContaCorrente contaC = new TelaContaCorrente();
//						contaC.setVisible(true);
				}
>>>>>>> bf2c53c96fb663df12f87049d0a48b3462d18bf3
			}
		});
		btnSair.setForeground(Color.WHITE);
		btnSair.setFont(new Font("Lato", Font.BOLD, 14));
		btnSair.setBackground(new Color(233, 65, 69));
		btnSair.setBounds(760, 145, 100, 30);
		contentPane.add(btnSair);

		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(
				"./imagens maze bank/mazebankbarra.png"));
		lblNewLabel.setBounds(32, 127, 850, 60);
		contentPane.add(lblNewLabel);

		texNumConDes = new JTextField();
		texNumConDes.setColumns(10);
		texNumConDes.setBounds(314, 261, 286, 20);
		contentPane.add(texNumConDes);

		JLabel lblNmeroDaAgncia = new JLabel("Número da Agência:");
		lblNmeroDaAgncia.setFont(new Font("Lato", Font.BOLD, 14));
		lblNmeroDaAgncia.setBounds(391, 291, 135, 20);
		contentPane.add(lblNmeroDaAgncia);

		JLabel TextNumeroConta_1_1 = new JLabel("Valor da Transferência:");
		TextNumeroConta_1_1.setFont(new Font("Lato", Font.BOLD, 14));
		TextNumeroConta_1_1.setBounds(382, 336, 150, 20);
		contentPane.add(TextNumeroConta_1_1);

		JLabel TextNumeroConta_1_1_1 = new JLabel("Digite a senha:");
		TextNumeroConta_1_1_1.setFont(new Font("Lato", Font.BOLD, 14));
		TextNumeroConta_1_1_1.setBounds(410, 385, 94, 20);
		contentPane.add(TextNumeroConta_1_1_1);

		passwordField = new JPasswordField();
		passwordField.setBounds(314, 402, 286, 20);
		contentPane.add(passwordField);
	}
}
