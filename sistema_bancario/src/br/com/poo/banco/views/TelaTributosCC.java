package br.com.poo.banco.views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class TelaTributosCC extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaTributosCC frame = new TelaTributosCC();
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
	public TelaTributosCC() {
		setTitle("Tela Resumo Tributos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(85, 106, 95));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel TextResumoTributos = new JLabel("Resumo dos Tributos");
		TextResumoTributos.setFont(new Font("Tahoma", Font.BOLD, 12));
		TextResumoTributos.setBounds(158, 10, 124, 13);
		contentPane.add(TextResumoTributos);
		
		JLabel TextTotalGastos = new JLabel("Total dos gastos:");
		TextTotalGastos.setBounds(40, 127, 79, 13);
		contentPane.add(TextTotalGastos);
		
		JLabel GastosTributos = new JLabel("gostos com tributos");
		GastosTributos.setBounds(133, 127, 90, 13);
		contentPane.add(GastosTributos);
		
		JLabel TextTaxaSaque = new JLabel("Sera cobrado um valor de R$ 0,10 (dez centavos) por Saque.");
		TextTaxaSaque.setForeground(new Color(0, 0, 160));
		TextTaxaSaque.setBounds(40, 41, 287, 13);
		contentPane.add(TextTaxaSaque);
		
		JLabel TextTaxaDeposito = new JLabel("Sera cobrado um valor de R$ 0,10 (dez centavos) por Deposito.");
		TextTaxaDeposito.setForeground(new Color(0, 0, 160));
		TextTaxaDeposito.setBounds(40, 64, 297, 13);
		contentPane.add(TextTaxaDeposito);
		
		JLabel TextTaxaTransferencia = new JLabel("Sera cobrado um valor de R$ 0,20 (vinte centavos) por Tranferencia.");
		TextTaxaTransferencia.setForeground(new Color(0, 0, 160));
		TextTaxaTransferencia.setBounds(40, 87, 322, 13);
		contentPane.add(TextTaxaTransferencia);
		
		JButton VoltarButton = new JButton("Voltar");
		VoltarButton.setBounds(164, 232, 85, 21);
		contentPane.add(VoltarButton);
	}

}
