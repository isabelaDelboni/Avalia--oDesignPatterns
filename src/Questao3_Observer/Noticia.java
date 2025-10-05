package Questao3_Observer;

//Interface, qualquer tópico de notícia precisa implementar
//Aqui definimos os métodos para adicionar, remover e notificar leitores
public interface Noticia {
    void adicionarLeitor(Leitor leitor);
    void removerLeitor(Leitor leitor);
    void notificarLeitores(String mensagem);
}

