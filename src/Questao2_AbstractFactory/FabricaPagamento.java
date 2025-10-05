package Questao2_AbstractFactory;

//Fábrica abstrata, define o método que todas as fábricas concretas devem implementar
//Essa classe representa a ideia de "criar um pagamento" sem dizer qual é
public abstract class FabricaPagamento {
    public abstract Pagamento criarPagamento();
}
