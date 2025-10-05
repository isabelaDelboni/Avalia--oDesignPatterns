package Questao4_Decorator;

//Decorador que adiciona estatísticas ao relatório
public class RelatorioComEstatistica extends RelatorioDecorator {

    public RelatorioComEstatistica(Relatorio relatorio) {
        super(relatorio);
    }

    @Override
    public void gerar() {
        super.gerar(); //Chama o relatório anterior
        System.out.println("Calculando e adicionando estatísticas de faturamento...");
    }
}
