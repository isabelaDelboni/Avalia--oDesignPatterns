package Questao5_Prototype;

//Interface que define o método de clonagem
//Todo documento precisa ser capaz de criar uma cópia de si mesmo
public interface Documento extends Cloneable {
    Documento clonar(); //Retorna uma cópia do documento
    void exibir();
}
