import java.util.HashSet;
import java.util.Set;

public class Conta {

    private double saldo;
    private double limite;
    private Set<Cliente> clientes = new HashSet<Cliente>();

    public Conta(double saldo, double limite) {
        this.saldo = saldo;
        this.limite = limite;
    }

    public void adicionaCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void mostraInfo() {
        System.out.println("Saldo disponivel: R$" + saldo);
        System.out.println("Limite maximo: R$" + limite);

        for (Cliente cliente : clientes) {
            try {
                System.out.println("Nome: " + cliente.getNome());
                System.out.println("CPF: " + cliente.getCpf());
            } catch (NullPointerException e) {
                System.out.println("Nenhum cliente foi encontrado nessa posicao!");
            }
        }
    }
}