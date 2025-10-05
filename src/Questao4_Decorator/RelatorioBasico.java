package Questao4_Decorator;

//Implementação do relatório básico
public class RelatorioBasico implements Relatorio {
    @Override
    public void gerar() {
        System.out.println("Gerando relatório básico de pedidos...");
    }
}

