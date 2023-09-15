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
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class TelaExtratoCC extends JFrame {

	private JPanel contentPane;
	private JTable tableExtraCC;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaExtratoCC frame = new TelaExtratoCC();
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
	public TelaExtratoCC() {
		setResizable(false);
		setTitle("Extrato Conta Corrente");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 930, 630);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(235, 235, 235));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel TextNovoCadastro = new JLabel("Extrato da Conta");
		TextNovoCadastro.setForeground(new Color(255, 255, 255));
		TextNovoCadastro.setBackground(new Color(255, 255, 255));
		TextNovoCadastro.setBounds(388, 161, 137, 30);
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
		lblMzBkLogo.setIcon(new ImageIcon(
				"./imagens maze bank/mazebanklogo.png"));
		lblMzBkLogo.setForeground(new Color(0, 0, 0));
		lblMzBkLogo.setFont(new Font("Tahoma", Font.PLAIN, 5));
		lblMzBkLogo.setBounds(32, 23, 60, 60);
		contentPane.add(lblMzBkLogo);

		JLabel TextSaldoCC = new JLabel("Cheque Esp: R$500,00");
		TextSaldoCC.setForeground(new Color(0, 0, 0));
		TextSaldoCC.setFont(new Font("Lato", Font.BOLD, 15));
		TextSaldoCC.setBackground(Color.WHITE);
		TextSaldoCC.setBounds(707, 71, 211, 30);
		contentPane.add(TextSaldoCC);

		JLabel lblChequeEsp = new JLabel("Saldo: R$10.000,00");
		lblChequeEsp.setForeground(Color.BLACK);
		lblChequeEsp.setFont(new Font("Lato", Font.BOLD, 15));
		lblChequeEsp.setBackground(Color.WHITE);
		lblChequeEsp.setBounds(727, 53, 192, 30);
		contentPane.add(lblChequeEsp);

		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente sair?", "Confirmação de Saída",
						JOptionPane.YES_NO_OPTION);
				if (resposta == JOptionPane.YES_OPTION) {
//						dispose();
//						TelaContaCorrente Conta = new TelaContaCorrente();
//						Conta.setVisible(true);
				}
			}
		});
		btnSair.setForeground(Color.WHITE);
		btnSair.setFont(new Font("Lato", Font.BOLD, 14));
		btnSair.setBackground(new Color(233, 65, 69));
		btnSair.setBounds(760, 145, 100, 30);
		contentPane.add(btnSair);

		JLabel lblConta = new JLabel("Conta: 123456-7");
		lblConta.setForeground(Color.WHITE);
		lblConta.setFont(new Font("Lato", Font.BOLD, 13));
		lblConta.setBackground(Color.WHITE);
		lblConta.setBounds(38, 155, 165, 30);
		contentPane.add(lblConta);

		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(
				"./imagens maze bank/mazebankbarra.png"));
		lblNewLabel.setBounds(32, 127, 850, 60);
		contentPane.add(lblNewLabel);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(31, 222, 851, 201);
		contentPane.add(scrollPane);

		tableExtraCC = new JTable();
		tableExtraCC.setFont(new Font("Lato", Font.BOLD, 14));
		scrollPane.setViewportView(tableExtraCC);
		tableExtraCC.setModel(new DefaultTableModel(
				new Object[][] { { null, null, null }, { null, null, null }, { null, null, null }, { null, null, null },
						{ null, null, null }, { null, null, null }, { null, null, null }, { null, null, null },
						{ null, null, null }, { null, null, null }, { null, null, null }, { null, null, null },
						{ null, null, null }, { null, null, null }, { null, null, null }, },
				new String[] { "Data da Opera\u00E7\u00E3o", "Valor R$", "Saldo R$" }) {
			boolean[] columnEditables = new boolean[] { false, false, false };

			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});

		JButton btnImpExtra = new JButton("Imprimir");
		btnImpExtra.setForeground(Color.WHITE);
		btnImpExtra.setFont(new Font("Lato", Font.BOLD, 14));
		btnImpExtra.setBackground(new Color(233, 65, 69));
		btnImpExtra.setBounds(347, 481, 220, 60);
		contentPane.add(btnImpExtra);
		tableExtraCC.getColumnModel().getColumn(0).setResizable(false);
		tableExtraCC.getColumnModel().getColumn(0).setPreferredWidth(285);
		tableExtraCC.getColumnModel().getColumn(1).setResizable(false);
		tableExtraCC.getColumnModel().getColumn(1).setPreferredWidth(285);
		tableExtraCC.getColumnModel().getColumn(2).setResizable(false);
		tableExtraCC.getColumnModel().getColumn(2).setPreferredWidth(285);
	}
}
