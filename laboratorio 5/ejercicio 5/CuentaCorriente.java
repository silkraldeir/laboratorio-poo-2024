class CuentaCorriente extends CuentaBancaria {
    private double limiteSobregiro;

    public CuentaCorriente(double saldoInicial, double limiteSobregiro) {
        super(saldoInicial);
        this.limiteSobregiro = limiteSobregiro;
    }

    @Override
    public void retirar(double cantidad) throws SaldoInsuficienteException, LimiteSobregiroExcedidoException {
        if (cantidad > saldo + limiteSobregiro) {
            throw new LimiteSobregiroExcedidoException("Límite de sobregiro excedido.");
        }
        saldo -= cantidad;
    }
}
