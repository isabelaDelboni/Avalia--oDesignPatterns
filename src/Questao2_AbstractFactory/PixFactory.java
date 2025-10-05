package Questao2_AbstractFactory;

//Fábrica concreta para PIX
public class PixFactory extends FabricaPagamento {
    @Override
    public Pagamento criarPagamento() {
        return new PagamentoPix();
    }
}