package Questao4_Decorator;

//Decorador que adiciona gráficos ao relatório
public class RelatorioComGrafico extends RelatorioDecorator {

    public RelatorioComGrafico(Relatorio relatorio) {
        super(relatorio);
    }

    @Override
    public void gerar() {
        super.gerar();
        System.out.println("Gerando gráficos de vendas...");
    }
}

