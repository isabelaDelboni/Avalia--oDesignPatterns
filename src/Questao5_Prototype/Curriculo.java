package Questao5_Prototype;

//Documento Currículo
public class Curriculo implements Documento {
    private String nomeCliente;
    private String cor;
    private String fonte;

    public Curriculo(String nomeCliente, String cor, String fonte) {
        this.nomeCliente = nomeCliente;
        this.cor = cor;
        this.fonte = fonte;
    }

    //Clonagem do documento
    @Override
    public Documento clonar() {
        return new Curriculo(this.nomeCliente, this.cor, this.fonte);
    }

    @Override
    public void exibir() {
        System.out.println("Currículo de: " + nomeCliente);
        System.out.println("Cor: " + cor + ", Fonte: " + fonte);
    }

    //Métodos para personalização
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setFonte(String fonte) {
        this.fonte = fonte;
    }
}

