package Questao2_AbstractFactory;

public class Main {
    public static void main(String[] args) {
        //Para demonstração, podemos escolher o método de pagamento
        //Pode ser "CARTAO", "BOLETO" ou "PIX"
        String metodoEscolhido = "CARTAO";

        //Criação do objeto de pagamento baseado na escolha
        Pagamento pagamento;

        switch (metodoEscolhido) {
            case "CARTAO":
                pagamento = new PagamentoCartao();
                break;
            case "BOLETO":
                pagamento = new PagamentoBoleto();
                break;
            case "PIX":
                pagamento = new PagamentoPix();
                break;
            default:
                throw new IllegalArgumentException("Meio de pagamento desconhecido: " + metodoEscolhido);
        }

        //Agora podemos processar o pagamento
        pagamento.processar(199.99);
    }
}
