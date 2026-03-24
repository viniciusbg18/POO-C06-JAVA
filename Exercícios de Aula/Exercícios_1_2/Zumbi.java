package Exercícios_1_2;

public class Zumbi {
    public String Nome;
    public double vida;
    public int pessoas_devoradas;
    public int ano_que_morreu;

    public void recorde_de_almoco(){
        if(pessoas_devoradas < 5){
            System.out.println("Ihhhh... Relaxa, esse zumbi é mongolóide");
        }else if(pessoas_devoradas >= 5 && pessoas_devoradas < 10){
            System.out.println("Esse aí só come quem é bobo e não tem amor a vida");
        }else if(pessoas_devoradas >= 10 && pessoas_devoradas < 20){
            System.out.println("Não dorme no ponto que você pode conhecer a dolores, virar estampa de camisa, atividade pra não virar saudade, né segredo");
        }else
            System.out.println("SALVEM-SE QUEM PUDER ESSE ZUMBI É O MR CATRA F****");
    }

    public void ID(){
        System.out.println("Aqui jáz " + Nome + " que morreu em " + ano_que_morreu);
    }

    public void atacar(){
        System.out.println("CÉREBROOOOOO");
    }

    public void resmungar(){
        System.out.println("VOLTA AQUI GRRRRRR (fiadamae foge não cacilda)");
    }

    public double mostraVida(){
        return this.vida;
    }

    public void transfereVida (Zumbi zumbiAlvo, double quantia){
        if (zumbiAlvo.vida > quantia)
            this.vida += quantia;

        
        else{
            zumbiAlvo.vida -= quantia;
        }
    }

}
