package Banco;

public class Principal {
    public static void main(String[] args) {

        ContaBancaria conta1 = new ContaBancaria("Maria", 1500);

        conta1.consultarSaldo();
        conta1.depositar(300);
        conta1.sacar(150);
        conta1.consultarSaldo();
    }
}
