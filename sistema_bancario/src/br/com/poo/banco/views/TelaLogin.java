package br.com.poo.banco.views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.UIManager;

import java.awt.Color;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFormattedTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class TelaLogin extends JFrame {

	private JPanel contentPane;
	private JPasswordField SenhaField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaLogin frame = new TelaLogin();
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
	public TelaLogin() {
		setResizable(false);
		setTitle("Login Maze Bank");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 930, 630);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(235, 235, 235));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));


		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel TextLogin = new JLabel("Login");
		TextLogin.setFont(new Font("Arial", Font.PLAIN, 25));
		TextLogin.setBounds(422, 196, 69, 44);
		contentPane.add(TextLogin);
		
		JTextPane UsuarioField = new JTextPane();
		UsuarioField.setBounds(343, 334, 228, 23);
		contentPane.add(UsuarioField);
		
		JLabel TextUsuario = new JLabel("Usuario");
		TextUsuario.setFont(new Font("Lato", Font.BOLD, 14));
		TextUsuario.setBounds(428, 306, 58, 28);
		contentPane.add(TextUsuario);
		
		SenhaField = new JPasswordField();
		SenhaField.setBounds(343, 390, 228, 23);
		contentPane.add(SenhaField);
		
		JLabel TextSenha = new JLabel("Senha");
		TextSenha.setFont(new Font("Lato", Font.BOLD, 14));
		TextSenha.setBounds(435, 366, 42, 28);
		contentPane.add(TextSenha);
		
		JButton EntrarButton = new JButton("Entrar");
		EntrarButton.setForeground(new Color(255, 255, 255));
		EntrarButton.setFont(new Font("Lato", Font.BOLD, 14));
		EntrarButton.setBackground(new Color(233, 65, 69));
		EntrarButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String cpf = UsuarioField.getText();
				String senha = new String(SenhaField.getPassword());
				if(cpf!= null && senha != null && !cpf.isEmpty() && !senha.isEmpty()) {
					JOptionPane.showMessageDialog(EntrarButton, "Bem-Vindo!"); 
				}
				
				else {
					JOptionPane.showMessageDialog(EntrarButton, "Todos os campos devem ser preenchidos.", "Aviso!", JOptionPane.WARNING_MESSAGE);
				}
				
			}
		});
		EntrarButton.setBounds(347, 472, 220, 60);
		contentPane.add(EntrarButton);
		
		JComboBox comboBoxCargo = new JComboBox();
		comboBoxCargo.setMaximumRowCount(3);
		comboBoxCargo.setToolTipText("Cliente\r\nFuncionario\r\nGerente\r\nDiretor\r\nPresidente");
		comboBoxCargo.setModel(new DefaultComboBoxModel(new String[] {"Cliente", "Gerente", "Diretor", "Presidente"}));
		comboBoxCargo.setSelectedIndex(3);
		comboBoxCargo.setBounds(343, 240, 228, 23);
		contentPane.add(comboBoxCargo);

		JLabel textLinhaVermelha = new JLabel("__________________________________");
		textLinhaVermelha.setForeground(new Color(198, 43, 26));
		textLinhaVermelha.setFont(new Font("Tahoma", Font.PLAIN, 46));
		textLinhaVermelha.setBackground(UIManager.getColor("Button.background"));
		textLinhaVermelha.setBounds(32, 50, 850, 53);
		contentPane.add(textLinhaVermelha);
		
		JLabel lblMazeBank = new JLabel("MAZE BANK");
		lblMazeBank.setFont(new Font("Sylfaen", Font.PLAIN, 40));
		lblMazeBank.setBackground(UIManager.getColor("Button.background"));
		lblMazeBank.setBounds(94, 30, 236, 53);
		contentPane.add(lblMazeBank);
		
		JLabel lblOfPetrpolisCity = new JLabel("OF PETRÓPOLIS CITY");
		lblOfPetrpolisCity.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblOfPetrpolisCity.setBackground(UIManager.getColor("Button.background"));
		lblOfPetrpolisCity.setBounds(96, 62, 150, 16);
		contentPane.add(lblOfPetrpolisCity);
		
		JLabel lblMzBkLogo = new JLabel("logo");
		lblMzBkLogo.setIcon(new ImageIcon("C:\\mazebanklogo.png"));
		lblMzBkLogo.setForeground(new Color(0, 0, 0));
		lblMzBkLogo.setFont(new Font("Tahoma", Font.PLAIN, 5));
		lblMzBkLogo.setBounds(32, 23, 60, 60);
		contentPane.add(lblMzBkLogo);
		
		JButton btnSair = new JButton("Sair");
		btnSair.setForeground(Color.WHITE);
		btnSair.setFont(new Font("Lato", Font.BOLD, 14));
		btnSair.setBackground(new Color(233, 65, 69));
		btnSair.setBounds(760, 145, 100, 30);
		contentPane.add(btnSair);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\mazebankbarra.png"));
		lblNewLabel.setBounds(32, 127, 850, 60);
		contentPane.add(lblNewLabel);
	}
}
