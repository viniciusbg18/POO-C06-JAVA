package Exemplo_Aula_3;

public class Ex_2 {
    public static void main(String[] args) {
        int valor_inteira = 30;
        int valor_meia = 15;
        int numero_inteira = 8;
        int numero_meia = 5;

        float total_inteira = (valor_inteira * numero_inteira);
        float total_meia = (valor_meia * numero_meia);
        float total_sessão = total_inteira + total_meia;
        float media_ingresso = total_sessão/13;

        System.out.println("Valor arrecadado nos ingressos de inteira: " + total_inteira);
        System.out.println("Valor arrecadado nos ingressos de meia: " + total_meia);
        System.out.println("Valor total arrecadado na sessão: " + total_sessão);
        System.out.println("Valor médio pago por ingresso: " + media_ingresso);
    }
}
