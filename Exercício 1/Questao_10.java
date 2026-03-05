import java.util.Scanner;

public class Questao_10 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);        
    System.out.println("Escreva a quantidade de ingressos de inteira comprados: ");
    int ingressos_inteira = teclado.nextInt();
    System.out.println("Escreva a quantidade de ingressos de meia comprados: ");
    int ingressos_meia = teclado.nextInt();
    System.out.println("Escreva o valor do ingresso de inteira:");
    double valor_inteira = Double.parseDouble(teclado.next().replace(",", "."));
    System.out.println("Escreva o valor do ingresso de meia:");
    double valor_meia = Double.parseDouble(teclado.next().replace(",", "."));

    int total_inteira = ingressos_inteira * (int)valor_inteira;
    int total_meia = ingressos_meia * (int)valor_meia;
    int total_arrecadado = total_inteira + total_meia;
    double media_por_ingresso = (double)total_arrecadado / (ingressos_inteira + ingressos_meia);
    System.out.println("Total da inteira: " + total_inteira);
    System.out.println("Total da meia: " + total_meia);
    System.out.println("Total arrecadado: " + total_arrecadado);
    System.out.println("Média arrecadada por ingresso: " + media_por_ingresso);
    teclado.close();    
    }
}
