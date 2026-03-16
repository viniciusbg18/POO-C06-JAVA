package Introdução_POO.Banco;

public class Main2 {
    public static void main(String[] args) {
        
        /*Conta contaCorrente = new Conta();

        contaCorrente.saldo = 1000;
        contaCorrente.nomeDono = "Giovanna";
        System.out.println("Conta de " + contaCorrente.nomeDono + " possui R$" + contaCorrente.saldo);

        contaCorrente.saca(7000);

        System.out.println("Conta de " + contaCorrente.nomeDono + " possui R$" + contaCorrente.saldo);
    
        contaCorrente.saca(2500);

        System.out.println("Conta de " + contaCorrente.nomeDono + " possui R$" + contaCorrente.saldo);

        System.out.println("_______________________________");

        Conta contaCorrente2 = new Conta();

        contaCorrente2.saldo = 3500;
        contaCorrente2.nomeDono = "Vinícius";
        
        System.out.println("Conta de " + contaCorrente2.nomeDono + " possui R$" + contaCorrente2.saldo);

        contaCorrente2.saca(1000);

        System.out.println("Conta de " + contaCorrente2.nomeDono + " possui R$" + contaCorrente2.saldo);
    
        contaCorrente2.saca(5000);

        System.out.println("Conta de " + contaCorrente2.nomeDono + " possui R$" + contaCorrente2.saldo);*/
        //-----------------------------------------------------------------------------------------//

        Conta contaCorrente = new Conta();

        contaCorrente.saldo = 1000;
        contaCorrente.nomeDono = "Giovanna";

        Conta contaCorrente2 = new Conta();

        contaCorrente2.saldo = 3500;
        contaCorrente2.nomeDono = "Vinícius";
        
        if(contaCorrente == contaCorrente2)
            System.out.println("São iguais");
        else
            System.out.println("São diferentes");

        

    }
}
