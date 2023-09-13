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

public class TelaResultadoRendimentosCP extends JFrame {

	private JPanel contentPane;
	private JTextField ValorField;
	private JTextField DuracaoField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaResultadoRendimentosCP frame = new TelaResultadoRendimentosCP();
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
	public TelaResultadoRendimentosCP() {
		setTitle("Tela Resultado Rendimentos");
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
		TextTaxaMensal.setBounds(22, 36, 80, 13);
		contentPane.add(TextTaxaMensal);
		
		JButton ConfirmarInvestimentoButton = new JButton("Confirmar Investimento");
		ConfirmarInvestimentoButton.setBounds(22, 91, 144, 21);
		contentPane.add(ConfirmarInvestimentoButton);
		
		ValorField = new JTextField();
		ValorField.setBounds(22, 178, 96, 19);
		contentPane.add(ValorField);
		ValorField.setColumns(10);
		
		DuracaoField = new JTextField();
		DuracaoField.setColumns(10);
		DuracaoField.setBounds(137, 178, 96, 19);
		contentPane.add(DuracaoField);
		
		JLabel TextValorInvestido = new JLabel("Valor investido");
		TextValorInvestido.setBounds(22, 162, 67, 13);
		contentPane.add(TextValorInvestido);
		
		JLabel TextDuracao = new JLabel("Duraçao (em dias)");
		TextDuracao.setBounds(137, 162, 96, 13);
		contentPane.add(TextDuracao);
		
		JButton VoltarButton = new JButton("Voltar");
		VoltarButton.setBounds(164, 232, 85, 21);
		contentPane.add(VoltarButton);
		
		JButton RefazerCalculoButton = new JButton("Simular Novamente");
		RefazerCalculoButton.setBounds(261, 177, 144, 21);
		contentPane.add(RefazerCalculoButton);
		
		JLabel TextRendimento = new JLabel("Nessas condiçoes, seu dinheiro vai render :");
		TextRendimento.setBounds(22, 68, 205, 13);
		contentPane.add(TextRendimento);
		
		JLabel ValorRendimento = new JLabel("Valor do rend.");
		ValorRendimento.setBounds(227, 68, 72, 13);
		contentPane.add(ValorRendimento);
	}

}
