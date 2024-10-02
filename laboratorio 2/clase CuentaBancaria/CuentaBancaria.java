public class CuentaBancaria {
    public String numeroCuenta;
    private double saldo;
    protected String titular;

    // Constructor
    public CuentaBancaria(String numeroCuenta, double saldo, String titular) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.titular = titular;
    }

    // Método para depositar dinero
    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
        }
    }

    // Método para retirar dinero
    public boolean retirar(double cantidad) {
        if (cantidad > 0 && saldo - cantidad >= 0) {
            saldo -= cantidad;
            return true;
        } else {
            System.out.println("Fondos insuficientes o cantidad inválida.");
            return false;
        }
    }

    // Getter para el saldo
    public double getSaldo() {
        return saldo;
    }

    // Método main para probar la clase CuentaBancaria
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("1234567890", 1000.0, "Carlos Perez");
        System.out.println("Saldo inicial: " + cuenta.getSaldo());
        cuenta.depositar(500.0);
        System.out.println("Saldo después de depósito: " + cuenta.getSaldo());
        if (cuenta.retirar(200.0)) {
            System.out.println("Saldo después de retiro: " + cuenta.getSaldo());
        }

        if (!cuenta.retirar(2000.0)) {
            System.out.println("No se pudo retirar más dinero del saldo disponible.");
        }
    }
}
