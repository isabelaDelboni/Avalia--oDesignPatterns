package Questao4_Decorator;

public class Main {
    public static void main(String[] args) {
        //Relatório básico
        Relatorio relatorio = new RelatorioBasico();

        //Decorando com estatísticas
        relatorio = new RelatorioComEstatistica(relatorio);

        //Decorando com gráficos
        relatorio = new RelatorioComGrafico(relatorio);

        //Decorando com exportação
        relatorio = new RelatorioExportavel(relatorio);

        //Gerar relatório final
        relatorio.gerar();
    }
}

