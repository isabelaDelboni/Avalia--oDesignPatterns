package Questao1_FactoryMethod;

//Classe abstrata que define a ideia da empresa
// Essa é a essência do Factory Method.
public abstract class EmpresaLogistica {

    //Método fábrica, quem herda decide o tipo de transporte
    public abstract Transporte criarTransporte();

   //Método genérico, a empresa processa a entrega
    public void processarEntrega(double distancia, double peso) {
        Transporte transporte = criarTransporte();
        System.out.println("Tipo escolhido: " + transporte.descricao());

        double valor = transporte.calcularTarifa(distancia, peso);
        System.out.printf("Tarifa final: R$ %.2f%n%n", valor);
    }
    

}
