public abstract class Operacion {         
    protected double monto;
    protected Cuenta cuenta;

    public Operacion(double monto, Cuenta cuenta) {
        this.monto = monto;
        this.cuenta = cuenta;
    }

    public abstract void ejecutar();      

    protected boolean validarMonto() {
        return monto > 0;                    
    }
}