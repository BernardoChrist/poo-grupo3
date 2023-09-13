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

public class TelaTransferencia extends JFrame {

	private JPanel contentPane;
	private JTextField ValorField;
	private JTextField ContaDestinoField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaTransferencia frame = new TelaTransferencia();
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
	public TelaTransferencia() {
		setTitle("Tela Tranferencia");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(85, 106, 95));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel TextAreaTranferencia = new JLabel("Area de Transferencia");
		TextAreaTranferencia.setFont(new Font("Tahoma", Font.BOLD, 12));
		TextAreaTranferencia.setBounds(158, 10, 141, 13);
		contentPane.add(TextAreaTranferencia);
		
		JLabel TextDigiteoValor = new JLabel("Digite o valor que deseja Transferir");
		TextDigiteoValor.setBounds(28, 90, 186, 13);
		contentPane.add(TextDigiteoValor);
		
		ValorField = new JTextField();
		ValorField.setBounds(28, 109, 96, 19);
		contentPane.add(ValorField);
		ValorField.setColumns(10);
		
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
		
		JLabel TextDigiteConta = new JLabel("Digite a conta de destino");
		TextDigiteConta.setBounds(28, 138, 168, 13);
		contentPane.add(TextDigiteConta);
		
		ContaDestinoField = new JTextField();
		ContaDestinoField.setBounds(28, 155, 96, 19);
		contentPane.add(ContaDestinoField);
		ContaDestinoField.setColumns(10);
	}
}
