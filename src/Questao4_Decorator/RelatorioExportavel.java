package Questao4_Decorator;

//Decorador que permite exportar o relatório
public class RelatorioExportavel extends RelatorioDecorator {

    public RelatorioExportavel(Relatorio relatorio) {
        super(relatorio);
    }

    @Override
    public void gerar() {
        super.gerar();
        System.out.println("Exportando relatório em PDF");
    }
}

