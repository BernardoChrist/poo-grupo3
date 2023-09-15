package br.com.poo.banco.views;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

public class TelaRendimentosCP extends JFrame {

	private JPanel contentPane;
	private JTextField txtValRen;
	private JTextField txtDurRen;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaRendimentosCP frame = new TelaRendimentosCP();
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
	public TelaRendimentosCP() {
		setResizable(false);
		setTitle("Rendimentos Conta Poupança");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 930, 630);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(235, 235, 235));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));



		setContentPane(contentPane);
		contentPane.setLayout(null);
		
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

		
		JLabel TextTaxaMensal = new JLabel("Taxa: 0,60% a.m");
		TextTaxaMensal.setFont(new Font("Lato", Font.BOLD, 14));
		TextTaxaMensal.setForeground(new Color(233, 65, 69));
		TextTaxaMensal.setBounds(401, 259, 100, 21);
		contentPane.add(TextTaxaMensal);
		
		JButton btnSimRen = new JButton("Simular Rendimentos");
		btnSimRen.setForeground(new Color(255, 255, 255));
		btnSimRen.setFont(new Font("Lato", Font.BOLD, 14));
		btnSimRen.setBackground(new Color(233, 65, 69));
		btnSimRen.setBounds(347, 435, 220, 60);
		contentPane.add(btnSimRen);
		
		txtValRen = new JTextField();
		txtValRen.setBounds(314, 309, 286, 20);
		contentPane.add(txtValRen);
		txtValRen.setColumns(10);
		
		txtDurRen = new JTextField();
		txtDurRen.setColumns(10);
		txtDurRen.setBounds(314, 354, 286, 20);
		contentPane.add(txtDurRen);
		
		JLabel TextValorInvestido = new JLabel("Valor investido");
		TextValorInvestido.setFont(new Font("Lato", Font.BOLD, 14));
		TextValorInvestido.setBounds(407, 288, 99, 20);
		contentPane.add(TextValorInvestido);
		
		JLabel TextDuracao = new JLabel("Duração (em dias)");
		TextDuracao.setFont(new Font("Lato", Font.BOLD, 14));
		TextDuracao.setBounds(401, 332, 111, 20);
		contentPane.add(TextDuracao);
		
		JLabel TextNovoCadastro = new JLabel("Rendimentos da Poupança");
		TextNovoCadastro.setForeground(new Color(255, 255, 255));
		TextNovoCadastro.setBackground(new Color(255, 255, 255));
		TextNovoCadastro.setBounds(365, 161, 184, 30);
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
		
		JLabel TextUsuarioCP = new JLabel("(Usuario)");
		TextUsuarioCP.setForeground(Color.WHITE);
		TextUsuarioCP.setFont(new Font("Lato", Font.BOLD, 18));
		TextUsuarioCP.setBackground(Color.WHITE);
		TextUsuarioCP.setBounds(37, 133, 180, 30);
		contentPane.add(TextUsuarioCP);
		
		JLabel lblMzBkLogo = new JLabel("logo");
		lblMzBkLogo.setIcon(new ImageIcon("C:\\\\dev\\\\POO\\\\Workspace\\\\poo-grupo3\\\\sistema_bancario\\\\imagens maze bank\\\\mazebanklogo.png"));
		lblMzBkLogo.setForeground(new Color(0, 0, 0));
		lblMzBkLogo.setFont(new Font("Tahoma", Font.PLAIN, 5));
		lblMzBkLogo.setBounds(32, 23, 60, 60);
		contentPane.add(lblMzBkLogo);
		
		JLabel lblSaldoCP = new JLabel("Saldo: R$10.000,00");
		lblSaldoCP.setForeground(Color.BLACK);
		lblSaldoCP.setFont(new Font("Lato", Font.BOLD, 15));
		lblSaldoCP.setBackground(Color.WHITE);
		lblSaldoCP.setBounds(704, 64, 192, 30);
		contentPane.add(lblSaldoCP);
		
		JButton btnSair = new JButton("Sair");
		btnSair.setForeground(Color.WHITE);
		btnSair.setFont(new Font("Lato", Font.BOLD, 14));
		btnSair.setBackground(new Color(233, 65, 69));
		btnSair.setBounds(760, 145, 100, 30);
		contentPane.add(btnSair);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\\\dev\\\\POO\\\\Workspace\\\\poo-grupo3\\\\sistema_bancario\\\\imagens maze bank\\\\mazebankbarra.png"));
		lblNewLabel.setBounds(32, 127, 850, 60);
		contentPane.add(lblNewLabel);
	}

}
