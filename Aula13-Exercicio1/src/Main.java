public class Main {

    public static void main(String[] args) {

        Cliente cl1 = new Cliente("Mario", 123654789);
        Cliente cl2 = new Cliente("Jorge", 987456321);
        Cliente cl3 = null;

        Conta conta = new Conta(10000, 1000);

        conta.adicionaCliente(cl1);
        conta.adicionaCliente(cl2);
        conta.adicionaCliente(cl3);

        conta.mostraInfo();

        System.out.println("Fim do processo");

    }
}