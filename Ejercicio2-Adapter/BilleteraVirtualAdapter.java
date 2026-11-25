public class BilleteraVirtualAdapter implements MedioPago {
    private final BilleteraVirtual billetera;

    public BilleteraVirtualAdapter(BilleteraVirtual billetera) {
        this.billetera = billetera;
    }

    @Override
    public void pagar(Huesped huesped, double monto) {
        billetera.pagar(huesped.getEmail(), monto);
    }
}