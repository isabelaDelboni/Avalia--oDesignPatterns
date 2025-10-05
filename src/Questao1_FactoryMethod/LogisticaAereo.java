package Questao1_FactoryMethod;

public class LogisticaAereo extends EmpresaLogistica {
    @Override
    public Transporte criarTransporte() {
        return new TransporteAereo();
    }
}
