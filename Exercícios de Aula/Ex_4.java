import java.util.Scanner;

public class Ex_4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int npa = teclado.nextInt();
        if(npa >= 60){
            System.out.println("O aluno está aprovado!");
        } else if(npa >= 30 && npa < 60){
            System.out.println("O aluno está em recuperação!");
        } else {
            System.out.println("O aluno está reprovado!");
        }
        teclado.close();
    }
}
