package br.com.poo.banco.views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JTextField;

public class TelaDiretor extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField ClienteField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaDiretor frame = new TelaDiretor();
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
	public TelaDiretor() {
		setTitle("Tela Diretor");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(85, 106, 95));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel TextPainelDiretor = new JLabel("Painel do Diretor");
		TextPainelDiretor.setBounds(158, 10, 102, 13);
		TextPainelDiretor.setFont(new Font("Tahoma", Font.BOLD, 12));
		contentPane.add(TextPainelDiretor);
		
		JButton RelClientesButton = new JButton("Relatorio de clientes");
		RelClientesButton.setBounds(47, 139, 125, 21);
		contentPane.add(RelClientesButton);
		
		JButton CadastrarClienteButton = new JButton("Cadastrar Cliente");
		CadastrarClienteButton.setBounds(24, 201, 126, 21);
		contentPane.add(CadastrarClienteButton);
		
		JButton CadastrarGerenteButton = new JButton("Cadastrar Gerente");
		CadastrarGerenteButton.setBounds(160, 201, 126, 21);
		contentPane.add(CadastrarGerenteButton);
		
		JLabel TextTotalContas = new JLabel("Total de Contas:");
		TextTotalContas.setBounds(47, 50, 76, 13);
		contentPane.add(TextTotalContas);
		
		JLabel TotalContas = new JLabel("\"Numero de contas\"");
		TotalContas.setBounds(121, 50, 111, 13);
		contentPane.add(TotalContas);
		
		ClienteField = new JTextField();
		ClienteField.setBounds(47, 87, 96, 19);
		ClienteField.setColumns(10);
		contentPane.add(ClienteField);
		
		JButton PesquisarButton = new JButton("Pesquisar");
		PesquisarButton.setBounds(47, 116, 76, 13);
		PesquisarButton.setFont(new Font("Tahoma", Font.PLAIN, 9));
		contentPane.add(PesquisarButton);
		
		JLabel TextProcurarCliente = new JLabel("Procurar Cliente:");
		TextProcurarCliente.setBounds(47, 72, 101, 13);
		contentPane.add(TextProcurarCliente);
		
		JButton SairButton = new JButton("Sair");
		SairButton.setBounds(164, 232, 85, 21);
		contentPane.add(SairButton);
	}
}
