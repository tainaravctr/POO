package caixa;

public class Carro {
    String cor;
    String modelo;
    int velocidade;

    public void andar() {
        velocidade = 60;
        System.out.println("O " + modelo + " está andando a " + velocidade + " km/h :)");
    }

    public void parar() {
        velocidade = 0;
        System.out.println("O " + modelo + " parou :(");
    }
}


