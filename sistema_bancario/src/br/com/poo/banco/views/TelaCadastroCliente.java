package br.com.poo.banco.views;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

import br.com.poo.banco.pessoas.Funcionario;

public class TelaCadastroCliente extends JFrame {

	private JPanel contentPane;
	private JTextField textNomeCad;
	private JTextField textEndereco;
	private JTextField textCpfCad;
	private final Action action = new SwingAction();
	private JPasswordField passwordSenhaCad;
	private JTextField textTelefone;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public TelaCadastroCliente(Funcionario funcionario) {
		setResizable(false);
		setTitle("Novo Cliente");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 930, 630);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(235, 235, 235));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JLabel TextNome = new JLabel("Nome");
		TextNome.setFont(new Font("Tahoma", Font.BOLD, 13));
		TextNome.setBounds(46, 239, 45, 13);
		contentPane.add(TextNome);
		
		textNomeCad = new JTextField();
		textNomeCad.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textNomeCad.setBounds(44, 258, 286, 20);
		contentPane.add(textNomeCad);
		textNomeCad.setColumns(10);
		
		JButton btnCriaConta = new JButton("Criar Conta");
		btnCriaConta.addActionListener(new ActionListener() {
			static final String PATH_BASICO = "./temp/";
            static final String EXTENSAO = ".txt";
			public void actionPerformed(ActionEvent e) {
				 
				String nome = textNomeCad.getText();
	                String textendereco = textEndereco.getText();
	                String cpf = textCpfCad.getText();
	                String senha = new String(passwordSenhaCad.getPassword());
	                String textTelefone = new String();

	                // Cria uma string com os dados do cliente
	                String dadosCliente = "\nCliente;" + nome + ";" +
	                                      textEndereco + ";" +
	                                        cpf + ";" +
	                                      senha + ";";
	                
	                if(nome == null || textEndereco == null || cpf == null || senha == null) {
	                	 JOptionPane.showMessageDialog(null, "Preencha todos os espaços vazios.");
	                	 return;
	                }
	               

	                try (BufferedWriter writer = new BufferedWriter(new FileWriter(PATH_BASICO + "banco" + EXTENSAO, true))) {
	                    // Escreve os dados do cliente no arquivo
	                    writer.write(dadosCliente);
	                    writer.close();
	                } catch (IOException ex) {
	                    ex.printStackTrace();
	                }

	                JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso.");
	            }
	        });
		btnCriaConta.setForeground(new Color(255, 255, 255));
		btnCriaConta.setFont(new Font("Lato", Font.BOLD, 16));
		btnCriaConta.setBackground(new Color(233, 65, 69));
		btnCriaConta.setBounds(639, 499, 200, 60);
		contentPane.add(btnCriaConta);
		
		JLabel TextNome_1 = new JLabel("Endereço");
		TextNome_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		TextNome_1.setBounds(46, 332, 142, 13);
		contentPane.add(TextNome_1);
		
		textEndereco = new JTextField();
		textEndereco.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textEndereco.setColumns(10);
		textEndereco.setBounds(44, 349, 286, 20);
		contentPane.add(textEndereco);
		
		JLabel lblStaff = new JLabel("(STAFF)");
		lblStaff.setFont(new Font("Sylfaen", Font.PLAIN, 14));
		lblStaff.setBackground(UIManager.getColor("Button.background"));
		lblStaff.setBounds(260, 64, 60, 21);
		contentPane.add(lblStaff);
		
		JLabel TextNome_2 = new JLabel("CPF");
		TextNome_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		TextNome_2.setBounds(46, 288, 45, 13);
		contentPane.add(TextNome_2);
		
		textCpfCad = new JTextField();
		textCpfCad.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textCpfCad.setColumns(10);
		textCpfCad.setBounds(44, 305, 286, 20);
		contentPane.add(textCpfCad);
		
		JLabel TextNome_3 = new JLabel("Senha");
		TextNome_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		TextNome_3.setBounds(590, 287, 45, 13);
		contentPane.add(TextNome_3);
		
		JLabel TextNovoCadastro = new JLabel("Cadastro de Clientes");
		TextNovoCadastro.setForeground(new Color(255, 255, 255));
		TextNovoCadastro.setBackground(new Color(255, 255, 255));
		TextNovoCadastro.setBounds(380, 161, 154, 30);
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
		
		JLabel TextUsuarioCadastrador = new JLabel(funcionario.getNome());
		TextUsuarioCadastrador.setForeground(Color.WHITE);
		TextUsuarioCadastrador.setFont(new Font("Lato", Font.BOLD, 18));
		TextUsuarioCadastrador.setBackground(Color.WHITE);
		TextUsuarioCadastrador.setBounds(37, 133, 179, 30);
		contentPane.add(TextUsuarioCadastrador);
		
		JLabel lblMazeBankBarra = new JLabel("");
		lblMazeBankBarra.setIcon(new ImageIcon("./imagens maze bank/mazebankbarra.png"));
		lblMazeBankBarra.setBounds(32, 127, 850, 60);
		contentPane.add(lblMazeBankBarra);
		
		JLabel lblMzBkLogo = new JLabel("logo");
		lblMzBkLogo.setIcon(new ImageIcon("./imagens maze bank/mazebanklogo.png"));
		lblMzBkLogo.setForeground(new Color(0, 0, 0));
		lblMzBkLogo.setFont(new Font("Tahoma", Font.PLAIN, 5));
		lblMzBkLogo.setBounds(32, 23, 60, 60);
		contentPane.add(lblMzBkLogo);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setForeground(new Color(255, 255, 255));
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnVoltar.setFont(new Font("Lato", Font.BOLD, 16));
		btnVoltar.setBackground(new Color(233, 65, 69));
		btnVoltar.setBounds(94, 499, 200, 60);
		contentPane.add(btnVoltar);
		
		passwordSenhaCad = new JPasswordField();
		passwordSenhaCad.setBounds(587, 305, 286, 20);
		contentPane.add(passwordSenhaCad);
		
		JLabel TextNome_3_1 = new JLabel("Telefone");
		TextNome_3_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		TextNome_3_1.setBounds(588, 239, 60, 13);
		contentPane.add(TextNome_3_1);
		
		textTelefone = new JTextField();
		textTelefone.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textTelefone.setColumns(10);
		textTelefone.setBounds(587, 259, 286, 20);
		contentPane.add(textTelefone);
		
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
