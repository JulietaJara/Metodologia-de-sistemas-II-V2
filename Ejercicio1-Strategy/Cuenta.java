public class Cuenta {
    private double saldo;

    public Cuenta(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void acreditar(double monto) {
        saldo += monto;         
    }

    public void debitar(double monto) {
        saldo -= monto;
    }

    public boolean tieneSaldoSuficiente(double monto) {
        return saldo >= monto;           
    }

    public double obtenerSaldo() {
        return saldo;         
    }
}