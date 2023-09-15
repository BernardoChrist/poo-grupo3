package br.com.poo.banco.views;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

public class TelaDiretor extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField ClienteField;

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
		contentPane = new JPanel();
		contentPane.setBackground(new Color(235, 235, 235));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));


		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel TextPainelDiretor = new JLabel("Painel do Diretor");
		TextPainelDiretor.setBounds(441, 255, 102, 13);
		TextPainelDiretor.setFont(new Font("Tahoma", Font.BOLD, 12));
		contentPane.add(TextPainelDiretor);
		
		JButton RelClientesButton = new JButton("Relatorio de clientes");
		RelClientesButton.setBounds(330, 384, 125, 21);
		contentPane.add(RelClientesButton);
		
		JButton CadastrarClienteButton = new JButton("Cadastrar Cliente");
		CadastrarClienteButton.setBounds(307, 446, 126, 21);
		contentPane.add(CadastrarClienteButton);
		
		JButton CadastrarGerenteButton = new JButton("Cadastrar Gerente");
		CadastrarGerenteButton.setBounds(443, 446, 126, 21);
		contentPane.add(CadastrarGerenteButton);
		
		JLabel TextTotalContas = new JLabel("Total de Contas:");
		TextTotalContas.setBounds(330, 295, 76, 13);
		contentPane.add(TextTotalContas);
		
		JLabel TotalContas = new JLabel("\"Numero de contas\"");
		TotalContas.setBounds(404, 295, 111, 13);
		contentPane.add(TotalContas);
		
		ClienteField = new JTextField();
		ClienteField.setBounds(330, 332, 96, 19);
		ClienteField.setColumns(10);
		contentPane.add(ClienteField);
		
		JButton PesquisarButton = new JButton("Pesquisar");
		PesquisarButton.setBounds(330, 361, 76, 13);
		PesquisarButton.setFont(new Font("Tahoma", Font.PLAIN, 9));
		contentPane.add(PesquisarButton);
		
		JLabel TextProcurarCliente = new JLabel("Procurar Cliente:");
		TextProcurarCliente.setBounds(330, 317, 101, 13);
		contentPane.add(TextProcurarCliente);
		
		JButton SairButton = new JButton("Sair");
		SairButton.setBounds(447, 477, 85, 21);
		contentPane.add(SairButton);
		
		JLabel TextNovoCadastro = new JLabel("Diretor");
		TextNovoCadastro.setForeground(new Color(255, 255, 255));
		TextNovoCadastro.setBackground(new Color(255, 255, 255));
		TextNovoCadastro.setBounds(430, 161, 54, 30);
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
		
		JLabel lblOfPetrpolisCity_1 = new JLabel("OF PETRÓPOLIS CITY");
		lblOfPetrpolisCity_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblOfPetrpolisCity_1.setBackground(UIManager.getColor("Button.background"));
		lblOfPetrpolisCity_1.setBounds(67, 241, 150, 16);
		contentPane.add(lblOfPetrpolisCity_1);
		
		JLabel lblStaff = new JLabel("STAFF");
		lblStaff.setFont(new Font("Sylfaen", Font.PLAIN, 14));
		lblStaff.setBackground(UIManager.getColor("Button.background"));
		lblStaff.setBounds(99, 80, 48, 21);
		contentPane.add(lblStaff);
		
	}
}
