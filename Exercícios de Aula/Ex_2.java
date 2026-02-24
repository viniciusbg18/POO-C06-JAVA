public class Ex_2 {
    public static void main(String[] args) {
        var ingressos_inteira = 8;
        var ingressos_meia = 5;
        var valor_inteira = 30.0;
        var valor_meia = 15.0;

        var total_inteira = ingressos_inteira * valor_inteira;
        var total_meia = ingressos_meia * valor_meia; 
        var total_arrecadado = total_inteira + total_meia;  
        var media_arrecadada = total_arrecadado / (ingressos_inteira + ingressos_meia);
        System.out.println("Total arrecadado: " + total_arrecadado);
        System.out.println("Total da inteira: " + total_inteira);
        System.out.println("Total da meia: " + total_meia);
        System.out.println("Média arrecadada: " + media_arrecadada);
        
    }
}
