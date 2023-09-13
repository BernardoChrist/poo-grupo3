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

public class TelaCadastroFunc extends JFrame {

	private JPanel contentPane;
	private JTextField NomeField;
	private JTextField NascField;
	private JTextField CpfField;
	private JPasswordField SenhaField;
	private JPasswordField ConfirmacaoSenhaField;
	private JTextField AgenciaField;

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
		setTitle("Novo Cadastro Funcionario");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 360, 450);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(85, 106, 95));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel TextNovoCadastroGer = new JLabel("Novo Cadastro de Funcionario");
		TextNovoCadastroGer.setBounds(75, 10, 194, 16);
		TextNovoCadastroGer.setFont(new Font("Tahoma", Font.BOLD, 13));
		contentPane.add(TextNovoCadastroGer);
		
		JLabel TextNome = new JLabel("Nome");
		TextNome.setBounds(22, 30, 45, 13);
		contentPane.add(TextNome);
		
		JLabel TextCpf = new JLabel("Cpf");
		TextCpf.setBounds(22, 121, 45, 13);
		contentPane.add(TextCpf);
		
		JLabel TextDtNascimento = new JLabel("Data de Nacimento");
		TextDtNascimento.setBounds(22, 76, 86, 13);
		contentPane.add(TextDtNascimento);
		
		JLabel TextSenha = new JLabel("Senha");
		TextSenha.setBounds(22, 211, 45, 13);
		contentPane.add(TextSenha);
		
		JLabel TextConfSenha = new JLabel("Digite sua senha novamente");
		TextConfSenha.setBounds(189, 211, 129, 13);
		contentPane.add(TextConfSenha);
		
		NomeField = new JTextField();
		NomeField.setBounds(22, 47, 96, 19);
		contentPane.add(NomeField);
		NomeField.setColumns(10);
		
		NascField = new JTextField();
		NascField.setBounds(22, 92, 96, 19);
		contentPane.add(NascField);
		NascField.setColumns(10);
		
		CpfField = new JTextField();
		CpfField.setBounds(22, 138, 96, 19);
		contentPane.add(CpfField);
		CpfField.setColumns(10);
		
		JButton NovaContaButton = new JButton("Criar Conta");
		NovaContaButton.setBounds(32, 300, 85, 21);
		contentPane.add(NovaContaButton);
		
		JButton VoltarButton = new JButton("Voltar");
		VoltarButton.setBounds(188, 300, 85, 21);
		contentPane.add(VoltarButton);
		
		SenhaField = new JPasswordField();
		SenhaField.setBounds(22, 229, 96, 19);
		contentPane.add(SenhaField);
		
		ConfirmacaoSenhaField = new JPasswordField();
		ConfirmacaoSenhaField.setBounds(189, 229, 108, 19);
		contentPane.add(ConfirmacaoSenhaField);
		
		JLabel TextAgencia = new JLabel("Agencia");
		TextAgencia.setBounds(22, 167, 45, 13);
		contentPane.add(TextAgencia);
		
		AgenciaField = new JTextField();
		AgenciaField.setBounds(22, 182, 96, 19);
		contentPane.add(AgenciaField);
		AgenciaField.setColumns(10);
	}
}
