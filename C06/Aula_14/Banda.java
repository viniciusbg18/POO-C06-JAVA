package Aula_14;

public class Banda {
    private String nome;
    private String genero;
    private Membro[] membros = new Membro[20];
    private Musica[] musica = new Musica[200];
    private Empresario empresario;

    public Banda(String nome, String genero){
        this.nome = nome;
        this.genero = genero;
    }

    public void mostraInfo(){
        System.out.println(this.nome);
        System.out.println(this.genero);

        /*for(Membro m: membros){
            if(m != null)
                System.out.println(m.getNome());
        }
        System.out.println();
        for(Musica mu: musicas)*/
    }

   /*  public void addMusicanova(Musica musica){
        for(int i = 0; i < this.musica.length; i++){
            if(musica[i] == null){
                musica[i] = musica;
                break;
            }
        }
    }

    public void addMembroNovo(Membro membro){
        for (int i = 0; i < this.membros.length; i++){
            if (membros[i] == null){
                membros[i] =
            }
        }
    }*/
}
