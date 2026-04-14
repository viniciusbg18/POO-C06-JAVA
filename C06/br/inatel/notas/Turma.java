package br.inatel.notas;

import java.util.ArrayList;

public class Turma {
    ArrayList<Aluno> alunos = new ArrayList<>();

    public void adicionarAluno(Aluno a) {
        alunos.add(a);
    }

    public void listarAlunos() {
        for (Aluno a : alunos) {
            System.out.println(a.getNome() + " - Nota: " + a.getNota());
        }
    }

    public Aluno buscarMelhorAluno() {
        Aluno melhor = alunos.get(0);

        for (Aluno a : alunos) {
            if (a.getNota() > melhor.getNota()) {
                melhor = a;
            }
        }

        return melhor;
    }
}