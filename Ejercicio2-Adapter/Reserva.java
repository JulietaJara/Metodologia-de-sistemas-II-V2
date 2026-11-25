public class Reserva {
    private final Huesped huesped;
    private final double montoTotal;

    public Reserva(Huesped huesped, double montoTotal) {
        this.huesped = huesped;
        this.montoTotal = montoTotal;
    }

    public void pagarCon(MedioPago medio) {
        medio.pagar(huesped, montoTotal);
    }
}