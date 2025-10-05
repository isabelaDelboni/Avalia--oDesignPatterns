package Questao1_FactoryMethod;

//Implementação para transporte terrestre
//Cobra por quilômetro rodado
public class TransporteTerrestre implements Transporte {
    @Override
    public double calcularTarifa(double distancia, double peso) {
        double base = 15; //Custo fixo só pra ligar o motor
        return base + (distancia * 0.45);
    }

    @Override
    public String descricao() {
        return "Transporte Terrestre circulando...  ";
    }
}


