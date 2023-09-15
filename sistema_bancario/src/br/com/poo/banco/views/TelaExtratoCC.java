package br.com.poo.banco.views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class TelaExtrato extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaExtrato frame = new TelaExtrato();
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
	public TelaExtrato() {
		setTitle("Tela Extrato");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(85, 106, 95));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel TextExtratoConta = new JLabel("Extrato da Conta");
		TextExtratoConta.setFont(new Font("Tahoma", Font.BOLD, 12));
		TextExtratoConta.setBounds(158, 10, 113, 13);
		contentPane.add(TextExtratoConta);
		
		JLabel ExtratoConta = new JLabel("Extrato conta");
		ExtratoConta.setBounds(165, 65, 72, 13);
		contentPane.add(ExtratoConta);
		
		JButton ImprimirButton = new JButton("Imprimir");
		ImprimirButton.setBounds(85, 232, 85, 21);
		contentPane.add(ImprimirButton);
		
		JButton VoltarButton = new JButton("Voltar");
		VoltarButton.setBounds(263, 232, 85, 21);
		contentPane.add(VoltarButton);
	}

}
