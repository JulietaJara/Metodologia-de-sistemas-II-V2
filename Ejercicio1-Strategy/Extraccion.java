public class Extraccion extends Operacion {        

    public Extraccion(double monto, Cuenta cuenta) {
        super(monto, cuenta);                   
    }

    @Override
    public void ejecutar() {
        if (!cuenta.tieneSaldoSuficiente(monto)) {         
            System.out.println("No tiene suficiente saldo");         
        } else if (!validarMonto()){
            System.out.println("Importe inválido");             
        } else {
            cuenta.debitar(monto);                             
            System.out.println("Se debitó $" + monto + ". Saldo actual: $" + cuenta.obtenerSaldo());          
        }
    }
}
