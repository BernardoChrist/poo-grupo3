package br.com.poo.banco;

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
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(85, 106, 95));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 25));
		lblNewLabel.setBounds(180, 7, 69, 44);
		contentPane.add(lblNewLabel);
		
		JTextPane textCPF = new JTextPane();
		textCPF.setBounds(100, 139, 228, 20);
		contentPane.add(textCPF);
		
		JLabel lblNewLabel_1_1 = new JLabel("CPF");
		lblNewLabel_1_1.setFont(new Font("Calibri", Font.PLAIN, 14));
		lblNewLabel_1_1.setBounds(100, 117, 27, 28);
		contentPane.add(lblNewLabel_1_1);
		
		pwd = new JPasswordField();
		pwd.setBounds(100, 182, 228, 20);
		contentPane.add(pwd);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Senha");
		lblNewLabel_1_1_1.setFont(new Font("Calibri", Font.PLAIN, 12));
		lblNewLabel_1_1_1.setBounds(100, 161, 48, 28);
		contentPane.add(lblNewLabel_1_1_1);
		
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
		
		JComboBox comboBoxOpcoes = new JComboBox();
		comboBoxOpcoes.setToolTipText("<Selecione uma das opções >");
		comboBoxOpcoes.setModel(new DefaultComboBoxModel(new String[] {"<Selecione uma das opções >", "Cliente", "Funcionário", "Gerente", "Diretor", "Presidente"}));
		comboBoxOpcoes.setMaximumRowCount(6);
		comboBoxOpcoes.setBounds(100, 74, 228, 22);
		contentPane.add(comboBoxOpcoes);
	}
}
