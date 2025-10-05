package Questao3_Observer;

//Implementação concreta do leitor
public class LeitorConcreto implements Leitor {
    private String nome;

    public LeitorConcreto(String nome) {
        this.nome = nome;
    }

    @Override
    public void atualizar(String mensagem) {
        System.out.println(nome + " recebeu a notícia: " + mensagem);
    }
}

