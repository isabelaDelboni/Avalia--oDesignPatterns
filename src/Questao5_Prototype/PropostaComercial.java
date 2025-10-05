package Questao5_Prototype;

//Documento Proposta Comercial
public class PropostaComercial implements Documento {
    private String cliente;
    private String cor;
    private String fonte;

    public PropostaComercial(String cliente, String cor, String fonte) {
        this.cliente = cliente;
        this.cor = cor;
        this.fonte = fonte;
    }

    //Clonagem de documento
    @Override
    public Documento clonar() {
        return new PropostaComercial(this.cliente, this.cor, this.fonte);
    }

    @Override
    public void exibir() {
        System.out.println("Proposta Comercial para: " + cliente);
        System.out.println("Cor: " + cor + ", Fonte: " + fonte);
    }

    //Métodos para personalização
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setFonte(String fonte) {
        this.fonte = fonte;
    }
}

