public class Main {
    public static void main(String[] args) {
        Cuenta cuentaA = new Cuenta(200000);
        Cuenta cuentaB = new Cuenta(30000);

        Transaccion transaccion = new Transaccion();

        transaccion.cambiarOperacion(new Deposito(100, cuentaA));

        transaccion.cambiarOperacion(new Transferencia(10000, cuentaA, cuentaB));

        transaccion.confirmar();

        System.out.println("Saldo cuentaA: $" + cuentaA.obtenerSaldo() + " - Saldo cuentaB: $" + cuentaB.obtenerSaldo());
    }
}