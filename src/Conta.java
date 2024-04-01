public class Conta {
    Cliente dono = new Cliente();
    int numeroConta;
    double saldo;
    double limite;

    void imprimir(){
        System.out.println(this.dono.nome);
        System.out.println(this.dono.CPF);
        System.out.println(dono.idade);
        System.out.println(dono.sexo);
        System.out.println(numeroConta);
        System.out.println(saldo);
        System.out.println(limite);
    }
}


