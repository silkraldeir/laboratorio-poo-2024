public class Main {
    public static void main(String[] args) {
        try {
            CuentaBancaria cuenta = new CuentaBancaria(500);
            System.out.println("Saldo inicial en cuenta bancaria: " + cuenta.getSaldo());
            cuenta.retirar(600); // Esto lanzará SaldoInsuficienteException
        } catch (SaldoInsuficienteException | LimiteSobregiroExcedidoException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("----");

        try {
            CuentaCorriente cuentaCorriente = new CuentaCorriente(500, 200);
            System.out.println("Saldo inicial en cuenta corriente: " + cuentaCorriente.getSaldo());
            cuentaCorriente.retirar(800); // Retiro exitoso dentro del límite de sobregiro
            System.out.println("Retiro exitoso. Saldo actual: " + cuentaCorriente.getSaldo());
            cuentaCorriente.retirar(900); // Esto lanzará LimiteSobregiroExcedidoException
        } catch (SaldoInsuficienteException | LimiteSobregiroExcedidoException e) {
            System.out.println(e.getMessage());
        }
    }
}
