package Exemplo_Aula_3;

import java.util.Scanner;
import java.util.Random;

public class Ex_6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();
        int x = aleatorio.nextInt(10)+1;
        System.out.println("Escolha um número"); 
        int numero = teclado.nextInt();
        while(numero != x){
            System.out.println("Tente novamente");
            numero = teclado.nextInt(); 
        }      
        teclado.close();
    }
}
