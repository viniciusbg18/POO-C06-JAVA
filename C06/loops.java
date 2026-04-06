import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        Scanner inatel = new Scanner(System.in);
        System.out.println("Entre com a quantidade: ");
        int qtd = inatel.nextInt();

        for(int i = 0; i < qtd; i++){
            System.out.println("Inatel");
        }

        int j = 0; // Variável de controle para o loop while
        while(j < qtd){
            System.out.println("Inatel");
            j++;// Incrementando a variável de controle para evitar loop infinito
        }

        int k = 0;
        do{
            System.out.println("Inatel");
            k++;
        } while(k < qtd);

        inatel.close();
    }
}
