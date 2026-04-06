package Exercício_6;

public class Kart {
    public String nome;
    public Piloto piloto;
    public Motor motor;

    public Kart(){
        Motor motor = new Motor();

        motor.cilindradas = "50";
        motor.velociadademaxima = 100;

        motor.mostraInfo();
    }
    public void pular(){
        System.out.println("Kart ta voando viado");
    }

    public void soltarTurbo(){
        System.out.println("OIA O TUURBOOOOOOO");
    }

    public void fazerDrift(){
        System.out.println("VRRRROOOOOOOOMMMMMMM");
    }
}
