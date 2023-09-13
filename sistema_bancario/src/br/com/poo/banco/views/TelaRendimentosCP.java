package br.com.poo.banco.views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;

public class TelaRendimentosCP extends JFrame {

	private JPanel contentPane;
	private JTextField ValorField;
	private JTextField duracaoField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaRendimentosCP frame = new TelaRendimentosCP();
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
	public TelaRendimentosCP() {
		setTitle("Tela Rendmentos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(85, 106, 95));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel TextRendimentos = new JLabel("Rendimentos");
		TextRendimentos.setFont(new Font("Tahoma", Font.BOLD, 12));
		TextRendimentos.setBounds(158, 10, 90, 13);
		contentPane.add(TextRendimentos);
		
		JLabel TextTaxaMensal = new JLabel("Taxa: 0,60% a.m");
		TextTaxaMensal.setForeground(new Color(0, 0, 160));
		TextTaxaMensal.setBounds(55, 53, 80, 13);
		contentPane.add(TextTaxaMensal);
		
		JButton SimularRendimentosButton = new JButton("Simular Rendimentos");
		SimularRendimentosButton.setBounds(55, 183, 131, 21);
		contentPane.add(SimularRendimentosButton);
		
		ValorField = new JTextField();
		ValorField.setBounds(55, 95, 96, 19);
		contentPane.add(ValorField);
		ValorField.setColumns(10);
		
		duracaoField = new JTextField();
		duracaoField.setColumns(10);
		duracaoField.setBounds(55, 140, 96, 19);
		contentPane.add(duracaoField);
		
		JLabel TextValorInvestido = new JLabel("Valor investido");
		TextValorInvestido.setBounds(55, 76, 67, 13);
		contentPane.add(TextValorInvestido);
		
		JLabel TextDuracao = new JLabel("Duraçao (em dias)");
		TextDuracao.setBounds(55, 124, 96, 13);
		contentPane.add(TextDuracao);
		
		JButton VoltarButton = new JButton("Voltar");
		VoltarButton.setBounds(164, 232, 85, 21);
		contentPane.add(VoltarButton);
	}

}
