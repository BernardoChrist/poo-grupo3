package br.com.poo.banco.views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class TelaDiretor extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaDiretor frame = new TelaDiretor();
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
	public TelaDiretor() {
		setTitle("Tela Diretor");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Painel do Diretor");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(173, 22, 102, 13);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Relatorio de clientes");
		btnNewButton.setBounds(55, 83, 125, 21);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Novo Cadastro");
		btnNewButton_1.setBounds(65, 212, 102, 21);
		contentPane.add(btnNewButton_1);
	}

}
