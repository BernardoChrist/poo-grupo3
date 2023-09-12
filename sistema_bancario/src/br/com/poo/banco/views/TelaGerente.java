package br.com.poo.banco.views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;

public class TelaGerente extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaGerente frame = new TelaGerente();
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
	public TelaGerente() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(85, 106, 95));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Cadastrar Cliente");
		btnNewButton.setBounds(170, 198, 111, 21);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Tela Gerente");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(170, 10, 96, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Total de Contas:");
		lblNewLabel_1.setBounds(57, 49, 76, 13);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Procurar Cliente:");
		lblNewLabel_2.setBounds(57, 89, 101, 13);
		contentPane.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(57, 103, 96, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("\"Numero de contas\"");
		lblNewLabel_3.setBounds(143, 49, 111, 13);
		contentPane.add(lblNewLabel_3);
		
		JButton btnNewButton_1 = new JButton("Pesquisar");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnNewButton_1.setBounds(57, 132, 76, 13);
		contentPane.add(btnNewButton_1);
	}

}
