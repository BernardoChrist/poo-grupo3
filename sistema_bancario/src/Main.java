import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class BancoVirtual {
    List<Agencia> agencias;
    List<Gerente> gerentes;
    private Map<Gerente, List<Cliente>> clientesPorGerente;

    public BancoVirtual() {
        agencias = new ArrayList<>();
        gerentes = new ArrayList<>();
        clientesPorGerente = new HashMap<>();
        criarAgencias();
        contratarGerentes();
    }

    private void criarAgencias() {
        for (int i = 1; i <= 10; i++) {
            Agencia agencia = new Agencia(i);
            agencias.add(agencia);
        }
    }

    private void contratarGerentes() {
        for (int i = 1; i <= 5; i++) {
            Gerente gerente = new Gerente("Gerente " + i);
            gerentes.add(gerente);
            clientesPorGerente.put(gerente, new ArrayList<>());
        }
    }

    public void associarClienteAGerente(Gerente gerente, Cliente cliente) {
        if (clientesPorGerente.containsKey(gerente)) {
            clientesPorGerente.get(gerente).add(cliente);
        }
    }

    public void listarClientesPorAgencia(Gerente gerente, int numeroAgencia) {
        if (clientesPorGerente.containsKey(gerente)) {
            System.out.println("Clientes da Agência " + numeroAgencia + " (Gerente: " + gerente.getNome() + "):");
            List<Cliente> clientes = clientesPorGerente.get(gerente);
            for (Cliente cliente : clientes) {
                if (cliente.getAgencia().getNumero() == numeroAgencia) {
                    System.out.println(cliente.getNome());
                }
            }
        }
    }

    // Resto do código igual ao exemplo anterior
}

class Agencia {
    private int numero;

    public Agencia(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }
}

class Gerente {
    private String nome;

    public Gerente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}

class Cliente {
    private String nome;
    private Agencia agencia;

    public Cliente(String nome, Agencia agencia) {
        this.nome = nome;
        this.agencia = agencia;
    }

    public String getNome() {
        return nome;
    }

    public Agencia getAgencia() {
        return agencia;
    }
}

public class Main {
    public static void main(String[] args) {
        BancoVirtual banco = new BancoVirtual();
        
        // Associar clientes a agências e gerentes
        Agencia agencia1 = banco.agencias.get(0);
        Agencia agencia2 = banco.agencias.get(1);
        Gerente gerente1 = banco.gerentes.get(0);
        Gerente gerente2 = banco.gerentes.get(1);
        
        Cliente cliente1 = new Cliente("Cliente 1", agencia1);
        Cliente cliente2 = new Cliente("Cliente 2", agencia1);
        Cliente cliente3 = new Cliente("Cliente 3", agencia2);
        Cliente cliente4 = new Cliente("Cliente 4", agencia2);
        
        banco.associarClienteAGerente(gerente1, cliente1);
        banco.associarClienteAGerente(gerente1, cliente2);
        banco.associarClienteAGerente(gerente2, cliente3);
        banco.associarClienteAGerente(gerente2, cliente4);
        
        // Gerar relatório
        banco.listarClientesPorAgencia(gerente1, agencia1.getNumero());
        banco.listarClientesPorAgencia(gerente2, agencia2.getNumero());
    }
}
