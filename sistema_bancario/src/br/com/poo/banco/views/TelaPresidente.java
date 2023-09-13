package br.com.poo.banco.views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;

public class TelaPresidente extends JFrame {

	private JPanel contentPane;
	private JTextField ClienteField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPresidente frame = new TelaPresidente();
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
	public TelaPresidente() {
		setTitle("Tela Presidente");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(85, 106, 95));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel TextPainelPresidente = new JLabel("Painel do Presidente");
		TextPainelPresidente.setFont(new Font("Tahoma", Font.BOLD, 12));
		TextPainelPresidente.setBounds(158, 10, 129, 13);
		contentPane.add(TextPainelPresidente);
		
		JButton ListarAgenciaButton = new JButton("Listar Agencias");
		ListarAgenciaButton.setBounds(258, 86, 129, 21);
		contentPane.add(ListarAgenciaButton);
		
		JButton ResumoCapitalButton = new JButton("Resumo Capital");
		ResumoCapitalButton.setBounds(258, 117, 129, 21);
		contentPane.add(ResumoCapitalButton);
		
		JButton CadastrarClienteButton = new JButton("Cadastrar Cliente");
		CadastrarClienteButton.setBounds(24, 201, 126, 21);
		contentPane.add(CadastrarClienteButton);
		
		JButton CadastrarGerenteButton = new JButton("Cadasatrar Gerente");
		CadastrarGerenteButton.setBounds(160, 201, 126, 21);
		contentPane.add(CadastrarGerenteButton);
		
		JButton CadastrarDiretorButton = new JButton("Cadastrar Diretor");
		CadastrarDiretorButton.setBounds(296, 201, 117, 21);
		contentPane.add(CadastrarDiretorButton);
		
		JLabel TextTotalContas = new JLabel("Total de Contas:");
		TextTotalContas.setBounds(47, 50, 76, 13);
		contentPane.add(TextTotalContas);
		
		JLabel TextProcurarCliente = new JLabel("Procurar Cliente:");
		TextProcurarCliente.setBounds(47, 73, 101, 13);
		contentPane.add(TextProcurarCliente);
		
		ClienteField = new JTextField();
		ClienteField.setColumns(10);
		ClienteField.setBounds(47, 87, 96, 19);
		contentPane.add(ClienteField);
		
		JButton PesquisarButton = new JButton("Pesquisar");
		PesquisarButton.setFont(new Font("Tahoma", Font.PLAIN, 9));
		PesquisarButton.setBounds(47, 116, 76, 13);
		contentPane.add(PesquisarButton);
		
		JButton RelatorioClienteButton = new JButton("Relatorio de clientes");
		RelatorioClienteButton.setBounds(47, 139, 129, 21);
		contentPane.add(RelatorioClienteButton);
		
		JLabel TotalContas = new JLabel("Numero de contas");
		TotalContas.setBounds(124, 50, 111, 13);
		contentPane.add(TotalContas);
		
		JButton SairButton = new JButton("Sair");
		SairButton.setBounds(164, 232, 85, 21);
		contentPane.add(SairButton);
	}
}
