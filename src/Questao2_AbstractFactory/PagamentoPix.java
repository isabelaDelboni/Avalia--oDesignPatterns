package Questao2_AbstractFactory;

//Pagamento via PIX
public class PagamentoPix implements Pagamento {
    @Override
    public void processar(double valor) {
        System.out.println("Transferência PIX de: R$" + valor + " está sendo feita!");
    }
}

