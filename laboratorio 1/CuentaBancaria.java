public class CuentaBancaria {
    private double saldo;

    public CuentaBancaria(double saldoInicial) {
        saldo = saldoInicial;
    }

    public void depositar(double monto) {
        saldo += monto;
        System.out.println("Depósito realizado. Saldo actual: " + saldo);
    }

    public void retirar(double monto) {
        if (monto <= saldo) {
            saldo -= monto;
            System.out.println("Retiro realizado. Saldo actual: " + saldo);
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public double consultarSaldo() {
        return saldo;
    }
}