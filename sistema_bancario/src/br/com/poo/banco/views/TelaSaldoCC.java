package br.com.poo.banco.views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;

public class TelaSaldoCC extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaSaldoCC frame = new TelaSaldoCC();
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
	public TelaSaldoCC() {
		setTitle("Tela Saldo Corrente");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(85, 106, 95));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel TextSaldoAtual = new JLabel("Saldo atual:");
		TextSaldoAtual.setBounds(46, 64, 55, 13);
		contentPane.add(TextSaldoAtual);
		
		JLabel TextPainelCliente = new JLabel("Saldo Conta Corrente");
		TextPainelCliente.setBounds(158, 10, 136, 15);
		TextPainelCliente.setFont(new Font("Tahoma", Font.BOLD, 12));
		contentPane.add(TextPainelCliente);
		
		JLabel Saldo = new JLabel("Saldo");
		Saldo.setBounds(111, 64, 45, 13);
		contentPane.add(Saldo);
		
		JButton ImprimirExtratoButton = new JButton("Imprimir Extrato");
		ImprimirExtratoButton.setBounds(46, 183, 110, 21);
		contentPane.add(ImprimirExtratoButton);
		
		JButton AtributosButton = new JButton("Relatorio de tributos");
		AtributosButton.setBounds(212, 183, 125, 21);
		contentPane.add(AtributosButton);
		
		JButton VoltarButton = new JButton("Voltar");
		VoltarButton.setBounds(164, 232, 85, 21);
		contentPane.add(VoltarButton);
	}

}
