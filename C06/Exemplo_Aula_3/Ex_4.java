package Exemplo_Aula_3;

import java.util.Scanner;

public class Ex_4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe a NPA: ");
        int NPA = teclado.nextInt();
        if(NPA >= 60){
            System.out.println("O aluno está aprovado!");
        }else if(NPA < 30){
            System.out.println("O aluno está reprovado!");
        }
        else{
            System.out.println("O aluno está de NP3! Informe a sua nota: ");
            int NP3 = teclado.nextInt();
            int NFA = (NPA + NP3)/2;
            if(NFA >= 50){
                System.out.println("O aluno está aprovado!");
            }else{
                System.out.println("O aluno está reprovado!");
            }
        }
        teclado.close();
    }
}
