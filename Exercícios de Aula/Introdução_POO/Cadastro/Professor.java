package Introdução_POO.Cadastro;

public class Professor extends Pessoa{

    String disciplina; 

    void ministraAula(){
        System.out.println("Aula de " + disciplina);
    }
}
