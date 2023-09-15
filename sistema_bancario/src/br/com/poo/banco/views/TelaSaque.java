package br.com.poo.banco.views;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

import br.com.poo.banco.contas.Conta;
import br.com.poo.banco.pessoas.Cliente;

import javax.swing.JPasswordField;

public class TelaSaque extends JFrame {

	private JPanel contentPane;
	private JTextField txtValSaq;
	private JPasswordField passwordSenha;

	/**
	 * Create the frame.
	 */
	public TelaSaque(boolean cc, boolean cp, Cliente cliente, Conta contaPoupanca, Conta contaCorrente) {
		setResizable(false);
		setTitle("Sacar");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 930, 630);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(235, 235, 235));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente sair?", "Confirmação de Saída",
						JOptionPane.YES_NO_OPTION);
				if (resposta == JOptionPane.YES_OPTION) {
						dispose();
						TelaContaCorrente contaC = new TelaContaCorrente(cp, cp, cliente, contaCorrente, contaCorrente);
						contaC.setVisible(true);
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

		JLabel TextDigiteoValor = new JLabel("Digite a senha:");
		TextDigiteoValor.setFont(new Font("Lato", Font.BOLD, 14));
		TextDigiteoValor.setBounds(317, 350, 98, 18);
		contentPane.add(TextDigiteoValor);

		JButton ConfirmarButton = new JButton("Confirmar");
		ConfirmarButton.setForeground(new Color(255, 255, 255));
		ConfirmarButton.setBackground(new Color(233, 65, 69));
		ConfirmarButton.setFont(new Font("Lato", Font.BOLD, 14));
		ConfirmarButton.setBounds(347, 494, 220, 60);
		contentPane.add(ConfirmarButton);

		JLabel TextNovoCadastro = new JLabel("Saque");
		TextNovoCadastro.setForeground(new Color(255, 255, 255));
		TextNovoCadastro.setBackground(new Color(255, 255, 255));
		TextNovoCadastro.setBounds(434, 161, 46, 30);
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
		TextUsuarioCC.setBounds(37, 133, 179, 30);
		contentPane.add(TextUsuarioCC);

		JLabel lblMazeBankBarra = new JLabel("");
		lblMazeBankBarra.setIcon(new ImageIcon(
				"./imagens maze bank/mazebankbarra.png"));
		lblMazeBankBarra.setBounds(32, 127, 850, 60);
		contentPane.add(lblMazeBankBarra);

		JLabel lblMzBkLogo = new JLabel("logo");
		lblMzBkLogo.setIcon(new ImageIcon(
				"./imagens maze bank/mazebanklogo.png"));
		lblMzBkLogo.setForeground(new Color(0, 0, 0));
		lblMzBkLogo.setFont(new Font("Tahoma", Font.PLAIN, 5));
		lblMzBkLogo.setBounds(32, 23, 60, 60);
		contentPane.add(lblMzBkLogo);

		JLabel TextSaldoCC = new JLabel("Saldo: " + contaCorrente.getSaldoConta());
		TextSaldoCC.setForeground(new Color(0, 0, 0));
		TextSaldoCC.setFont(new Font("Lato", Font.BOLD, 15));
		TextSaldoCC.setBackground(Color.WHITE);
		TextSaldoCC.setBounds(706, 64, 256, 30);
		contentPane.add(TextSaldoCC);

		JLabel TextDigiteoValor_1 = new JLabel("Digite o valor que deseja sacar:");
		TextDigiteoValor_1.setFont(new Font("Lato", Font.BOLD, 14));
		TextDigiteoValor_1.setBounds(317, 285, 197, 18);
		contentPane.add(TextDigiteoValor_1);

		txtValSaq = new JTextField();
		txtValSaq.setColumns(10);
		txtValSaq.setBounds(314, 306, 286, 20);
		contentPane.add(txtValSaq);

		passwordSenha = new JPasswordField();
		passwordSenha.setBounds(314, 368, 286, 20);
		contentPane.add(passwordSenha);
	}
}
