package Introdução_POO.Banco;

public class Conta {

    //atributos
    
    private double saldo;
    //private double limite;
    public int agencia;
    //private int numero; // numero e numeroConta tem o mesmo papel, porem são de aulas diferentes 
    //public int numeroConta;
    //public String nomeDono;
    //public Cliente titular;
    private Cliente clientes[] = new Cliente[5];

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

    public void addCliente(Cliente cliente){
        for(int i = 0; i < this.clientes.length; i++){
            if (this.clientes[i] == null){
                this.clientes[i] = cliente;
                break;
            }
        }
    }

    public void listarClientes(){
        for(Cliente cliente : this.clientes){
            if(cliente != null)
                System.out.println(cliente.getNome());
        }
    }
}
