public class Main {
    public static void main(String[] args) {
        Conta conta = new Conta();

        conta.dono.nome = "JOAO";
        conta.dono.CPF = "111.222.333-44";
        conta.dono.endereco = "BH";
        conta.dono.idade = 30;
        conta.dono.sexo = 'M';

        conta.numeroConta = 12345;
        conta.saldo = 120.00;
        conta.limite = 10000;

        conta.imprimir();
    }
}
