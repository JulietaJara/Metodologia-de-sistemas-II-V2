public class Transferencia extends Operacion {
    private Cuenta cuentaDestino;                                  

    public Transferencia(double monto, Cuenta origen, Cuenta destino) {
        super(monto, origen);                                               
        this.cuentaDestino = destino;                                 
    }

    @Override
    public void ejecutar() {
        if (!cuenta.tieneSaldoSuficiente(monto)) {         
            System.out.println("No tiene suficiente saldo");         
        } else if (!validarMonto()){
            System.out.println("Importe inválido");             
        } else {
            cuenta.debitar(monto);
            cuentaDestino.acreditar(monto);
            System.out.println("Transferencia de $" + monto + " realizada.");
        }
        
    }
}

