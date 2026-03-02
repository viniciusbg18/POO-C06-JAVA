import java.util.Scanner;
public class linhas_importantes {
    public static void main(String[] args) {
        double pi = 3.1415;
        int piInteiro = (int) pi; // Convertendo o valor de pi para inteiro
        System.out.println("Valor de pi: " + pi);
        System.out.println("Valor de pi convertido para inteiro: " + piInteiro);
        System.out.println("-----------------------------------");
        double numero = 2;
        int numero1 = (int) numero; // Convertendo o valor de numero para inteiro
        System.out.println("Valor de numero: " + numero); 
        System.out.println("Valor de numero convertido para inteiro: " + numero1);
        int idade = 18;
        long idade1 = idade;//conversão por promoção 
        int idade2 = (int) idade1; //conversão por Casting, fazemos assim pois o tamanho do tipo long é maior que o tipo int, 
        // então precisamos fazer um cast para converter o valor de volta para int
        System.out.println("Valor de idade: " + idade);
        System.out.println("Valor de idade convertido para long: " + idade1);
        System.out.println("Valor de idade convertido para int: " + idade2);
        char letra = 'A';
        String letra1 = String.valueOf(letra); // Convertendo o valor de letra para String
        String letra2 = Character.toString(letra); // Outra forma de converter o valor de letra para String
        String letra3 = "" + letra; // Outra forma de converter o valor de letra para String 
        System.out.println("Valor de letra: " + letra);
        System.out.println("Valor de letra convertido para String: " + letra1);
        System.out.println("Valor de letra convertido para String: " + letra2);
        System.out.println("Valor de letra convertido para String: " + letra3);
        String faculdade = "INATEL";
        char primeiraLetra = faculdade.charAt(0); // Pegando a primeira letra da String faculdade
        char ultimaLetra = faculdade.charAt(faculdade.length() - 1); // Pegando a última letra da String faculdade
        System.out.println("Valor de faculdade: " + faculdade);
        System.out.println("Primeira letra da faculdade: " + primeiraLetra);
        System.out.println("Última letra da faculdade: " + ultimaLetra);
        System.out.print("Olá, Mundo!");
        System.out.println("Olá, Mundo!"); 
        System.out.printf("Olá, Mundo! %n"); // %n é usado para pular uma linha, assim como o \n,
        //  mas é mais recomendado usar o %n pois ele é mais portátil e funciona em qualquer sistema operacional, 
        // enquanto o \n pode não funcionar em alguns sistemas operacionais, como o Windows, que usa o \r\n para pular uma linha.

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idadeUsuario = teclado.nextInt(); // Lendo a idade do usuário

        System.out.println("Entre com o sua altura: ");
        double altura = teclado.nextDouble(); // Lendo o nome do usuário

        teclado.nextLine(); // Consumindo a quebra de linha deixada pelo nextDouble()

        System.out.println("Entre com o seu nome: ");
        String nome = teclado.nextLine(); // Lendo o nome do usuário

        System.out.printf("%d, %.2f, %s \n", idadeUsuario, altura, nome); // Imprimindo os valores lidos do usuário usando printf
        
        teclado.close(); // Fechando o Scanner para liberar os recursos
    }
}
