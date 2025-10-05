package Questao4_Decorator;

//Classe abstrata decoradora
//Recebe um relatório e pode adicionar funcionalidades extras
public abstract class RelatorioDecorator implements Relatorio {
    protected Relatorio relatorio; //O relatório que está sendo decorado

    public RelatorioDecorator(Relatorio relatorio) {
        this.relatorio = relatorio;
    }

    @Override
    public void gerar() {
        relatorio.gerar(); 
    }
}

