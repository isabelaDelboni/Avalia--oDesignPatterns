package Questao2_AbstractFactory;

//Pagamento com cartão
public class PagamentoCartao implements Pagamento {
    @Override
    public void processar(double valor) {
        System.out.println("Processando pagamento no cartão: R$" + valor);
    }
}

