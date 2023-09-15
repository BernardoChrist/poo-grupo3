package br.com.poo.banco.views;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaDiretor extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel btnInfoClie;

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
		setResizable(false);
		setTitle("Diretor");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 930, 630);
		btnInfoClie = new JPanel();
		btnInfoClie.setBackground(new Color(235, 235, 235));
		btnInfoClie.setBorder(new EmptyBorder(5, 5, 5, 5));


		setContentPane(btnInfoClie);
		btnInfoClie.setLayout(null);
		
		JButton btnContAge = new JButton("Contas da Agência");
		btnContAge.setBackground(new Color(233, 65, 69));
		btnContAge.setForeground(new Color(255, 255, 255));
		btnContAge.setFont(new Font("Lato", Font.BOLD, 14));
		btnContAge.setBounds(662, 241, 220, 60);
		btnInfoClie.add(btnContAge);
		
		JButton btnCadCli = new JButton("Cadastrar Cliente");
		btnCadCli.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaCadastroCliente Cadastro = new TelaCadastroCliente();
				Cadastro.setVisible(true);
			}
		});
		btnCadCli.setForeground(new Color(255, 255, 255));
		btnCadCli.setFont(new Font("Lato", Font.BOLD, 14));
		btnCadCli.setBackground(new Color(233, 65, 69));
		btnCadCli.setBounds(32, 241, 220, 60);
		btnInfoClie.add(btnCadCli);
		
		JButton btnCadGer = new JButton("Cadastrar Gerente");
		btnCadGer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaCadastroFunc gerenteCad = new TelaCadastroFunc();
				gerenteCad.setVisible(true);
			}
		});
		btnCadGer.setForeground(new Color(255, 255, 255));
		btnCadGer.setBackground(new Color(233, 65, 69));
		btnCadGer.setBounds(347, 241, 220, 60);
		btnCadGer.setFont(new Font("Lato", Font.BOLD, 14));
		btnInfoClie.add(btnCadGer);
		
		JLabel TextNovoCadastro = new JLabel("Diretor");
		TextNovoCadastro.setForeground(new Color(255, 255, 255));
		TextNovoCadastro.setBackground(new Color(255, 255, 255));
		TextNovoCadastro.setBounds(430, 161, 54, 30);
		TextNovoCadastro.setFont(new Font("Lato", Font.BOLD, 15));
		btnInfoClie.add(TextNovoCadastro);

		JLabel textLinhaVermelha = new JLabel("__________________________________");
		textLinhaVermelha.setForeground(new Color(198, 43, 26));
		textLinhaVermelha.setFont(new Font("Tahoma", Font.PLAIN, 46));
		textLinhaVermelha.setBackground(UIManager.getColor("Button.background"));
		textLinhaVermelha.setBounds(32, 50, 850, 53);
		btnInfoClie.add(textLinhaVermelha);
		
		JLabel lblMazeBank = new JLabel("MAZE BANK");
		lblMazeBank.setFont(new Font("Sylfaen", Font.PLAIN, 40));
		lblMazeBank.setBackground(UIManager.getColor("Button.background"));
		lblMazeBank.setBounds(94, 30, 236, 53);
		btnInfoClie.add(lblMazeBank);
		
		JLabel lblOfPetrpolisCity = new JLabel("OF PETRÓPOLIS CITY");
		lblOfPetrpolisCity.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblOfPetrpolisCity.setBackground(UIManager.getColor("Button.background"));
		lblOfPetrpolisCity.setBounds(96, 62, 150, 16);
		btnInfoClie.add(lblOfPetrpolisCity);
		
		JLabel TextUsuarioCC = new JLabel("(Usuario)");
		TextUsuarioCC.setForeground(Color.WHITE);
		TextUsuarioCC.setFont(new Font("Lato", Font.BOLD, 18));
		TextUsuarioCC.setBackground(Color.WHITE);
		TextUsuarioCC.setBounds(37, 133, 180, 30);
		btnInfoClie.add(TextUsuarioCC);
		
		JLabel lblMzBkLogo = new JLabel("logo");
		lblMzBkLogo.setIcon(new ImageIcon("C:\\\\dev\\\\POO\\\\Workspace\\\\poo-grupo3\\\\sistema_bancario\\\\imagens maze bank\\\\mazebanklogo.png"));
		lblMzBkLogo.setForeground(new Color(0, 0, 0));
		lblMzBkLogo.setFont(new Font("Tahoma", Font.PLAIN, 5));
		lblMzBkLogo.setBounds(32, 23, 60, 60);
		btnInfoClie.add(lblMzBkLogo);
		
		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente sair?", "Confirmação de Saída", JOptionPane.YES_NO_OPTION);
                if (resposta == JOptionPane.YES_OPTION) {
						dispose();
						TelaLogin login = new TelaLogin();
						login.setVisible(true);
						}
		}});
		
		btnSair.setForeground(Color.WHITE);
		btnSair.setFont(new Font("Lato", Font.BOLD, 14));
		btnSair.setBackground(new Color(233, 65, 69));
		btnSair.setBounds(760, 145, 100, 30);
		btnInfoClie.add(btnSair);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\\\dev\\\\POO\\\\Workspace\\\\poo-grupo3\\\\sistema_bancario\\\\imagens maze bank\\\\mazebankbarra.png"));
		lblNewLabel.setBounds(32, 127, 850, 60);
		btnInfoClie.add(lblNewLabel);
		
		JLabel lblStaff = new JLabel("(STAFF)");
		lblStaff.setFont(new Font("Sylfaen", Font.PLAIN, 14));
		lblStaff.setBackground(UIManager.getColor("Button.background"));
		lblStaff.setBounds(260, 64, 60, 21);
		btnInfoClie.add(lblStaff);
		
		JButton btnRelatorioTotalDe = new JButton("Informações dos Clientes");
		btnRelatorioTotalDe.setForeground(Color.WHITE);
		btnRelatorioTotalDe.setFont(new Font("Lato", Font.BOLD, 14));
		btnRelatorioTotalDe.setBackground(new Color(233, 65, 69));
		btnRelatorioTotalDe.setBounds(347, 384, 220, 60);
		btnInfoClie.add(btnRelatorioTotalDe);
		
	}
}
