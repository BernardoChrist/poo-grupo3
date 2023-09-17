package br.com.poo.banco.views;

import java.awt.BorderLayout;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.com.poo.banco.pessoas.Funcionario;

import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JSeparator;

public class TelaRelatorioClientes extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	static final String PATH_BASICO = "./temp/";
	static final String EXTENSAO = ".txt";
	private final JButton btnOk = new JButton("OK");

	public TelaRelatorioClientes() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 65, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout()); // Use um gerenciador de layout

		JTextArea textArea = new JTextArea();
		textArea.setToolTipText("");

		JScrollPane scrollPane = new JScrollPane(textArea);
		contentPane.add(scrollPane, BorderLayout.CENTER); // Adicione o scrollPane ao centro do painel

		try {
			BufferedReader reader = new BufferedReader(new FileReader(PATH_BASICO + "banco" + EXTENSAO));
			StringBuilder relatorio = new StringBuilder("Lista de Clientes:\n");

			String line;
			Map<String, String> clienteAgenciaMap = new HashMap<>(); // Mapa para armazenar a agência de cada cliente

			while ((line = reader.readLine()) != null) {
				String[] dados = line.split(";");

				if (dados.length >= 3 && dados[0].equalsIgnoreCase("Cliente")) {
					String nome = dados[1];
					String cpf = dados[2];
					relatorio.append("\nNome: ").append(nome);
					relatorio.append("\nCPF: ").append(cpf);
					if (clienteAgenciaMap.containsKey(cpf)) {
						relatorio.append("\nAgência: ").append(clienteAgenciaMap.get(cpf));
					}
				} else if (dados.length >= 6
						&& (dados[0].equalsIgnoreCase("Poupanca") || dados[0].equalsIgnoreCase("Corrente"))) {
					String cpf = dados[4];
					String agencia = dados[5];
					clienteAgenciaMap.put(cpf, agencia); // Armazena a agência do cliente no mapa
				}
			}
			reader.close();

			textArea.setText(relatorio.toString());
			btnOk.setForeground(new Color(0, 0, 0));
			contentPane.add(btnOk, BorderLayout.SOUTH);
			btnOk.setBackground(new Color(192, 192, 192));
			btnOk.setVerticalAlignment(SwingConstants.BOTTOM);
			
			btnOk.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
					TelaPresidente tP = new TelaPresidente(null);
					tP.setVisible(true);
				}
			});

		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
}