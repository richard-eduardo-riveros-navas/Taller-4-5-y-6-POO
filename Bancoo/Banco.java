package Bancoo;

public class Banco {
    private double saldo;

    public Banco(double saldo) {
            this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double monto) {
        if (monto > 0) {
            this.saldo += monto;
        } else {
            System.out.println("El monto a depositar debe ser mayor a cero.");
        }
    }

    public void retirar(double monto) {
        if (monto > 0 && monto <= this.saldo) {
            this.saldo -= monto;
        } else {
            System.out.println("Fondos insuficientes o monto inválido.");
        }
    }
}
