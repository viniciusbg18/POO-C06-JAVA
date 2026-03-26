package Introdução_POO.Banco;

public class Cliente {
    private String nome;
    private String cpf;

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setCPF(String cpf){
        this.cpf = cpf;
    }

    public String getNome(){
        return this.nome;
    }

    public String getCPF(){
        return this.cpf;
    }
}
