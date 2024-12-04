package caixa;

public class Principal {
    public static void main(String[] args) {

        Carro carro1 = new Carro();
        carro1.cor = "Vermelho";
        carro1.modelo = "Fusca";
        carro1.velocidade = 0;

        carro1.andar();
        carro1.parar();
    }
}
