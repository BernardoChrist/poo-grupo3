package br.com.poo.banco.views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class TelaSaque extends JFrame {

	private JPanel contentPane;
	private JTextField SaqueField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaSaque frame = new TelaSaque();
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
	public TelaSaque() {
		setTitle("Tela Saque");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(85, 106, 95));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel TextAreaSaque = new JLabel("Area de Saque");
		TextAreaSaque.setFont(new Font("Tahoma", Font.BOLD, 12));
		TextAreaSaque.setBounds(158, 10, 107, 13);
		contentPane.add(TextAreaSaque);
		
		JLabel TextDigiteoValor = new JLabel("Digite o valor que deseja sacar");
		TextDigiteoValor.setBounds(28, 86, 142, 13);
		contentPane.add(TextDigiteoValor);
		
		SaqueField = new JTextField();
		SaqueField.setBounds(28, 109, 96, 19);
		contentPane.add(SaqueField);
		SaqueField.setColumns(10);
		
		JButton ConfirmarButton = new JButton("Confirmar");
		ConfirmarButton.setBounds(85, 232, 85, 21);
		contentPane.add(ConfirmarButton);
		
		JButton VoltarButton = new JButton("Voltar");
		VoltarButton.setBounds(263, 232, 85, 21);
		contentPane.add(VoltarButton);
		
		JLabel TextNumeroConta = new JLabel("Numero da conta :");
		TextNumeroConta.setBounds(28, 42, 87, 13);
		contentPane.add(TextNumeroConta);
		
		JLabel NumeroConta = new JLabel("Numero conta");
		NumeroConta.setBounds(125, 42, 71, 13);
		contentPane.add(NumeroConta);
	}
}
