package Exemplo_Aula_3;

import java.util.Scanner;
import java.util.Random;

public class Ex_7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();
        int x = aleatorio.nextInt(10)+1;
        System.out.println("Escolha um número"); 
        int numero = teclado.nextInt();
        while(numero != x){
            if(numero < x){
                System.out.println("Tente um númeor maior");
            }else if(numero > x){
                System.out.println("Tente um número menor");
            }
            numero = teclado.nextInt();
        }      
        teclado.close();
    }
}
