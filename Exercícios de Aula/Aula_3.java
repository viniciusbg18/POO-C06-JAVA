import java.util.Scanner;

public class Aula_3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Entre com um número : ");
        int qtd = teclado.nextInt();

        if(qtd >= 5)
            System.out.println("Qtd é maior do que 5");
        else if(qtd >= 3 && qtd < 5){
            System.out.println("Qtd é maior do que 3");
        } else {
            System.out.println("Qtd é menor ou igual a 3");
        }

        teclado.close();
    }
}
