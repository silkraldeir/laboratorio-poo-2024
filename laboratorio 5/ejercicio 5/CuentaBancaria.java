class CuentaBancaria {
    protected double saldo;

    public CuentaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    // El método ahora puede lanzar ambas excepciones
    public void retirar(double cantidad) throws SaldoInsuficienteException, LimiteSobregiroExcedidoException {
        if (cantidad > saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente para retirar " + cantidad);
        }
        saldo -= cantidad;
    }

    public double getSaldo() {
        return saldo;
    }
}
