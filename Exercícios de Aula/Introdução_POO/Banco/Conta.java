package Introdução_POO.Banco;

public class Conta {
    //atributos
    public double saldo;
    public double limite;
    public int agencia;
    public int numero; // numero e numeroConta tem o mesmo papel, porem são de aulas diferentes 
    public int numeroConta;
    public String nomeDono;

    //métodos 
    public void deposita (double quantia){
        this.saldo = this.saldo + quantia;
        //this.saldo += quantia 
    }
    public void saca(double quantia){
        this.saldo = this.saldo - quantia;

    }

    public void transferir(Conta contaDestino, double quantia){
        this.saldo -= quantia;
        contaDestino.saldo += quantia;
    }
}
