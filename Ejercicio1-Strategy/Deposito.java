public class Deposito extends Operacion {        

    public Deposito(double monto, Cuenta cuenta) {
        super(monto, cuenta);                   
    }

    @Override
    public void ejecutar() {
        if (validarMonto()) {                           
            cuenta.acreditar(monto);                             
            System.out.println("Depósito de $" + monto + " realizado. Saldo actual: $" + cuenta.obtenerSaldo());          
        } else {
            System.out.println("Importe inválido");         
        }
    }
}