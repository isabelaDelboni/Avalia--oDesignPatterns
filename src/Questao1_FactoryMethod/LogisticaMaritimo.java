package Questao1_FactoryMethod;

public class LogisticaMaritimo extends EmpresaLogistica {
    @Override
    public Transporte criarTransporte() {
        return new TransporteMaritimo();
    }
}
