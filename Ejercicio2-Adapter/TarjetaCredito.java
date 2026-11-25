public class TarjetaCredito {
    public boolean validarLimite(String numeroTarjeta, double monto) {
        System.out.println("Validando límite de la tarjeta " + numeroTarjeta);
        return monto <= 500000; 
    }

    public void autorizarCargo(String numeroTarjeta, double monto) {
        System.out.println("Cargo autorizado en tarjeta " + numeroTarjeta + " por $" + monto);
    }
}