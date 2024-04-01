public class Main {
    public static void main(String[] args) {
        Conta cliente = new Conta();

        cliente.nomeDono = "JOAO";
        cliente.numeroConta = 12345;
        cliente.saldo = 120.00;
        cliente.limite = 10000;

        cliente.imprimir();
    }
}
