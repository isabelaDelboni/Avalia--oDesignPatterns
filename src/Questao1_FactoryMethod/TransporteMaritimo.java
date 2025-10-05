package Questao1_FactoryMethod;

//Implementação para transporte marítimo
// Custo baseado em peso e um pouco com distância.
public class TransporteMaritimo implements Transporte {
    @Override
    public double calcularTarifa(double distancia, double peso) {
        double tarifa = (peso * 0.9) + (distancia * 0.25);
        // Pequeno desconto pra longas distâncias (efeito escala)
        if (distancia > 1000) tarifa *= 0.85;
        return tarifa;
    }

    @Override
    public String descricao() {
        return "Transporte Marítimo navegando mares";
    }
}
