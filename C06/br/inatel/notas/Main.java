package br.inatel.notas;

public class Main {
    public static void main(String[] args) {

        Turma turma = new Turma();

        Aluno a1 = new Aluno("Ana", "001", 8.5);
        Aluno a2 = new Aluno("Bruno", "002", 7.0);
        Aluno a3 = new Aluno("Carlos", "003", 9.2);

        turma.adicionarAluno(a1);
        turma.adicionarAluno(a2);
        turma.adicionarAluno(a3);

        turma.listarAlunos();

        Aluno melhor = turma.buscarMelhorAluno();
        System.out.println("Melhor aluno: " + melhor.getNome() +
                " - Média: " + melhor.getNota());
    }
}