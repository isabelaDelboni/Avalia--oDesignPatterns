package Questao3_Observer;

public class Main {
    public static void main(String[] args) {
        //Crio tópicos de notícias
        TopicoNoticia politica = new TopicoNoticia("Política");
        TopicoNoticia esportes = new TopicoNoticia("Esportes");

        //Crio leitores
        Leitor leitor1 = new LeitorConcreto("Ana Flávia");
        Leitor leitor2 = new LeitorConcreto("Bruno Soares");
        Leitor leitor3 = new LeitorConcreto("Carlos Correa");

        //Leitores se inscrevem nos tópicos
        politica.adicionarLeitor(leitor1);
        politica.adicionarLeitor(leitor2);

        esportes.adicionarLeitor(leitor2);
        esportes.adicionarLeitor(leitor3);

        //Publico notícias
        politica.publicarNoticia("Nova lei aprovada no congresso!");
        esportes.publicarNoticia("Santos venceu o campeonato! Um milagre aconteceu!!");
    }
}

