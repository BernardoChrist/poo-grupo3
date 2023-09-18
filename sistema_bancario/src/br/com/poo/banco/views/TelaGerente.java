package br.com.poo.banco.views;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;


import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import br.com.poo.banco.pessoas.Cliente;
import br.com.poo.banco.pessoas.Funcionario;

public class TelaGerente extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public TelaGerente(Funcionario funcionario) {
		setTitle("Gerente");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 930, 630);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(235, 235, 235));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnContAge = new JButton("Contas da Agência");
		btnContAge.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnContAge.setBackground(new Color(233, 65, 69));
		btnContAge.setForeground(new Color(255, 255, 255));
		btnContAge.setFont(new Font("Lato", Font.BOLD, 14));
		btnContAge.setBounds(292, 463, 330, 60);
		contentPane.add(btnContAge);
		
		JButton btnCadCli = new JButton("Cadastrar Cliente");
		btnCadCli.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			   TelaCadastroCliente cadastroCli = new TelaCadastroCliente(funcionario);
			   cadastroCli.setVisible(true);
			}
		});
		btnCadCli.setForeground(new Color(255, 255, 255));
		btnCadCli.setFont(new Font("Lato", Font.BOLD, 14));
		btnCadCli.setBackground(new Color(233, 65, 69));
		btnCadCli.setBounds(292, 250, 330, 60);
		contentPane.add(btnCadCli);
		
		JLabel TextNovoCadastro = new JLabel("Gerente");
		TextNovoCadastro.setForeground(new Color(255, 255, 255));
		TextNovoCadastro.setBackground(new Color(255, 255, 255));
		TextNovoCadastro.setBounds(422, 161, 60, 30);
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
		
		JLabel TextUsuarioCC = new JLabel(funcionario.getNome());
		TextUsuarioCC.setForeground(Color.WHITE);
		TextUsuarioCC.setFont(new Font("Lato", Font.BOLD, 18));
		TextUsuarioCC.setBackground(Color.WHITE);
		TextUsuarioCC.setBounds(37, 133, 180, 30);
		contentPane.add(TextUsuarioCC);
		
		JLabel lblMzBkLogo = new JLabel("logo");
		lblMzBkLogo.setIcon(new ImageIcon("./imagens maze bank/mazebanklogo.png"));
		lblMzBkLogo.setForeground(new Color(0, 0, 0));
		lblMzBkLogo.setFont(new Font("Tahoma", Font.PLAIN, 5));
		lblMzBkLogo.setBounds(32, 23, 60, 60);
		contentPane.add(lblMzBkLogo);
		
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
		contentPane.add(btnSair);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("./imagens maze bank/mazebankbarra.png"));
		lblNewLabel.setBounds(32, 127, 850, 60);
		contentPane.add(lblNewLabel);
		
		JLabel lblStaff = new JLabel("(STAFF)");
		lblStaff.setFont(new Font("Sylfaen", Font.PLAIN, 14));
		lblStaff.setBackground(UIManager.getColor("Button.background"));
		lblStaff.setBounds(260, 64, 60, 21);
		contentPane.add(lblStaff);
		
		JButton btnRelatorioTotalDe = new JButton("Informações dos Clientes");
		btnRelatorioTotalDe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnRelatorioTotalDe.setForeground(Color.WHITE);
		btnRelatorioTotalDe.setFont(new Font("Lato", Font.BOLD, 14));
		btnRelatorioTotalDe.setBackground(new Color(233, 65, 69));
		btnRelatorioTotalDe.setBounds(292, 356, 330, 60);
		contentPane.add(btnRelatorioTotalDe);
	}

}
