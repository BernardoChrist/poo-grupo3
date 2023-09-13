package br.com.poo.banco.views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;

public class TelaGerente extends JFrame {

	private JPanel contentPane;
	private JTextField ClienteField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaGerente frame = new TelaGerente();
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
	public TelaGerente() {
		setTitle("Tela Gerente");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(85, 106, 95));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton CadastrarClienteButton = new JButton("Cadastrar Cliente");
		CadastrarClienteButton.setBounds(24, 201, 126, 21);
		contentPane.add(CadastrarClienteButton);
		
		JLabel TextPaineldoGerente = new JLabel("Painel do Gerente");
		TextPaineldoGerente.setFont(new Font("Tahoma", Font.BOLD, 12));
		TextPaineldoGerente.setBounds(158, 10, 121, 13);
		contentPane.add(TextPaineldoGerente);
		
		JLabel TextTotalContas = new JLabel("Total de Contas:");
		TextTotalContas.setBounds(47, 50, 76, 13);
		contentPane.add(TextTotalContas);
		
		JLabel TextProcurarCliente = new JLabel("Procurar Cliente:");
		TextProcurarCliente.setBounds(47, 72, 101, 13);
		contentPane.add(TextProcurarCliente);
		
		ClienteField = new JTextField();
		ClienteField.setBounds(47, 87, 96, 19);
		contentPane.add(ClienteField);
		ClienteField.setColumns(10);
		
		JLabel TotalContas = new JLabel("\"Numero de contas\"");
		TotalContas.setBounds(138, 50, 111, 13);
		contentPane.add(TotalContas);
		
		JButton PesquisarButton = new JButton("Pesquisar");
		PesquisarButton.setFont(new Font("Tahoma", Font.PLAIN, 9));
		PesquisarButton.setBounds(47, 116, 76, 13);
		contentPane.add(PesquisarButton);
		
		JButton SairButton = new JButton("Sair");
		SairButton.setBounds(164, 232, 85, 21);
		contentPane.add(SairButton);
	}

}
