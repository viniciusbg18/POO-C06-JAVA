import java.util.Scanner;

public class Ex_4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int nfa;
        int npa = teclado.nextInt();
        if(npa >= 60){
            nfa = npa;
            System.out.println("O aluno está aprovado!");
        } else if(npa >= 30 && npa < 60){;
            System.out.println("O aluno terá que fazer NP3!");
            int np3 = teclado.nextInt();
            nfa = (npa + np3) / 2;
            if (nfa >= 50) {
                System.out.println("O aluno está aprovado!");
            } else {
                System.out.println("O aluno está reprovado!");
            }
        } else {
            nfa = npa;
            System.out.println("O aluno está reprovado!");
        }
        teclado.close();
    }
}
