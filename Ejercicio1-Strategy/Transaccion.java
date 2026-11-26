public class Transaccion {
    private Operacion operacion;                       

    public void cambiarOperacion(Operacion operacion) {
        this.operacion = operacion;
    }

    public void confirmar() {
        if (operacion == null) {                       
            System.out.println("No elegiste ninguna operación");
        } else {
            operacion.ejecutar();                          
        }
    }
}