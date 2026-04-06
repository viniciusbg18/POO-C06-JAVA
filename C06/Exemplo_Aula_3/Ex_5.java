package Exemplo_Aula_3;

import java.util.Scanner;

public class Ex_5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Insira o número de alunos: ");
        int numero_alunos = teclado.nextInt();
        switch(numero_alunos){
            case 10:
                System.out.println("Sala I-6");
                break;

            case 20:
                System.out.println("Sala I-6");
                break;

            case 30:
                System.out.println("Sala I-5");
                break;

            default:
                System.out.println("Número inválido");
        }
        teclado.close();
    }
}
