package br.com.poo.banco.views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextPane;
import java.awt.Color;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFormattedTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class TelaLogin extends JFrame {

	private JPanel contentPane;
	private JPasswordField pwd;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaLogin frame = new TelaLogin();
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
	public TelaLogin() {
		setTitle("Tela Login");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(85, 106, 95));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel TextLogin = new JLabel("Login");
		TextLogin.setFont(new Font("Arial", Font.PLAIN, 25));
		TextLogin.setBounds(180, 7, 69, 44);
		contentPane.add(TextLogin);
		
		JTextPane textCPF = new JTextPane();
		textCPF.setBounds(101, 109, 228, 20);
		contentPane.add(textCPF);
		
		JLabel TextUsuario = new JLabel("Usuario");
		TextUsuario.setFont(new Font("Calibri", Font.PLAIN, 14));
		TextUsuario.setBounds(101, 87, 48, 28);
		contentPane.add(TextUsuario);
		
		pwd = new JPasswordField();
		pwd.setBounds(101, 152, 228, 20);
		contentPane.add(pwd);
		
		JLabel TextSenha = new JLabel("Senha");
		TextSenha.setFont(new Font("Calibri", Font.PLAIN, 12));
		TextSenha.setBounds(101, 131, 48, 28);
		contentPane.add(TextSenha);
		
		JButton btnBotaozin = new JButton("Entrar");
		btnBotaozin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String cpf = textCPF.getText();
				String senha = new String(pwd.getPassword());
				if(cpf!= null && senha != null && !cpf.isEmpty() && !senha.isEmpty()) {
					JOptionPane.showMessageDialog(btnBotaozin, "Bem-Vindo!"); 
				}
				
				else {
					JOptionPane.showMessageDialog(btnBotaozin, "Todos os campos devem ser preenchidos.", "Aviso!", JOptionPane.WARNING_MESSAGE);
				}
				
			}
		});
		btnBotaozin.setBounds(178, 224, 69, 23);
		contentPane.add(btnBotaozin);
		
		JLabel LinkNovoCadastro = new JLabel("Novo Cadastro");
		LinkNovoCadastro.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		LinkNovoCadastro.setForeground(new Color(0, 0, 160));
		LinkNovoCadastro.setBackground(new Color(0, 0, 160));
		LinkNovoCadastro.setFont(new Font("Tahoma", Font.PLAIN, 9));
		LinkNovoCadastro.setBounds(101, 178, 109, 13);
		contentPane.add(LinkNovoCadastro);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setToolTipText("Cliente\r\nFuncionario\r\nGerente\r\nDiretor\r\nPresidente");
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Cliente", "Funcionario", "Gerente", "Diretor", "Presidente"}));
		comboBox.setSelectedIndex(5);
		comboBox.setBounds(101, 58, 148, 21);
		contentPane.add(comboBox);
	}
}
