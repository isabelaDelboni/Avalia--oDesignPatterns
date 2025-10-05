package Questao2_AbstractFactory;

//Fábrica concreta para cartão
public class CartaoFactory extends FabricaPagamento {
    @Override
    public Pagamento criarPagamento() {
        return new PagamentoCartao();
    }
}