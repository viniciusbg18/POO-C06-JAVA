package Banco;

public class Main {
    public static void main(String[] args) {
        Conta conta = new Conta();

        conta.saldo = 70000;
        conta.numero_conta = 12345;
        conta.agencia = 0001;
        conta.limite = 400;
        
        System.out.println("Na conta " + conta.numero_conta + " tem R$" + conta.saldo);

    }
}
