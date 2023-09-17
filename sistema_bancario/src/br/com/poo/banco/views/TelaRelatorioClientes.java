package br.com.poo.banco.views;

import java.awt.BorderLayout;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JTextArea;
import javax.swing.JScrollPane;

public class TelaRelatorioClientes extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	static final String PATH_BASICO = "./temp/";
	static final String EXTENSAO = ".txt";

	public TelaRelatorioClientes() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

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
			String agenciaTemp = ""; // Variável temporária para armazenar a agência
			String nome = "";
			String cpf = "";
			String agencia = "";

			while ((line = reader.readLine()) != null) {
				String[] dados = line.split(";");

				if (dados.length >= 3 && dados[0].equalsIgnoreCase("Cliente")) {
					nome = dados[1];
					cpf = dados[2];
				} else if (dados.length >= 6
						&& (dados[0].equalsIgnoreCase("Poupanca") || dados[0].equalsIgnoreCase("Corrente"))) {
					agenciaTemp = dados[5]; // Armazena temporariamente a agência
					cpf = dados[4];
				}

				if (!nome.isEmpty()) {
					relatorio.append("\nNome: ").append(nome);
				}
				if (!cpf.isEmpty()) {
					relatorio.append("\nCPF: ").append(cpf);
				}

				if (!agenciaTemp.isEmpty()) {
					agencia = agenciaTemp; // Atribui a agência temporária ao cliente
					relatorio.append("\nAgência: ").append(agencia);
					agenciaTemp = ""; // Limpa a variável temporária
				}
			}
			reader.close();

			textArea.setText(relatorio.toString());

		} catch (IOException ex) {
			ex.printStackTrace();
		}

		setVisible(true);
	}
}