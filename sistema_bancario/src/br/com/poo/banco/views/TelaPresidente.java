package br.com.poo.banco.views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaPresidente extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPresidente frame = new TelaPresidente();
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
	public TelaPresidente() {
		setResizable(false);
		setTitle("Presidente");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 930, 630);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(235, 235, 235));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		JLabel TextNovoCadastro = new JLabel("Presidente");
		TextNovoCadastro.setForeground(new Color(255, 255, 255));
		TextNovoCadastro.setBackground(new Color(255, 255, 255));
		TextNovoCadastro.setBounds(417, 161, 79, 30);
		TextNovoCadastro.setFont(new Font("Lato", Font.BOLD, 15));
		contentPane.add(TextNovoCadastro);

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
		
		JLabel TextUsuarioCC = new JLabel("(Usuario)");
		TextUsuarioCC.setForeground(Color.WHITE);
		TextUsuarioCC.setFont(new Font("Lato", Font.BOLD, 18));
		TextUsuarioCC.setBackground(Color.WHITE);
		TextUsuarioCC.setBounds(37, 133, 180, 30);
		contentPane.add(TextUsuarioCC);
		
		JLabel lblMzBkLogo = new JLabel("logo");
		lblMzBkLogo.setIcon(new ImageIcon("C:\\\\dev\\\\POO\\\\Workspace\\\\poo-grupo3\\\\sistema_bancario\\\\imagens maze bank\\\\mazebanklogo.png"));
		lblMzBkLogo.setForeground(new Color(0, 0, 0));
		lblMzBkLogo.setFont(new Font("Tahoma", Font.PLAIN, 5));
		lblMzBkLogo.setBounds(32, 23, 60, 60);
		contentPane.add(lblMzBkLogo);
		
		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				TelaLogin log = new TelaLogin();
				log.setVisible(true);
				log.setLocationRelativeTo(log);
			}
		});
		btnSair.setForeground(Color.WHITE);
		btnSair.setFont(new Font("Lato", Font.BOLD, 14));
		btnSair.setBackground(new Color(233, 65, 69));
		btnSair.setBounds(760, 145, 100, 30);
		contentPane.add(btnSair);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\\\dev\\\\POO\\\\Workspace\\\\poo-grupo3\\\\sistema_bancario\\\\imagens maze bank\\\\mazebankbarra.png"));
		lblNewLabel.setBounds(32, 127, 850, 60);
		contentPane.add(lblNewLabel);
		
		JLabel lblStaff = new JLabel("(STAFF)");
		lblStaff.setFont(new Font("Sylfaen", Font.PLAIN, 14));
		lblStaff.setBackground(UIManager.getColor("Button.background"));
		lblStaff.setBounds(260, 64, 60, 21);
		contentPane.add(lblStaff);


		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnContAge = new JButton("Contas da Agência");
		btnContAge.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnContAge.setForeground(Color.WHITE);
		btnContAge.setFont(new Font("Lato", Font.BOLD, 14));
		btnContAge.setBackground(new Color(233, 65, 69));
		btnContAge.setBounds(32, 384, 220, 60);
		contentPane.add(btnContAge);
		
		JButton btnCadCli = new JButton("Cadastrar Cliente");
		btnCadCli.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				TelaCadastroCliente cadc = new TelaCadastroCliente();
				cadc.setVisible(true);
				cadc.setLocationRelativeTo(cadc);
				
			}
		});
		btnCadCli.setForeground(Color.WHITE);
		btnCadCli.setFont(new Font("Lato", Font.BOLD, 14));
		btnCadCli.setBackground(new Color(233, 65, 69));
		btnCadCli.setBounds(32, 241, 220, 60);
		contentPane.add(btnCadCli);
		
		JButton btnLisDire = new JButton("Lista de Diretores");
		btnLisDire.setForeground(Color.WHITE);
		btnLisDire.setFont(new Font("Lato", Font.BOLD, 14));
		btnLisDire.setBackground(new Color(233, 65, 69));
		btnLisDire.setBounds(662, 384, 220, 60);
		contentPane.add(btnLisDire);
		
		JButton btnCadGer = new JButton("Cadastrar Gerente");
		btnCadGer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				TelaCadastroFunc cadf = new TelaCadastroFunc();
				cadf.setVisible(true);
				cadf.setLocationRelativeTo(cadf);
			}
		});
		btnCadGer.setForeground(Color.WHITE);
		btnCadGer.setFont(new Font("Lato", Font.BOLD, 14));
		btnCadGer.setBackground(new Color(233, 65, 69));
		btnCadGer.setBounds(347, 241, 220, 60);
		contentPane.add(btnCadGer);
		
		JButton btnCadDir = new JButton("Cadastrar Diretor");
		btnCadDir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				TelaCadastroFunc cadf = new TelaCadastroFunc();
				cadf.setVisible(true);
				cadf.setLocationRelativeTo(cadf);
			}
		});
		btnCadDir.setForeground(Color.WHITE);
		btnCadDir.setFont(new Font("Lato", Font.BOLD, 14));
		btnCadDir.setBackground(new Color(233, 65, 69));
		btnCadDir.setBounds(662, 241, 220, 60);
		contentPane.add(btnCadDir);
		
		JButton btnInfoClie = new JButton("Informações dos Clientes");
		btnInfoClie.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnInfoClie.setForeground(Color.WHITE);
		btnInfoClie.setFont(new Font("Lato", Font.BOLD, 14));
		btnInfoClie.setBackground(new Color(233, 65, 69));
		btnInfoClie.setBounds(347, 384, 220, 60);
		contentPane.add(btnInfoClie);
		
		JButton btnCapitalArmazenado = new JButton("Capital Armazenado");
		btnCapitalArmazenado.setForeground(Color.WHITE);
		btnCapitalArmazenado.setFont(new Font("Lato", Font.BOLD, 14));
		btnCapitalArmazenado.setBackground(new Color(233, 65, 69));
		btnCapitalArmazenado.setBounds(347, 492, 220, 60);
		contentPane.add(btnCapitalArmazenado);
	}
}
