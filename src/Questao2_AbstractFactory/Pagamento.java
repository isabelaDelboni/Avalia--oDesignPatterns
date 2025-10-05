package Questao2_AbstractFactory;

//Interface que todos os pagamentos vão implementar
//Aqui eu só defino o que todo pagamento precisa ter
public interface Pagamento {
    void processar(double valor);
}

