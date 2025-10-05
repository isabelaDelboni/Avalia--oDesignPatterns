package Questao1_FactoryMethod;

//Implementação para transporte aéreo
//Cobra por peso.
public class TransporteAereo implements Transporte {
    @Override
    public double calcularTarifa(double distancia, double peso) {
        double taxa = peso * 2.8;
        double adicional = distancia * 0.1; //Combustível e manutenção
        return taxa + adicional;
    }

    @Override
    public String descricao() {
        return "Transporte Aéreo voando alto";
    }
}

