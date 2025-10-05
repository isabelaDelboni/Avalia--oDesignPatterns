package Questao1_FactoryMethod;

public class LogisticaTerrestre extends EmpresaLogistica {
    @Override
    public Transporte criarTransporte() {
        return new TransporteTerrestre();
    }
}
