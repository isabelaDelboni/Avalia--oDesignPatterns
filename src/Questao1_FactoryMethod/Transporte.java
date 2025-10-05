package Questao1_FactoryMethod;

//Interface que define o comportamento comum de todos os tipos de transporte
//Todo transporte precisa saber calcular quanto custa levar algo
public interface Transporte {
    double calcularTarifa(double distancia, double peso);
    String descricao();
}
