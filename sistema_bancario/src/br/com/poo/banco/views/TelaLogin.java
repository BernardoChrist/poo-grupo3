package br.com.poo.banco.views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.com.poo.banco.contas.Conta;
import br.com.poo.banco.enums.ContaEnum;
import br.com.poo.banco.enums.PessoaEnum;
import br.com.poo.banco.pessoas.Cliente;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextPane;
import java.awt.Color;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFormattedTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TelaLogin extends JFrame {

	private JPanel contentPane;
	private JPasswordField SenhaField;


	/**
	 * Create the frame.
	 */
	public TelaLogin() {
		setTitle("Tela Login");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(85, 106, 95));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel TextLogin = new JLabel("Login");
		TextLogin.setFont(new Font("Arial", Font.PLAIN, 25));
		TextLogin.setBounds(180, 7, 69, 44);
		contentPane.add(TextLogin);
		
		JTextPane usuarioField = new JTextPane();
		usuarioField.setBounds(101, 109, 228, 20);
		contentPane.add(usuarioField);
		
		JLabel TextUsuario = new JLabel("Usuario");
		TextUsuario.setFont(new Font("Calibri", Font.PLAIN, 14));
		TextUsuario.setBounds(101, 87, 48, 28);
		contentPane.add(TextUsuario);
		
		SenhaField = new JPasswordField();
		SenhaField.setBounds(101, 152, 228, 20);
		contentPane.add(SenhaField);
		
		JLabel TextSenha = new JLabel("Senha");
		TextSenha.setFont(new Font("Calibri", Font.PLAIN, 12));
		TextSenha.setBounds(101, 131, 48, 28);
		contentPane.add(TextSenha);
		
		JComboBox<String> comboBoxCargo = new JComboBox<>();
		comboBoxCargo.setSelectedIndex(3);
		comboBoxCargo.setMaximumRowCount(3);
		comboBoxCargo.setToolTipText("Cliente\r\nFuncionario\r\nGerente\r\nDiretor\r\nPresidente");
		List<PessoaEnum> pessoas = Arrays.asList(PessoaEnum.values());
		comboBoxCargo.addItem("Selecione o cargo");
		for(PessoaEnum pEnum : pessoas) {
			comboBoxCargo.addItem(pEnum.getTipoPessoa());
		}
		comboBoxCargo.setBounds(101, 58, 148, 21);
		contentPane.add(comboBoxCargo);
		
		JButton EntrarButton = new JButton("Entrar");
		EntrarButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cpf = usuarioField.getText();
				String senha = new String(SenhaField.getPassword());
				String tipoPessoa = comboBoxCargo.getSelectedItem().toString();
				boolean verificaCC = false;
				boolean verificaCP = false;
				Cliente cliente = Cliente.mapaClientes.get(cpf);
				
				List<Conta> contas = new ArrayList<>();
				for(Conta c : Conta.mapaContas.values()) {
					if(c.getCpfConta().equals(cpf)) {
						contas.add(c); 
					}
				} 
				
				if(tipoPessoa.equalsIgnoreCase(PessoaEnum.CLIENTE.getTipoPessoa())) {
					if(cliente.getCpf().equals(cpf) && cliente.getSenha().equals(senha)) {
						if(contas.size() > 1) {
							verificaCC = true;
							verificaCP = true;
						}else if(contas.get(0).getTipoConta().equalsIgnoreCase(ContaEnum.CORRENTE.name())){
							verificaCC = true;
						}else if(contas.get(0).getTipoConta().equalsIgnoreCase(ContaEnum.POUPANCA.name())){
							verificaCP = true;
						}
						dispose();
						TelaCC telaCC = new TelaCC(verificaCC, verificaCP);
						telaCC.setLocationRelativeTo(telaCC);
						telaCC.setVisible(true);		
					}
				}
				
			}
		});
		EntrarButton.setBounds(178, 224, 69, 23);
		contentPane.add(EntrarButton);
		
	}
}
