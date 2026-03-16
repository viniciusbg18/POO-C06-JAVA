package Introdução_POO;

public class Main {
    public static void main(String[] args) {
        Pessoa Arismar = new Pessoa();
        
        Arismar.nome = "Arismar Cerqueira Sodré Junior";
        Arismar.idade = 48;

        Arismar.falar();

        Professor Calculo = new Professor();
        Calculo.nome = "Luiz Felipe";
        Calculo.idade = 58;
        Calculo.disciplina = "Calculo III";
        Calculo.falar();
        Calculo.ministraAula();

        Engenheiro Eng = new Engenheiro();
        Eng.categoria = "Civil";
        Eng.idade = 20;
        Eng.nome = "Vinícius Godoy";
        Eng.disciplina = "Resistência de Materiais";
        Eng.falar();
        Eng.ministraAula();
        Eng.constroi();
    }
}
