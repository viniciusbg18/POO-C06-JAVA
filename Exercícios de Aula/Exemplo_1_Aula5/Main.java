package Exemplo_1_Aula5;

public class Main {
    public static void main(String[] args) {
        Banda banda = new Banda();
        banda.nome = "Jovens Homens";
        banda.genero = "Sim";

        Musica musica1 = new Musica();
        musica1.nome = "Porra Scooby Doo"; 

        Membro membro1 = new Membro();
        membro1.nome = "Zeca 'Dry - Dick' Teixeira";
        
        Membro membro2 = new Membro();
        membro2.nome = "João 'Little Kiss' Selim";

        Membro membro3 = new Membro();
        membro1.nome = "Vini 'Bibble' Godoy";

        Empresario empresario = new Empresario();
        empresario.nome = "Giovanna Cabral";

        banda.addEmpresario(empresario);
        banda.addMembroNovo(membro1);
        banda.addMembroNovo(membro2);
        banda.addMembroNovo(membro3);
        banda.addMusicaNova(musica1);
        
        banda.mostraInfo();
    }
}
