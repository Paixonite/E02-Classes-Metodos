public class Conta {
    String nomeDono;
    int numeroConta;
    double saldo;
    double limite;

    void imprimir(){
        System.out.println("Nome do dono da conta: " + this.nomeDono);
        System.out.println("Número da conta: " + this.numeroConta);
        System.out.println("Saldo atual: " + this.saldo);
        System.out.println("Limite: " + this.limite);
    }
}
