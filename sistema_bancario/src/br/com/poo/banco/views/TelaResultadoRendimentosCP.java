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

public class TelaResultadoRendimentosCP extends JFrame {

	private JPanel contentPane;
	private JTextField txtValRenDps;
	private JTextField txtValRenAnts;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaResultadoRendimentosCP frame = new TelaResultadoRendimentosCP();
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
	public TelaResultadoRendimentosCP() {
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

		JButton btnConRen = new JButton("Confirmar Investimento");
		btnConRen.setForeground(new Color(255, 255, 255));
		btnConRen.setFont(new Font("Lato", Font.BOLD, 14));
		btnConRen.setBackground(new Color(233, 65, 69));
		btnConRen.setBounds(573, 462, 220, 60);
		contentPane.add(btnConRen);

		txtValRenDps = new JTextField();
		txtValRenDps.setEditable(false);
		txtValRenDps.setBounds(314, 309, 286, 20);
		contentPane.add(txtValRenDps);
		txtValRenDps.setColumns(10);

		txtValRenAnts = new JTextField();
		txtValRenAnts.setEditable(false);
		txtValRenAnts.setColumns(10);
		txtValRenAnts.setBounds(314, 354, 286, 20);
		contentPane.add(txtValRenAnts);
		

		JButton btnSimRen = new JButton("Simular Novamente");
		btnSimRen.setForeground(new Color(255, 255, 255));
		btnSimRen.setFont(new Font("Lato", Font.BOLD, 14));
		btnSimRen.setBackground(new Color(233, 65, 69));
		btnSimRen.setBounds(130, 462, 220, 60);
		contentPane.add(btnSimRen);

		JLabel TextRendimento = new JLabel("Nessas condições, seu dinheiro vai render:");
		TextRendimento.setFont(new Font("Lato", Font.BOLD, 14));
		TextRendimento.setBounds(326, 288, 262, 20);
		contentPane.add(TextRendimento);

		JLabel ValorRendimento = new JLabel("Valor do rendimento:");
		ValorRendimento.setFont(new Font("Lato", Font.BOLD, 14));
		ValorRendimento.setBounds(390, 332, 133, 20);
		contentPane.add(ValorRendimento);

		JLabel TextNovoCadastro = new JLabel("Resultados do Rendimento");
		TextNovoCadastro.setForeground(new Color(255, 255, 255));
		TextNovoCadastro.setBackground(new Color(255, 255, 255));
		TextNovoCadastro.setBounds(364, 161, 185, 30);
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
