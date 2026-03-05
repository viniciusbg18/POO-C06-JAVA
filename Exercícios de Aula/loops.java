import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        Scanner inatel = new Scanner(System.in);
        System.out.println("Entre com a quantidade: ");
        int qtd = inatel.nextInt();

        for(int i = 0; i < qtd; i++){
            System.out.println("Inatel");
        }

        int j = 0;
        while(j < qtd){
            System.out.println("Inatel");
            j++;
        }

        int k = 0;
        do{
            System.out.println("Inatel");
            k++;
        } while(k < qtd);

        inatel.close();
    }
}
