package Questao2_AbstractFactory;

//Fábrica concreta para boleto
public class BoletoFactory extends FabricaPagamento {
    @Override
    public Pagamento criarPagamento() {
        return new PagamentoBoleto();
    }
}
