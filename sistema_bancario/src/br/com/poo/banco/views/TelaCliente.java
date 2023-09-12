package br.com.poo.banco.views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;

public class TelaCliente extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCliente frame = new TelaCliente();
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
	public TelaCliente() {
		setTitle("Tela Cliente");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(85, 106, 95));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Painel do Cliente");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(158, 10, 101, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_3 = new JLabel("Bem-Vindo(a)!");
		lblNewLabel_3.setBounds(21, 46, 94, 13);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel();
		lblNewLabel_4.setBounds(92, 46, 45, 13);
		contentPane.add(lblNewLabel_4);
		
		JButton btnNewButton = new JButton("Saque");
		btnNewButton.setBounds(21, 71, 101, 21);
		contentPane.add(btnNewButton);
		
		JButton btnTranferencia = new JButton("Tranferencia");
		btnTranferencia.setBounds(21, 125, 101, 21);
		contentPane.add(btnTranferencia);
		
		JButton btnNewButton_1_1 = new JButton("Deposito");
		btnNewButton_1_1.setBounds(21, 98, 101, 21);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("Saldo");
		btnNewButton_1_2.setBounds(21, 151, 101, 21);
		contentPane.add(btnNewButton_1_2);
		
		JButton btnNewButton_2 = new JButton("Sair");
		btnNewButton_2.setBounds(212, 232, 85, 21);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel_1 = new JLabel("Nome do cliente");
		lblNewLabel_1.setBounds(92, 46, 85, 13);
		contentPane.add(lblNewLabel_1);
	}
}
