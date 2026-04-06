package Exemplo_1_Aula5;

public class Banda {
    public String nome;
    public String genero;
    public Membro [] membros = new Membro[100];
    public Musica[] musicas  = new Musica[100];
    public Empresario empresario;

    public void mostraInfo(){
        System.out.println("Nome da banda: " + this.nome);
        System.out.println("Gênero da banda: " + this.genero);

        if (this.empresario ==null)
            System.out.println("Empresário: " + this.empresario.nome);
    }

    public void addMusicaNova(Musica musica){
        for (int i = 0; i < this.musicas.length; i++){
            if(this.musicas[i] != null){
                System.out.println(this.musicas[i].nome);
            }
        }
    }

    public void addMembroNovo(Membro membro){
        for (int i = 0; i < this.musicas.length; i++){
            if(this.membros[i] != null){
                System.out.println(this.membros[i].nome);
            }
        }
    }

    public void addEmpresario(Empresario empresario){
        this.empresario = empresario;
    }
}
