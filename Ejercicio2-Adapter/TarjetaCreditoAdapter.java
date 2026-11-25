public class TarjetaCreditoAdapter implements MedioPago {
    private final TarjetaCredito tarjeta;

    public TarjetaCreditoAdapter(TarjetaCredito tarjeta) {
        this.tarjeta = tarjeta;
    }

    @Override
    public void pagar(Huesped huesped, double monto) {
        String numero = huesped.getNumeroTarjeta();
        if (!tarjeta.validarLimite(numero, monto)) {
            throw new IllegalStateException("Límite insuficiente en la tarjeta");
        }
        tarjeta.autorizarCargo(numero, monto);
    }
}