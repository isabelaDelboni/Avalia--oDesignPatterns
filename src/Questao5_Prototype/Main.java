package Questao5_Prototype;

public class Main {
    public static void main(String[] args) {
        //Documento de exemplo
        Curriculo curriculoBase = new Curriculo("Cliente Base", "Preto", "ArialBlack");

        //Clonando para um novo cliente
        Curriculo curriculoNovo = (Curriculo) curriculoBase.clonar();
        curriculoNovo.setNomeCliente("Isabela Delboni");
        curriculoNovo.setCor("Vermelho");
        curriculoNovo.setFonte("Times New Roman");

        //Exibindo os documentos
        System.out.println("Documento original:");
        curriculoBase.exibir();

        System.out.println("\nDocumento clonado e personalizado:");
        curriculoNovo.exibir();
    }
}

