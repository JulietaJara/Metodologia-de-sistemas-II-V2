public class Main {
    public static void main(String[] args) {
        Huesped h = new Huesped("Ana", "Pérez", "ana@mail.com", "4111-1111-1111-1111");
        Reserva reserva = new Reserva(h, 150000);

        reserva.pagarCon(new TarjetaCreditoAdapter(new TarjetaCredito()));

        reserva.pagarCon(new BilleteraVirtualAdapter(new BilleteraVirtual()));
    }
}