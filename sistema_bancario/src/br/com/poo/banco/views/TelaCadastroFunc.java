package br.com.poo.banco.views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JPasswordField;
import javax.swing.UIManager;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaCadastroFunc extends JFrame {

	private JPanel contentPane;
	private JTextField textNomeFu;
	private JTextField textDatNascFu;
	private JTextField textCpfFu;
	private JTextField textAgeFu;
	private JPasswordField passwordSenhaFu;
	private JPasswordField passwordConSenhaFu;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastroFunc frame = new TelaCadastroFunc();
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
	public TelaCadastroFunc() {
		setResizable(false);
		setTitle("Novo Funcionario");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 930, 630);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(235, 235, 235));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel TextNome_5 = new JLabel("Nome");
		TextNome_5.setFont(new Font("Tahoma", Font.BOLD, 13));
		TextNome_5.setBounds(34, 241, 45, 13);
		contentPane.add(TextNome_5);
		
		textNomeFu = new JTextField();
		textNomeFu.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textNomeFu.setColumns(10);
		textNomeFu.setBounds(32, 260, 286, 20);
		contentPane.add(textNomeFu);
		
		JButton btnCriaConta = new JButton("Criar Conta");
		btnCriaConta.setForeground(new Color(255, 255, 255));
		btnCriaConta.setFont(new Font("Lato", Font.BOLD, 16));
		btnCriaConta.setBackground(new Color(233, 65, 69));
		btnCriaConta.setBounds(642, 502, 200, 60);
		contentPane.add(btnCriaConta);
		
		JLabel TextNome_1_2 = new JLabel("Data de Nascimento");
		TextNome_1_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		TextNome_1_2.setBounds(34, 334, 136, 13);
		contentPane.add(TextNome_1_2);
		
		textDatNascFu = new JTextField();
		textDatNascFu.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textDatNascFu.setColumns(10);
		textDatNascFu.setBounds(32, 351, 286, 20);
		contentPane.add(textDatNascFu);
		
		JLabel TextNome_2_1 = new JLabel("CPF");
		TextNome_2_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		TextNome_2_1.setBounds(34, 290, 45, 13);
		contentPane.add(TextNome_2_1);
		
		textCpfFu = new JTextField();
		textCpfFu.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textCpfFu.setColumns(10);
		textCpfFu.setBounds(32, 307, 286, 20);
		contentPane.add(textCpfFu);
		
		JLabel TextNome_3_1 = new JLabel("Senha");
		TextNome_3_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		TextNome_3_1.setBounds(625, 291, 45, 13);
		contentPane.add(TextNome_3_1);
		
		JLabel TextNome_4_1 = new JLabel("Confirmação de Senha");
		TextNome_4_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		TextNome_4_1.setBounds(625, 335, 150, 13);
		contentPane.add(TextNome_4_1);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnVoltar.setForeground(new Color(255, 255, 255));
		btnVoltar.setFont(new Font("Lato", Font.BOLD, 16));
		btnVoltar.setBackground(new Color(233, 65, 69));
		btnVoltar.setBounds(97, 502, 200, 60);
		contentPane.add(btnVoltar);
		
		JLabel TextNome_4_1_1 = new JLabel("Agencia");
		TextNome_4_1_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		TextNome_4_1_1.setBounds(625, 241, 150, 16);
		contentPane.add(TextNome_4_1_1);
		
		textAgeFu = new JTextField();
		textAgeFu.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textAgeFu.setColumns(10);
		textAgeFu.setBounds(623, 261, 259, 20);
		contentPane.add(textAgeFu);
		
		passwordSenhaFu = new JPasswordField();
		passwordSenhaFu.setBounds(625, 308, 257, 20);
		contentPane.add(passwordSenhaFu);
		
		passwordConSenhaFu = new JPasswordField();
		passwordConSenhaFu.setBounds(625, 352, 257, 20);
		contentPane.add(passwordConSenhaFu);
		
		JLabel TextNovoCadastro = new JLabel("Cadastro de Funcionário");
		TextNovoCadastro.setForeground(new Color(255, 255, 255));
		TextNovoCadastro.setBackground(new Color(255, 255, 255));
		TextNovoCadastro.setBounds(373, 161, 167, 30);
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
		
		JLabel lblStaff = new JLabel("(STAFF)");
		lblStaff.setFont(new Font("Sylfaen", Font.PLAIN, 14));
		lblStaff.setBackground(UIManager.getColor("Button.background"));
		lblStaff.setBounds(260, 64, 60, 21);
		contentPane.add(lblStaff);
		
		JLabel lblOfPetrpolisCity = new JLabel("OF PETRÓPOLIS CITY");
		lblOfPetrpolisCity.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblOfPetrpolisCity.setBackground(UIManager.getColor("Button.background"));
		lblOfPetrpolisCity.setBounds(96, 62, 150, 16);
		contentPane.add(lblOfPetrpolisCity);
		
		JLabel TextUsuarioCadastrador = new JLabel("(Usuario Cadastrador)");
		TextUsuarioCadastrador.setForeground(Color.WHITE);
		TextUsuarioCadastrador.setFont(new Font("Lato", Font.BOLD, 18));
		TextUsuarioCadastrador.setBackground(Color.WHITE);
		TextUsuarioCadastrador.setBounds(37, 133, 179, 30);
		contentPane.add(TextUsuarioCadastrador);
		
		JLabel lblMazeBankBarra = new JLabel("");
		lblMazeBankBarra.setIcon(new ImageIcon("./imagens maze bank/mazebankbarra.png"));
		lblMazeBankBarra.setBounds(32, 127, 850, 60);
		contentPane.add(lblMazeBankBarra);
		
		JLabel lblMzBkLogo = new JLabel("logo");
		lblMzBkLogo.setIcon(new ImageIcon("./imagens maze bank/mazebanklogo.png"));
		lblMzBkLogo.setForeground(new Color(0, 0, 0));
		lblMzBkLogo.setFont(new Font("Tahoma", Font.PLAIN, 5));
		lblMzBkLogo.setBounds(32, 23, 60, 60);
		contentPane.add(lblMzBkLogo);
		
	}
}
