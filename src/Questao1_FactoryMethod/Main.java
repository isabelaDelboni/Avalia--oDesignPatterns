package Questao1_FactoryMethod;

//Programa principal
//Cada tipo de logística cria seu transporte automaticamente
public class Main {
    public static void main(String[] args) {

        //Simula três tipos de empresas, cada uma usando seu transporte
        EmpresaLogistica terrestre = new LogisticaTerrestre();
        EmpresaLogistica aereo = new LogisticaAereo();
        EmpresaLogistica maritimo = new LogisticaMaritimo();

        System.out.println("--- Simulação de Entregas ---\n");

        terrestre.processarEntrega(200, 30);
        aereo.processarEntrega(800, 10);
        maritimo.processarEntrega(3000, 200);
    }
}

