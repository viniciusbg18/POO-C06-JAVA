package Exercicio_0;

public class Main {
    public static void main(String[] args) {
        Cantina cantina_do_Inatel = new Cantina();

        Salgado salgado = new Salgado();
        Salgado salgado2 = new Salgado();
        Salgado salgado3 = new Salgado();

        cantina_do_Inatel.nome = "Cantina do Inatel";

        salgado.nome = "Esfiha";
        salgado2.nome = "Joelho";
        salgado3.nome = "Cigarrete";

        cantina_do_Inatel.addSalgado(salgado);
        cantina_do_Inatel.addSalgado(salgado2);
        cantina_do_Inatel.addSalgado(salgado3);

        cantina_do_Inatel.mostraInfo();

    }
}
