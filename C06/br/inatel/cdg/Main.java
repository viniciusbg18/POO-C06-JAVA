package br.inatel.cdg;

import br.inatel.cdg.inimigo.Asteroide;
import br.inatel.cdg.jogador.Nave;

public class Main {
    public static void main(String[] args){
        Asteroide a1 = new Asteroide("a1", "Grande");
        Asteroide a2 = new Asteroide("a2", "Pequeno");

        Nave nave = new Nave("Millenium Falcon", 3, "Explosivo");

        nave.atirar(a1);
        nave.atirar(a2);
    }
}
