package br.com.poo.banco.views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;

public class TelaCC extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCC frame = new TelaCC();
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
	public TelaCC() {
		setTitle("Tela Cliente CC");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(85, 106, 95));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel TextPainelDoCliente = new JLabel("Painel do Cliente");
		TextPainelDoCliente.setFont(new Font("Tahoma", Font.BOLD, 12));
		TextPainelDoCliente.setBounds(158, 10, 101, 13);
		contentPane.add(TextPainelDoCliente);
		
		JLabel TextBemvindo = new JLabel("Bem-Vindo(a)!");
		TextBemvindo.setBounds(21, 46, 94, 13);
		contentPane.add(TextBemvindo);
		
		JButton SaqueButton = new JButton("Saque");
		SaqueButton.setBounds(21, 95, 101, 21);
		contentPane.add(SaqueButton);
		
		JButton TransferenciaButton = new JButton("Tranferencia");
		TransferenciaButton.setBounds(21, 149, 101, 21);
		contentPane.add(TransferenciaButton);
		
		JButton DepositoButton = new JButton("Deposito");
		DepositoButton.setBounds(21, 122, 101, 21);
		contentPane.add(DepositoButton);
		
		JButton SaldoButton = new JButton("Saldo");
		SaldoButton.setBounds(21, 175, 101, 21);
		contentPane.add(SaldoButton);
		
		JButton SairButton = new JButton("Sair");
		SairButton.setBounds(164, 232, 85, 21);
		contentPane.add(SairButton);
		
		JLabel NomeCliente = new JLabel("Nome do cliente");
		NomeCliente.setBounds(92, 46, 85, 13);
		contentPane.add(NomeCliente);
		
		JButton SegVidaButton = new JButton("Seg. de Vida");
		SegVidaButton.setBounds(21, 202, 101, 21);
		contentPane.add(SegVidaButton);
	}
}
