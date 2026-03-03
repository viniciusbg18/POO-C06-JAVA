import java.util.Scanner;

public class Ex_5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Entre com o número de alunos: ");
        int numero_de_alunos = teclado.nextInt();
        if(numero_de_alunos != 10 && numero_de_alunos != 20 && numero_de_alunos != 30){
            System.out.println("Número de alunos inválido!");
        } else {
        switch (numero_de_alunos) {
            case 10:
                System.out.println("Utilizaremos a sala I-6");
                break;
            case 20:
                System.out.println("Utilizaremos a sala I-6");
                break;
            case 30:
                System.out.println("Utilizaremos a sala I-5");
            break;
        }
    }
        teclado.close();
    }
}

