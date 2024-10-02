public class Empleado {
    private String nombre;
    private String idEmpleado;
    private CuentaBancaria cuenta;

    public Empleado(String nombre, String idEmpleado, double saldoInicial) {
        this.nombre = nombre;
        this.idEmpleado = idEmpleado;
        this.cuenta = new CuentaBancaria(saldoInicial);
    }

    public void mostrarDetalles() {
        System.out.println("Empleado: " + nombre);
        System.out.println("ID de empleado: " + idEmpleado);
        System.out.println("Saldo actual en cuenta: " + cuenta.consultarSaldo());
    }

    public void depositar(double monto) {
        cuenta.depositar(monto);
    }

    public void retirar(double monto) {
        cuenta.retirar(monto);
    }

    public CuentaBancaria getCuenta() {
        return cuenta;
    }
}