package Banco;

public class ContaBancaria {
    String titular;
    double saldo;
    
    public ContaBancaria(String titular, double saldoCC) {
        this.titular = titular;
        this.saldo = saldoCC;
    }
    
    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito de R$" + valor + " realizado com sucesso!");
    }
    
    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente para saque :(");
        }
    }
    
    public void consultarSaldo() {
        System.out.println("Saldo atual de " + titular + ": R$" + saldo);
    }
}
