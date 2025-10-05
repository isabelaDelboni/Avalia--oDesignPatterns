package Questao2_AbstractFactory;

//Pagamento via boleto
public class PagamentoBoleto implements Pagamento {
    @Override
    public void processar(double valor) {
        System.out.println("Gerando boleto no valor de: R$" + valor + ". Favor não atrasar!");
    }
}

