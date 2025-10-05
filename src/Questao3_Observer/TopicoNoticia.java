package Questao3_Observer;

import java.util.ArrayList;
import java.util.List;

//Classe concreta que representa um tópico de notícias
public class TopicoNoticia implements Noticia {
    private String nome;
    private List<Leitor> leitores;

    public TopicoNoticia(String nome) {
        this.nome = nome;
        this.leitores = new ArrayList<>();
    }

    @Override
    public void adicionarLeitor(Leitor leitor) {
        leitores.add(leitor);
    }

    @Override
    public void removerLeitor(Leitor leitor) {
        leitores.remove(leitor);
    }

    @Override
    public void notificarLeitores(String mensagem) {
        //Percorre todos os leitores e envia a notificação
        for (Leitor l : leitores) {
            l.atualizar(mensagem);
        }
    }

    //Método para publicar notícia
    public void publicarNoticia(String conteudo) {
        System.out.println("Nova notícia no tópico " + nome + ": " + conteudo + ". Veja já!");
        notificarLeitores(conteudo);
    }
}

