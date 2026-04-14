package br.inatel.notas;

public class Aluno {
    String nome;
    String matricula;
    double nota;

    public Aluno(String nome, String matricula, double nota) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota = nota;
    }

    public double getNota() {
        return nota;
    }

    public String getNome() {
        return nome;
    }
}