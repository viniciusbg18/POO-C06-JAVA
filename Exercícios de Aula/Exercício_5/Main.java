package Exercício_5;

public class Main {
    public static void main(String[] args) {
        Personagem personagem = new Personagem();
        personagem.nome = "Palmirinha";
        personagem.pontos = 10000;

        Arma arma = new Arma();
        arma.nome = "Colher de pau";
        arma.resistencia = 10;

        personagem.arma = arma;

        System.out.println("Personagem: " + personagem.nome);
        System.out.println("Pontos: " + personagem.pontos);
        System.out.println("Resistência: " + personagem.arma.resistencia);

        System.out.println("---------------------");
        
    }
    

}
