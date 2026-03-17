package Ex_1;

public class Main {
    public static void main(String[] args) {
        Zumbi zumbi = new Zumbi();

        zumbi.Nome = "Ludwig van Beethoven";
        zumbi.ano_que_morreu = 1827;
        zumbi.pessoas_devoradas = 25;

        zumbi.ID();
        zumbi.recorde_de_almoco();

        Zumbi zumbi2 = new Zumbi();

        zumbi2.Nome = "Zacarias";
        zumbi2.ano_que_morreu = 1990;
        zumbi2.pessoas_devoradas = 15;

        zumbi2.ID();
        zumbi2.recorde_de_almoco();

        Zumbi zumbi3 = new Zumbi();

        zumbi3.Nome = "Neil Peart";
        zumbi3.ano_que_morreu = 2021;
        zumbi3.pessoas_devoradas = 9;

        zumbi3.ID();
        zumbi3.recorde_de_almoco();

        Zumbi zumbi4 = new Zumbi();

        zumbi4.Nome = "Marilyn Monroe";
        zumbi4.ano_que_morreu = 1962;
        zumbi4.pessoas_devoradas = 4;

        zumbi4.ID();
        zumbi4.recorde_de_almoco();
    } 
}
