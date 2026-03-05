import java.util.Random;
import java.util.Scanner;

public class Ex_6 {
    public static void main(String[] args) {
        Random  rand = new Random();
        Scanner teclado = new Scanner(System.in);
        int x = rand.nextInt(10) + 1; // Gerando um número aleatório entre 1 a 10
        int tentativa = 0;
        while(tentativa != x){
            System.out.println("Digite um número de 1 a 10: ");
            tentativa = teclado.nextInt();
            if(tentativa == x){
                System.out.println("Parabéns, você acertou!");
            } else {
                System.out.println("Tente novamente!");
            }
        }
        teclado.close();
    }
}
