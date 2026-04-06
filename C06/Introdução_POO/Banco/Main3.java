package Introdução_POO.Banco;

public class Main3 {
    public static void main(String[] args) {
        Conta conta = new Conta();
        Cliente cliente  = new Cliente();

        cliente.setNome("JOJO");
        cliente.setCPF("111.111.111-11");

        Cliente cliente1 = new Cliente();
        cliente.setNome("Cesar");

        conta.addCliente(cliente);
        conta.addCliente(cliente1);

        //conta.listarClientes();

        int [][] matriz = new int[5][5];

        /*for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = i + j;
            }
        }*/

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                if (i == j)
                    matriz[i][j] = 1;
                else
                    matriz[i][j] = 0;
            }
        }

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
