package Exemplo_Aula_3;

import java.util.Scanner;

public class Ex_3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int lanches_primeira_hora = teclado.nextInt();
        int lanches_segunda_hora = teclado.nextInt();
        int lanches_terciera_hora = teclado.nextInt();
        
        int total_lanches = lanches_primeira_hora + lanches_segunda_hora + lanches_terciera_hora;
        System.out.println("Total de lanches consumidos: " + total_lanches);
        double media_lanches = total_lanches/3;
        System.out.println("Média de lanches consumidos: " + media_lanches);

        teclado.close();
    }
}
