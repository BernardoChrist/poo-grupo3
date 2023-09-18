package br.com.poo.banco.views;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

import br.com.poo.banco.pessoas.Funcionario;

public class TelaDiretor extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel btnInfoClie;

	/**
	 * Create the frame.
	 */
	public TelaDiretor(Funcionario funcionario) {
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
		btnContAge.addActionListener(new ActionListener() {
			static final String PATH_BASICO = "./temp/";
			static final String EXTENSAO = ".txt";

			public void actionPerformed(ActionEvent e) {
				Map<String, Integer> contasPorAgencia = new HashMap<>(); // Mapa para armazenar o número de contas de
																			// cada agência

				try {
					BufferedReader reader = new BufferedReader(new FileReader(PATH_BASICO + "banco" + EXTENSAO));
					String line;

					while ((line = reader.readLine()) != null) {
						String[] dados = line.split(";");

						if (dados.length >= 6
								&& (dados[0].equalsIgnoreCase("Poupanca") || dados[0].equalsIgnoreCase("Corrente"))) {
							String agencia = dados[5];
							contasPorAgencia.put(agencia, contasPorAgencia.getOrDefault(agencia, 0) + 1);
						}
					}
					reader.close();

				} catch (IOException ex) {
					ex.printStackTrace();
				}

				StringBuilder relatorio = new StringBuilder("Número de Contas por Agência:\n");

				for (Map.Entry<String, Integer> entry : contasPorAgencia.entrySet()) {
					String agencia = entry.getKey();
					int totalContas = entry.getValue();
					relatorio.append("\nAgência: ").append(agencia).append("\nTotal de Contas: ").append(totalContas)
							.append("\n");
				}

				JTextArea textArea = new JTextArea(20, 30);
				textArea.setText(relatorio.toString());
				textArea.setEditable(false);

				JScrollPane scrollPane = new JScrollPane(textArea);
				scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

				JOptionPane.showMessageDialog(null, scrollPane, "Relatório", JOptionPane.INFORMATION_MESSAGE);
			}

		});
		btnContAge.setBackground(new Color(233, 65, 69));
		btnContAge.setForeground(new Color(255, 255, 255));
		btnContAge.setFont(new Font("Lato", Font.BOLD, 14));
		btnContAge.setBounds(662, 241, 220, 60);
		btnInfoClie.add(btnContAge);

		JButton btnCadCli = new JButton("Cadastrar Cliente");
		btnCadCli.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaCadastroCliente Cadastro = new TelaCadastroCliente(funcionario);
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
				TelaCadastroFunc gerenteCad = new TelaCadastroFunc(funcionario);
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

		JLabel TextUsuarioCC = new JLabel(funcionario.getNome());
		TextUsuarioCC.setForeground(Color.WHITE);
		TextUsuarioCC.setFont(new Font("Lato", Font.BOLD, 18));
		TextUsuarioCC.setBackground(Color.WHITE);
		TextUsuarioCC.setBounds(37, 133, 180, 30);
		btnInfoClie.add(TextUsuarioCC);

		JLabel lblMzBkLogo = new JLabel("logo");
		lblMzBkLogo.setIcon(new ImageIcon("./imagens maze bank/mazebanklogo.png"));
		lblMzBkLogo.setForeground(new Color(0, 0, 0));
		lblMzBkLogo.setFont(new Font("Tahoma", Font.PLAIN, 5));
		lblMzBkLogo.setBounds(32, 23, 60, 60);
		btnInfoClie.add(lblMzBkLogo);

		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente sair?", "Confirmação de Saída",
						JOptionPane.YES_NO_OPTION);
				if (resposta == JOptionPane.YES_OPTION) {
					dispose();
					TelaLogin login = new TelaLogin();
					login.setVisible(true);
				}
			}
		});
		btnSair.setForeground(Color.WHITE);
		btnSair.setFont(new Font("Lato", Font.BOLD, 14));
		btnSair.setBackground(new Color(233, 65, 69));
		btnSair.setBounds(760, 145, 100, 30);
		btnInfoClie.add(btnSair);

		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("./imagens maze bank/mazebankbarra.png"));
		lblNewLabel.setBounds(32, 127, 850, 60);
		btnInfoClie.add(lblNewLabel);

		JLabel lblStaff = new JLabel("(STAFF)");
		lblStaff.setFont(new Font("Sylfaen", Font.PLAIN, 14));
		lblStaff.setBackground(UIManager.getColor("Button.background"));
		lblStaff.setBounds(260, 64, 60, 21);
		btnInfoClie.add(lblStaff);

		JButton btnRelatorioTotalDe = new JButton("Informações dos Clientes");
		btnRelatorioTotalDe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnRelatorioTotalDe.setForeground(Color.WHITE);
		btnRelatorioTotalDe.setFont(new Font("Lato", Font.BOLD, 14));
		btnRelatorioTotalDe.setBackground(new Color(233, 65, 69));
		btnRelatorioTotalDe.setBounds(347, 384, 220, 60);
		btnInfoClie.add(btnRelatorioTotalDe);

	}
}
